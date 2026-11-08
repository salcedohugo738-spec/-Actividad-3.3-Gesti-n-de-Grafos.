/*
Salcedo Alvarez Hugo Emmanuel
Morales Escobar Juan Adrian
 */
package front_end;

import Nodos.Vertice;
import back_end.GrafoPonderado;
import java.util.List;
import javax.swing.JOptionPane;


public class GUI_GrafoPonderado extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI_GrafoPonderado.class.getName());

    private GrafoPonderado grafo;

    public GUI_GrafoPonderado() {
        initComponents();
        setLocationRelativeTo(null);
        ((PanelGrafo) panelGrafo).setGrafo(grafo);
        mensaje("INFO", "Bienvenido. Pulse «Crear Grafo» para comenzar.");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelCamposEntrada = new javax.swing.JPanel();
        lbl_Id = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        lbl_Estado = new javax.swing.JLabel();
        lbl_Capacidad = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        cBox_Tipo = new javax.swing.JComboBox<>();
        txt_Estado = new javax.swing.JTextField();
        txt_Capacidad = new javax.swing.JTextField();
        PanelRutas = new javax.swing.JPanel();
        lbl_Origen = new javax.swing.JLabel();
        lbl_Destino = new javax.swing.JLabel();
        lbl_Peso = new javax.swing.JLabel();
        txt_Origen = new javax.swing.JTextField();
        txt_Destino = new javax.swing.JTextField();
        txt_Peso = new javax.swing.JTextField();
        chk_Dirigida = new javax.swing.JCheckBox();
        btn_CrearGrafo = new javax.swing.JButton();
        PanelBotones = new javax.swing.JPanel();
        btn_DestruirGrafo = new javax.swing.JButton();
        btn_AgregarVertice = new javax.swing.JButton();
        btn_ActualizarVertice = new javax.swing.JButton();
        btn_BuscarVertice = new javax.swing.JButton();
        btn_EliminarVertice = new javax.swing.JButton();
        btn_AgregarArista = new javax.swing.JButton();
        btn_EliminarArista = new javax.swing.JButton();
        btn_BFS = new javax.swing.JButton();
        btn_DFS = new javax.swing.JButton();
        btn_Matriz = new javax.swing.JButton();
        btn_Conectividad = new javax.swing.JButton();
        PanelResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        PanelVisualizacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelGrafo = new PanelGrafo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad 3.3 - Grafos Ponderados");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Grafo Ponderado — Gestión de Redes de Transporte");

        PanelCamposEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicación (vértice)"));
        PanelRutas.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruta (arista)"));
        PanelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        PanelResultados.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensajes y resultados"));
        PanelVisualizacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Representación gráfica del grafo"));

        lbl_Id.setText("Identificador");
        lbl_Nombre.setText("Nombre");
        lbl_Tipo.setText("Tipo");
        lbl_Estado.setText("Estado / Zona");
        lbl_Capacidad.setText("Capacidad");
        lbl_Origen.setText("Origen (id)");
        lbl_Destino.setText("Destino (id)");
        lbl_Peso.setText("Peso / Distancia");

        cBox_Tipo.setEditable(true);
        cBox_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terminal", "Almacén", "Centro de Distribución", "Cliente" }));

        txt_Peso.setToolTipText("Número positivo (distancia, costo o tiempo). Use punto decimal.");

        chk_Dirigida.setText("Ruta dirigida");
        chk_Dirigida.setToolTipText("Marcada: solo origen → destino. Sin marcar: la ruta es de ida y vuelta.");

        btn_CrearGrafo.setText("Crear Grafo");
        btn_CrearGrafo.addActionListener(this::btn_CrearGrafoActionPerformed);

        btn_DestruirGrafo.setText("Destruir Grafo");
        btn_DestruirGrafo.addActionListener(this::btn_DestruirGrafoActionPerformed);

        btn_AgregarVertice.setText("Agregar Ubicación");
        btn_AgregarVertice.addActionListener(this::btn_AgregarVerticeActionPerformed);

        btn_ActualizarVertice.setText("Actualizar Ubicación");
        btn_ActualizarVertice.addActionListener(this::btn_ActualizarVerticeActionPerformed);

        btn_BuscarVertice.setText("Buscar Ubicación");
        btn_BuscarVertice.addActionListener(this::btn_BuscarVerticeActionPerformed);

        btn_EliminarVertice.setText("Eliminar Ubicación");
        btn_EliminarVertice.addActionListener(this::btn_EliminarVerticeActionPerformed);

        btn_AgregarArista.setText("Agregar Ruta");
        btn_AgregarArista.addActionListener(this::btn_AgregarAristaActionPerformed);

        btn_EliminarArista.setText("Eliminar Ruta");
        btn_EliminarArista.addActionListener(this::btn_EliminarAristaActionPerformed);

        btn_BFS.setText("Mostrar BFS");
        btn_BFS.addActionListener(this::btn_BFSActionPerformed);

        btn_DFS.setText("Mostrar DFS");
        btn_DFS.addActionListener(this::btn_DFSActionPerformed);

        btn_Matriz.setText("Mostrar Matriz");
        btn_Matriz.addActionListener(this::btn_MatrizActionPerformed);

        btn_Conectividad.setText("Evaluar Conectividad");
        btn_Conectividad.addActionListener(this::btn_ConectividadActionPerformed);

        txtResultados.setEditable(false);
        txtResultados.setColumns(45);
        txtResultados.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtResultados.setRows(16);
        jScrollPane1.setViewportView(txtResultados);

        javax.swing.GroupLayout panelGrafoLayout = new javax.swing.GroupLayout(panelGrafo);
        panelGrafo.setLayout(panelGrafoLayout);
        panelGrafoLayout.setHorizontalGroup(
            panelGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        panelGrafoLayout.setVerticalGroup(
            panelGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panelGrafo);

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelTituloLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelTituloLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout PanelCamposEntradaLayout = new javax.swing.GroupLayout(PanelCamposEntrada);
        PanelCamposEntrada.setLayout(PanelCamposEntradaLayout);
        PanelCamposEntradaLayout.setHorizontalGroup(
            PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCamposEntradaLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(cBox_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txt_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txt_Capacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addContainerGap())
        );
        PanelCamposEntradaLayout.setVerticalGroup(
            PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCamposEntradaLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(PanelCamposEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout PanelRutasLayout = new javax.swing.GroupLayout(PanelRutas);
        PanelRutas.setLayout(PanelRutasLayout);
        PanelRutasLayout.setHorizontalGroup(
            PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRutasLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_Dirigida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_Origen, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txt_Destino, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txt_Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addContainerGap())
        );
        PanelRutasLayout.setVerticalGroup(
            PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRutasLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(PanelRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addComponent(chk_Dirigida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelBotonesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_CrearGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AgregarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_BuscarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AgregarArista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_BFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Matriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_DestruirGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ActualizarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_EliminarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_EliminarArista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_DFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Conectividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelBotonesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CrearGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DestruirGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_AgregarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ActualizarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_BuscarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_EliminarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_AgregarArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_EliminarArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_BFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Matriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Conectividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );

        javax.swing.GroupLayout PanelResultadosLayout = new javax.swing.GroupLayout(PanelResultados);
        PanelResultados.setLayout(PanelResultadosLayout);
        PanelResultadosLayout.setHorizontalGroup(
            PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelResultadosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        PanelResultadosLayout.setVerticalGroup(
            PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelResultadosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );

        javax.swing.GroupLayout PanelVisualizacionLayout = new javax.swing.GroupLayout(PanelVisualizacion);
        PanelVisualizacion.setLayout(PanelVisualizacionLayout);
        PanelVisualizacionLayout.setHorizontalGroup(
            PanelVisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelVisualizacionLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        PanelVisualizacionLayout.setVerticalGroup(
            PanelVisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelVisualizacionLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PanelCamposEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PanelRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PanelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PanelVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelCamposEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelRutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addComponent(PanelVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                    .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearGrafoActionPerformed
        if (grafo != null && !grafo.isEmpty()) {
            int r = JOptionPane.showConfirmDialog(this, "Ya existe un grafo con datos. ¿Crear uno nuevo y vacío? Se perderán los datos actuales.",
                    "Crear grafo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (r != JOptionPane.YES_OPTION) {
                return;
            }
        }
        grafo = new GrafoPonderado();
        refrescar();
        info("Grafo creado: vacío y listo para usarse.");
    }//GEN-LAST:event_btn_CrearGrafoActionPerformed

    private void btn_DestruirGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DestruirGrafoActionPerformed
        if (!hayGrafo()) {
            return;
        }
        int vertices = grafo.getNumVertices();
        int arcos = grafo.getNumArcos();
        grafo.destruir();
        limpiarCampos();
        txtResultados.setText("");
        refrescar();
        info("Grafo destruido (" + vertices + " ubicaciones y " + arcos + " rutas eliminadas). La estructura quedó vacía: isEmpty() = " + grafo.isEmpty());
    }//GEN-LAST:event_btn_DestruirGrafoActionPerformed

    private void btn_AgregarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarVerticeActionPerformed
        if (!hayGrafo()) {
            return;
        }
        try {
            Vertice v = leerVertice();
            grafo.agregarVertice(v);
            info("Ubicación agregada: " + v);
            txt_Id.setText("");
            txt_Nombre.setText("");
            txt_Estado.setText("");
            txt_Capacidad.setText("");
            refrescar();
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_AgregarVerticeActionPerformed

    private void btn_ActualizarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarVerticeActionPerformed
        if (!hayGrafoConDatos()) {
            return;
        }
        try {
            Vertice v = leerVertice();
            grafo.actualizarVertice(v.getId(), v.getNombre(), v.getTipo(), v.getEstado(), v.getCapacidad());
            info("Ubicación actualizada: " + grafo.buscarVertice(v.getId()));
            refrescar();
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_ActualizarVerticeActionPerformed

    private void btn_BuscarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarVerticeActionPerformed
        if (!hayGrafo()) {
            return;
        }
        try {
            String id = Vertice.validarId(obligatorio(txt_Id.getText(), "Identificador"));
            Vertice v = grafo.buscarVertice(id);
            if (v == null) {
                error(grafo.isEmpty() ? "No se encontró '" + id + "': el grafo está vacío."
                        : "No existe ninguna ubicación con identificador '" + id + "'.");
                return;
            }
            mensaje("OK", "Ubicación encontrada:\n    Identificador: " + v.getId() + "\n    Nombre:        " + v.getNombre()
                    + "\n    Tipo:          " + v.getTipo() + "\n    Estado/Zona:   " + v.getEstado()
                    + "\n    Capacidad:     " + String.format(java.util.Locale.US, "%.2f", v.getCapacidad())
                    + "\n    Rutas de salida: " + grafo.gradoSalida(id) + " | Rutas de entrada: " + grafo.gradoEntrada(id));
            txt_Nombre.setText(v.getNombre());
            cBox_Tipo.setSelectedItem(v.getTipo());
            txt_Estado.setText(v.getEstado());
            txt_Capacidad.setText(String.valueOf(v.getCapacidad()));
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_BuscarVerticeActionPerformed

    private void btn_EliminarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarVerticeActionPerformed
        if (!hayGrafo()) {
            return;
        }
        try {
            if (grafo.isEmpty()) {
                throw new IllegalStateException("El grafo está vacío: no hay ubicaciones que eliminar.");
            }
            String id = Vertice.validarId(obligatorio(txt_Id.getText(), "Identificador"));
            int rutas = grafo.eliminarVertice(id);
            info("Ubicación '" + id + "' eliminada junto con " + rutas + " ruta(s) conectada(s) a ella.");
            txt_Id.setText("");
            refrescar();
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_EliminarVerticeActionPerformed

    private void btn_AgregarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarAristaActionPerformed
        if (!hayGrafo()) {
            return;
        }
        try {
            String origen = Vertice.validarId(obligatorio(txt_Origen.getText(), "Origen"));
            String destino = Vertice.validarId(obligatorio(txt_Destino.getText(), "Destino"));
            double peso = positivo(txt_Peso.getText(), "Peso / Distancia");
            boolean dirigida = chk_Dirigida.isSelected();
            boolean actualizada = grafo.agregarArista(origen, destino, peso, dirigida);
            info((actualizada ? "Ruta actualizada: " : "Ruta creada: ") + origen + (dirigida ? " -> " : " <-> ") + destino
                    + " (peso " + String.format(java.util.Locale.US, "%.2f", peso) + ")");
            refrescar();
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_AgregarAristaActionPerformed

    private void btn_EliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarAristaActionPerformed
        if (!hayGrafo()) {
            return;
        }
        try {
            String origen = Vertice.validarId(obligatorio(txt_Origen.getText(), "Origen"));
            String destino = Vertice.validarId(obligatorio(txt_Destino.getText(), "Destino"));
            boolean dirigida = chk_Dirigida.isSelected();
            int quitadas = grafo.eliminarArista(origen, destino, dirigida);
            info("Ruta eliminada: " + origen + (dirigida ? " -> " : " <-> ") + destino + " (" + quitadas + " sentido(s) quitado(s)).");
            refrescar();
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_EliminarAristaActionPerformed

    private void btn_BFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BFSActionPerformed
        if (!hayGrafoConDatos()) {
            return;
        }
        String inicio = pedirNodoInicial("BFS");
        if (inicio == null) {
            return;
        }
        try {
            List<String> orden = grafo.bfs(inicio);
            info("Recorrido BFS desde '" + inicio.trim() + "' (" + orden.size() + " de " + grafo.getNumVertices() + " ubicaciones alcanzadas):\n    " + secuencia(orden));
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_BFSActionPerformed

    private void btn_DFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DFSActionPerformed
        if (!hayGrafoConDatos()) {
            return;
        }
        String inicio = pedirNodoInicial("DFS");
        if (inicio == null) {
            return;
        }
        try {
            List<String> orden = grafo.dfs(inicio);
            info("Recorrido DFS desde '" + inicio.trim() + "' (" + orden.size() + " de " + grafo.getNumVertices() + " ubicaciones alcanzadas):\n    " + secuencia(orden));
        } catch (IllegalArgumentException | IllegalStateException ex) {
            error(ex.getMessage());
        }
    }//GEN-LAST:event_btn_DFSActionPerformed

    private void btn_MatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MatrizActionPerformed
        if (!hayGrafoConDatos()) {
            return;
        }
        info("Matriz de adyacencia (filas = origen, columnas = destino, '-' = sin ruta):\n" + grafo.matrizComoTexto()
                + "Lista de adyacencia:\n" + grafo.listaAdyacenciaComoTexto());
    }//GEN-LAST:event_btn_MatrizActionPerformed

    private void btn_ConectividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConectividadActionPerformed
        if (!hayGrafoConDatos()) {
            return;
        }
        GrafoPonderado.Conectividad c = grafo.evaluarConectividad();
        info("Conectividad del grafo (" + grafo.getNumVertices() + " ubicaciones, " + grafo.getNumArcos() + " rutas dirigidas): "
                + c.name().replace('_', ' ') + "\n    " + c.getDescripcion());
    }//GEN-LAST:event_btn_ConectividadActionPerformed


    private void mensaje(String tipo, String texto) {
        txtResultados.append("[" + tipo + "] " + texto + "\n");
        txtResultados.setCaretPosition(txtResultados.getDocument().getLength());
    }

    private void info(String texto) {
        mensaje("OK", texto);
    }

    private void error(String texto) {
        mensaje("ERROR", texto);
    }

  
    private boolean hayGrafo() {
        if (grafo == null) {
            error("Primero debe crear el grafo (botón «Crear Grafo»).");
            return false;
        }
        return true;
    }

   
    private boolean hayGrafoConDatos() {
        if (!hayGrafo()) {
            return false;
        }
        if (grafo.isEmpty()) {
            error("El grafo está vacío: agregue ubicaciones primero.");
            return false;
        }
        return true;
    }

    private void refrescar() {
        ((PanelGrafo) panelGrafo).setGrafo(grafo);
    }

    private String obligatorio(String texto, String campo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo '" + campo + "' no puede estar vacío.");
        }
        return texto.trim();
    }


    private double positivo(String texto, String campo) {
        String t = obligatorio(texto, campo);
        double valor;
        try {
            valor = Double.parseDouble(t);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("El campo '" + campo + "' debe ser numérico (use punto decimal).");
        }
        if (Double.isNaN(valor) || Double.isInfinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("El campo '" + campo + "' debe ser un número finito mayor a cero.");
        }
        return valor;
    }

    private String tipoSeleccionado() {
        Object tipo = cBox_Tipo.getSelectedItem();
        return tipo == null ? "" : tipo.toString();
    }

    private Vertice leerVertice() {
        String id = Vertice.validarId(obligatorio(txt_Id.getText(), "Identificador"));
        String nombre = obligatorio(txt_Nombre.getText(), "Nombre");
        String tipo = obligatorio(tipoSeleccionado(), "Tipo");
        String estado = obligatorio(txt_Estado.getText(), "Estado / Zona");
        double capacidad = positivo(txt_Capacidad.getText(), "Capacidad");
        return new Vertice(id, nombre, tipo, estado, capacidad);
    }

    private void limpiarCampos() {
        txt_Id.setText("");
        txt_Nombre.setText("");
        cBox_Tipo.setSelectedIndex(0);
        txt_Estado.setText("");
        txt_Capacidad.setText("");
        txt_Origen.setText("");
        txt_Destino.setText("");
        txt_Peso.setText("");
        chk_Dirigida.setSelected(false);
    }

  
    private String pedirNodoInicial(String recorrido) {
        Object r = JOptionPane.showInputDialog(this, "Identificador del nodo inicial para " + recorrido + ":",
                "Recorrido " + recorrido, JOptionPane.QUESTION_MESSAGE, null, null, txt_Id.getText().trim());
        return r == null ? null : r.toString();
    }

    private String secuencia(List<String> ids) {
        return String.join(" -> ", ids);
    }

   
 
    public static void main(String args[]) {
  
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(() -> new GUI_GrafoPonderado().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCamposEntrada;
    private javax.swing.JPanel PanelResultados;
    private javax.swing.JPanel PanelRutas;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JPanel PanelVisualizacion;
    private javax.swing.JButton btn_ActualizarVertice;
    private javax.swing.JButton btn_AgregarArista;
    private javax.swing.JButton btn_AgregarVertice;
    private javax.swing.JButton btn_BFS;
    private javax.swing.JButton btn_BuscarVertice;
    private javax.swing.JButton btn_Conectividad;
    private javax.swing.JButton btn_CrearGrafo;
    private javax.swing.JButton btn_DFS;
    private javax.swing.JButton btn_DestruirGrafo;
    private javax.swing.JButton btn_EliminarArista;
    private javax.swing.JButton btn_EliminarVertice;
    private javax.swing.JButton btn_Matriz;
    private javax.swing.JComboBox<String> cBox_Tipo;
    private javax.swing.JCheckBox chk_Dirigida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Capacidad;
    private javax.swing.JLabel lbl_Destino;
    private javax.swing.JLabel lbl_Estado;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Origen;
    private javax.swing.JLabel lbl_Peso;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JPanel panelGrafo;
    private javax.swing.JTextArea txtResultados;
    private javax.swing.JTextField txt_Capacidad;
    private javax.swing.JTextField txt_Destino;
    private javax.swing.JTextField txt_Estado;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Origen;
    private javax.swing.JTextField txt_Peso;
    // End of variables declaration//GEN-END:variables
}
