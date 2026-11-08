/*
Salcedo Alvarez Hugo Emmanuel
Morales Escobar Juan Adrian
 */
package front_end;

import Nodos.Arista;
import Nodos.Vertice;
import back_end.GrafoPonderado;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JPanel;


public class PanelGrafo extends JPanel {

    private static final int RADIO_NODO = 22;
    private GrafoPonderado grafo;

    public PanelGrafo() {
        setBackground(Color.WHITE);
    }

    public void setGrafo(GrafoPonderado grafo) {
        this.grafo = grafo;
        revalidate();
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        int n = (grafo == null) ? 0 : grafo.getNumVertices();
        return new Dimension(Math.max(520, 50 * n), Math.max(330, 40 * n));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        if (grafo == null) {
            mensaje(g2, "Pulse «Crear Grafo» para comenzar.");
        } else if (grafo.isEmpty()) {
            mensaje(g2, "El grafo está vacío.");
        } else {
            dibujar(g2);
        }
        g2.dispose();
    }

    private void mensaje(Graphics2D g2, String texto) {
        g2.setColor(Color.GRAY);
        FontMetrics fm = g2.getFontMetrics();
        g2.drawString(texto, (getWidth() - fm.stringWidth(texto)) / 2, getHeight() / 2);
    }

    private void dibujar(Graphics2D g2) {
        List<Vertice> vertices = grafo.getVertices();
        int n = vertices.size();
        double cx = getWidth() / 2.0;
        double cy = getHeight() / 2.0;
        double radio = Math.max(0, Math.min(cx, cy) - RADIO_NODO - 28);
        Map<String, Point2D> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            double ang = -Math.PI / 2 + 2 * Math.PI * i / n;
            double x = (n == 1) ? cx : cx + radio * Math.cos(ang);
            double y = (n == 1) ? cy : cy + radio * Math.sin(ang);
            pos.put(vertices.get(i).getId(), new Point2D.Double(x, y));
        }

        Map<String, Double> pesos = new HashMap<>();
        for (Arista a : grafo.getAristas()) {
            pesos.put(a.origen() + "\u0000" + a.destino(), a.peso());
        }

        g2.setStroke(new BasicStroke(1.6f));
        for (Arista a : grafo.getAristas()) {
            Double inverso = pesos.get(a.destino() + "\u0000" + a.origen());
            boolean bidireccional = inverso != null && inverso == a.peso();
            if (bidireccional && a.origen().compareTo(a.destino()) > 0) {
                continue; // se dibuja una sola vez
            }
            boolean opuestoDistinto = inverso != null && !bidireccional;
            dibujarArista(g2, pos.get(a.origen()), pos.get(a.destino()), a.peso(), !bidireccional, opuestoDistinto);
        }

        FontMetrics fm = g2.getFontMetrics();
        for (Vertice v : vertices) {
            Point2D p = pos.get(v.getId());
            int x = (int) Math.round(p.getX());
            int y = (int) Math.round(p.getY());
            g2.setColor(new Color(0xD6E6FA));
            g2.fillOval(x - RADIO_NODO, y - RADIO_NODO, 2 * RADIO_NODO, 2 * RADIO_NODO);
            g2.setColor(new Color(0x2F5D8C));
            g2.drawOval(x - RADIO_NODO, y - RADIO_NODO, 2 * RADIO_NODO, 2 * RADIO_NODO);
            String id = recortar(v.getId(), fm, 2 * RADIO_NODO - 6);
            g2.setColor(Color.BLACK);
            g2.drawString(id, x - fm.stringWidth(id) / 2, y + fm.getAscent() / 2 - 1);
            g2.setColor(Color.DARK_GRAY);
            String nombre = recortar(v.getNombre(), fm, 110);
            g2.drawString(nombre, x - fm.stringWidth(nombre) / 2, y + RADIO_NODO + fm.getAscent() + 1);
        }
    }

    private String recortar(String t, FontMetrics fm, int maximo) {
        if (fm.stringWidth(t) <= maximo) {
            return t;
        }
        while (t.length() > 1 && fm.stringWidth(t + "…") > maximo) {
            t = t.substring(0, t.length() - 1);
        }
        return t + "…";
    }

    private void dibujarArista(Graphics2D g2, Point2D a, Point2D b, double peso, boolean flecha, boolean desplazar) {
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        double largo = Math.hypot(dx, dy);
        if (largo < 1) {
            return;
        }
        double ux = dx / largo;
        double uy = dy / largo;
        double nx = -uy;
        double ny = ux;
        double off = desplazar ? 9 : 0;
        double x1 = a.getX() + ux * RADIO_NODO + nx * off;
        double y1 = a.getY() + uy * RADIO_NODO + ny * off;
        double x2 = b.getX() - ux * RADIO_NODO + nx * off;
        double y2 = b.getY() - uy * RADIO_NODO + ny * off;
        g2.setColor(new Color(0x555555));
        g2.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        if (flecha) {
            double tam = 9;
            Point p1 = new Point((int) (x2 - ux * tam + nx * tam / 2.5), (int) (y2 - uy * tam + ny * tam / 2.5));
            Point p2 = new Point((int) (x2 - ux * tam - nx * tam / 2.5), (int) (y2 - uy * tam - ny * tam / 2.5));
            g2.fillPolygon(new int[]{(int) x2, p1.x, p2.x}, new int[]{(int) y2, p1.y, p2.y}, 3);
        }
        String texto = String.format(Locale.US, "%.1f", peso);
        FontMetrics fm = g2.getFontMetrics();
        int tx = (int) ((x1 + x2) / 2 + nx * (desplazar ? 8 : 10)) - fm.stringWidth(texto) / 2;
        int ty = (int) ((y1 + y2) / 2 + ny * (desplazar ? 8 : 10)) + fm.getAscent() / 2;
        g2.setColor(new Color(0xB03A2E));
        g2.drawString(texto, tx, ty);
    }
}
