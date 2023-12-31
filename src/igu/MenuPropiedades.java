/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import entidades.Estado;
import entidades.Inspector;
import entidades.Propiedad;
import entidades.Propietario;
import entidades.TipoPropiedad;
import entidades.Zona;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import persistencia.EstadoData;
import persistencia.InspectorData;
import persistencia.PropiedadData;
import persistencia.PropietarioData;
import persistencia.TipoPropiedadData;
import persistencia.ZonaData;

public class MenuPropiedades extends javax.swing.JInternalFrame {

    private int idPropietarioSeleccionado = -1;
    PropiedadData pd = new PropiedadData();
    PropietarioData propd = new PropietarioData();

    public MenuPropiedades() {
        initComponents();
        QuitarLaBarraTitulo();
        cargarComboTipo();
        cargarComboZona();
        cargarComboEstado();
        cargarComboInspector();
        cargarComboPropietarios();
        deshabilitarBotones();
//        combosEnBlanco();
        limpiarCampos();

    }

    //defino dos métodosdentro del JInternalFrame y lo instanciamos de la siguiente manera.
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
    //A continuación creamos una función dentro del mismo JInternalFrame como el ejemplo siguiente:

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPPropiedades = new javax.swing.JPanel();
        jLTituloPropiedades = new javax.swing.JLabel();
        jLIDPropiedades = new javax.swing.JLabel();
        jLDireccionPropiedades = new javax.swing.JLabel();
        jLAlturaPropiedades = new javax.swing.JLabel();
        jLTipoPropiedades = new javax.swing.JLabel();
        jLSuperTotalPropiedades = new javax.swing.JLabel();
        jLPrecioTasadoPropiedades = new javax.swing.JLabel();
        jLAntiguedadPropiedades = new javax.swing.JLabel();
        jLInspectorPropiedades = new javax.swing.JLabel();
        jLZonaPropiedades = new javax.swing.JLabel();
        jTDireccionPropiedades = new javax.swing.JTextField();
        jTAlturaPropiedades = new javax.swing.JTextField();
        jTSuperTotalPropiedades = new javax.swing.JTextField();
        jTPrecioTasadoPropiedades = new javax.swing.JTextField();
        jTAntiguedadPropiedad = new javax.swing.JTextField();
        jLEstadoPropiedad = new javax.swing.JLabel();
        jLDisponibilidadPropiedad = new javax.swing.JLabel();
        jLActivoPropiedades = new javax.swing.JLabel();
        jLObservacionesPropiedades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservacionesPropiedades = new javax.swing.JTextArea();
        jBGuardarPropiedades = new javax.swing.JButton();
        jBModificarPropiedades = new javax.swing.JButton();
        jBEliminarPropiedades = new javax.swing.JButton();
        jBSalirPropiedades = new javax.swing.JButton();
        jPBarraNavegador = new javax.swing.JPanel();
        jLNavegacionEnBarra = new javax.swing.JLabel();
        jRDisponibilidadPropiedades = new javax.swing.JRadioButton();
        jCListaTipoPropiedades = new javax.swing.JComboBox<>();
        jRActivoPropiedades1 = new javax.swing.JRadioButton();
        jCListaPropietarios = new javax.swing.JComboBox<>();
        jCListarEstadoPropiedades = new javax.swing.JComboBox<>();
        jCListaPropiedades = new javax.swing.JComboBox<>();
        jCListarZonaPropiedades = new javax.swing.JComboBox<>();
        jCListaInspectoresPropiedades = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(755, 699));

        jPPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jPPropiedades.setMinimumSize(new java.awt.Dimension(755, 592));
        jPPropiedades.setPreferredSize(new java.awt.Dimension(755, 592));

        jLTituloPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/White-casita.png"))); // NOI18N
        jLTituloPropiedades.setText("  Formulario Propiedades");
        jLTituloPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLIDPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLIDPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLIDPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDPropiedades.setText("ID Propietario");

        jLDireccionPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDireccionPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLDireccionPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDireccionPropiedades.setText("Direccion");

        jLAlturaPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLAlturaPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLAlturaPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLAlturaPropiedades.setText("Altura");

        jLTipoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLTipoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLTipoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTipoPropiedades.setText("Tipo");
        jLTipoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLSuperTotalPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLSuperTotalPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLSuperTotalPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLSuperTotalPropiedades.setText("Super. Total");

        jLPrecioTasadoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLPrecioTasadoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLPrecioTasadoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPrecioTasadoPropiedades.setText("Precio Tasado");
        jLPrecioTasadoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLAntiguedadPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLAntiguedadPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLAntiguedadPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLAntiguedadPropiedades.setText("Antiguedad");
        jLAntiguedadPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLInspectorPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLInspectorPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLInspectorPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLInspectorPropiedades.setText("Inspector");

        jLZonaPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLZonaPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLZonaPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLZonaPropiedades.setText("Zona");

        jTDireccionPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTDireccionPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDireccionPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jTDireccionPropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTDireccionPropiedades.setMinimumSize(new java.awt.Dimension(14, 23));
        jTDireccionPropiedades.setName(""); // NOI18N
        jTDireccionPropiedades.setPreferredSize(new java.awt.Dimension(14, 23));
        jTDireccionPropiedades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDireccionPropiedadesKeyReleased(evt);
            }
        });

        jTAlturaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTAlturaPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAlturaPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jTAlturaPropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTAlturaPropiedades.setMinimumSize(new java.awt.Dimension(14, 23));
        jTAlturaPropiedades.setPreferredSize(new java.awt.Dimension(14, 23));
        jTAlturaPropiedades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAlturaPropiedadesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTAlturaPropiedadesKeyTyped(evt);
            }
        });

        jTSuperTotalPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTSuperTotalPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTSuperTotalPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jTSuperTotalPropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTSuperTotalPropiedades.setMinimumSize(new java.awt.Dimension(14, 23));
        jTSuperTotalPropiedades.setName(""); // NOI18N
        jTSuperTotalPropiedades.setPreferredSize(new java.awt.Dimension(14, 23));
        jTSuperTotalPropiedades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTSuperTotalPropiedadesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSuperTotalPropiedadesKeyTyped(evt);
            }
        });

        jTPrecioTasadoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTPrecioTasadoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTPrecioTasadoPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jTPrecioTasadoPropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTPrecioTasadoPropiedades.setMinimumSize(new java.awt.Dimension(14, 23));
        jTPrecioTasadoPropiedades.setPreferredSize(new java.awt.Dimension(14, 23));
        jTPrecioTasadoPropiedades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioTasadoPropiedadesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrecioTasadoPropiedadesKeyTyped(evt);
            }
        });

        jTAntiguedadPropiedad.setBackground(new java.awt.Color(153, 153, 153));
        jTAntiguedadPropiedad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAntiguedadPropiedad.setForeground(new java.awt.Color(51, 51, 51));
        jTAntiguedadPropiedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTAntiguedadPropiedad.setMinimumSize(new java.awt.Dimension(14, 23));
        jTAntiguedadPropiedad.setPreferredSize(new java.awt.Dimension(14, 23));
        jTAntiguedadPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAntiguedadPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTAntiguedadPropiedadKeyTyped(evt);
            }
        });

        jLEstadoPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLEstadoPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLEstadoPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLEstadoPropiedad.setText("Estado");

        jLDisponibilidadPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDisponibilidadPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLDisponibilidadPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDisponibilidadPropiedad.setText("Disponible");

        jLActivoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLActivoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLActivoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLActivoPropiedades.setText("Activo");

        jLObservacionesPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLObservacionesPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLObservacionesPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLObservacionesPropiedades.setText("Observaciones");
        jLObservacionesPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTObservacionesPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTObservacionesPropiedades.setColumns(20);
        jTObservacionesPropiedades.setRows(5);
        jTObservacionesPropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTObservacionesPropiedades);

        jBGuardarPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBGuardarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBGuardarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBGuardarPropiedades.setText("Nuevo");
        jBGuardarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarPropiedadesActionPerformed(evt);
            }
        });

        jBModificarPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarPropiedades.setText("Modificar");
        jBModificarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarPropiedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBModificarPropiedadesItemStateChanged(evt);
            }
        });
        jBModificarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarPropiedadesActionPerformed(evt);
            }
        });

        jBEliminarPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarPropiedades.setText("Eliminar");
        jBEliminarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarPropiedadesActionPerformed(evt);
            }
        });

        jBSalirPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirPropiedades.setText("Salir");
        jBSalirPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalirPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirPropiedadesActionPerformed(evt);
            }
        });

        jPBarraNavegador.setBackground(new java.awt.Color(153, 153, 153));

        jLNavegacionEnBarra.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLNavegacionEnBarra.setForeground(new java.awt.Color(255, 255, 255));
        jLNavegacionEnBarra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNavegacionEnBarra.setText("Inicio > Propiedades");

        javax.swing.GroupLayout jPBarraNavegadorLayout = new javax.swing.GroupLayout(jPBarraNavegador);
        jPBarraNavegador.setLayout(jPBarraNavegadorLayout);
        jPBarraNavegadorLayout.setHorizontalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNavegacionEnBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPBarraNavegadorLayout.setVerticalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLNavegacionEnBarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jRDisponibilidadPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jRDisponibilidadPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jRDisponibilidadPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        jRDisponibilidadPropiedades.setSelected(true);
        jRDisponibilidadPropiedades.setBorder(null);
        jRDisponibilidadPropiedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRDisponibilidadPropiedadesItemStateChanged(evt);
            }
        });

        jCListaTipoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jCListaTipoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCListaTipoPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jRActivoPropiedades1.setBackground(new java.awt.Color(51, 51, 51));
        jRActivoPropiedades1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jRActivoPropiedades1.setForeground(new java.awt.Color(255, 255, 255));
        jRActivoPropiedades1.setSelected(true);
        jRActivoPropiedades1.setBorder(null);
        jRActivoPropiedades1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRActivoPropiedades1ItemStateChanged(evt);
            }
        });

        jCListaPropietarios.setBackground(new java.awt.Color(153, 153, 153));
        jCListaPropietarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCListaPropietarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCListaPropietariosItemStateChanged(evt);
            }
        });

        jCListarEstadoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jCListarEstadoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCListarEstadoPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jCListaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jCListaPropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCListaPropiedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCListaPropiedadesItemStateChanged(evt);
            }
        });

        jCListarZonaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jCListarZonaPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCListarZonaPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jCListaInspectoresPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jCListaInspectoresPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCListaInspectoresPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash_bin_delete_remove_icon_191682.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPropiedadesLayout = new javax.swing.GroupLayout(jPPropiedades);
        jPPropiedades.setLayout(jPPropiedadesLayout);
        jPPropiedadesLayout.setHorizontalGroup(
            jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPropiedadesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPBarraNavegador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLIDPropiedades)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPPropiedadesLayout.createSequentialGroup()
                                        .addComponent(jLSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPPropiedadesLayout.createSequentialGroup()
                                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLAntiguedadPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTAntiguedadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPPropiedadesLayout.createSequentialGroup()
                                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLAlturaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDireccionPropiedades))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTDireccionPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTAlturaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPropiedadesLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEliminarPropiedades)
                                    .addComponent(jLObservacionesPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLActivoPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLDisponibilidadPropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRActivoPropiedades1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRDisponibilidadPropiedades)))
                                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                        .addComponent(jCListaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton4)))
                                .addGap(66, 66, 66))))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                    .addComponent(jLTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCListaTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                    .addComponent(jLInspectorPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCListaInspectoresPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                    .addComponent(jLZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCListarZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                    .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBGuardarPropiedades)
                                        .addComponent(jLEstadoPropiedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(jCListarEstadoPropiedades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                            .addGap(102, 102, 102)
                                            .addComponent(jBModificarPropiedades)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalirPropiedades)
                        .addGap(100, 100, 100))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLTituloPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPPropiedadesLayout.setVerticalGroup(
            jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPBarraNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLTituloPropiedades)
                .addGap(20, 20, 20)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLIDPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCListaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jRDisponibilidadPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTDireccionPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLDireccionPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLDisponibilidadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLActivoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTAlturaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLAlturaPropiedades))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRActivoPropiedades1)))
                .addGap(3, 3, 3)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTAntiguedadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAntiguedadPropiedades))
                        .addGap(34, 34, 34)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCListaTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTipoPropiedades))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCListaInspectoresPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLInspectorPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCListarZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCListarEstadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEstadoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addComponent(jLObservacionesPropiedades)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGuardarPropiedades)
                        .addComponent(jBModificarPropiedades))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalirPropiedades)
                        .addComponent(jBEliminarPropiedades)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiarCampos();
        deshabilitarBotones();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCListaPropiedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCListaPropiedadesItemStateChanged
        limpiarCampos();
        rellenarCampos();
        if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                && jRDisponibilidadPropiedades.isSelected() == true && !jTObservacionesPropiedades.getText().isEmpty()) {
            habilitarBotones();
        } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jCListaPropiedadesItemStateChanged

    private void jCListaPropietariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCListaPropietariosItemStateChanged
        int idPropietario = -1;
        Object selectedItem = jCListaPropietarios.getSelectedItem();
        if (selectedItem != null) {
            if (selectedItem instanceof Propietario) { //USO UN instanceof PARA VERIFICAR SI EL OBJETO ES UNA INSTANCIA DE LA CLASE PROPIETARIO, LO CASTEO Y SACO EL ID DEL PROPIETARIO
                Propietario propietarioSeleccionado = (Propietario) selectedItem;
                idPropietario = propietarioSeleccionado.getIdPropietario(); //UNA VEZ TENGO EL ID, LLAMO, LIMPIO LOS CAMPOS DEL COMBO BOX DE PROPIEDADES Y CARGO LAS PROPIEDADES
                jCListaPropiedades.removeAllItems();
                List<Propiedad> propiedadesDelPropietario = pd.listarPropiedadesXDueño(propietarioSeleccionado.getIdPropietario());

                for (Propiedad propiedad : propiedadesDelPropietario) {
                    jCListaPropiedades.addItem(propiedad);
                }
                limpiarCampos();
                rellenarCampos();

                if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                        && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                        && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                        && jRDisponibilidadPropiedades.isSelected() == true && !jTObservacionesPropiedades.getText().isEmpty()) {
                    habilitarBotones();
                } else {
                    deshabilitarBotones();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un propietario válido");
            }
        }
    }//GEN-LAST:event_jCListaPropietariosItemStateChanged

    private void jRActivoPropiedades1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRActivoPropiedades1ItemStateChanged
        actualizarActivo();
    }//GEN-LAST:event_jRActivoPropiedades1ItemStateChanged

    private void jRDisponibilidadPropiedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRDisponibilidadPropiedadesItemStateChanged
        actualizarDisponibilidad();
    }//GEN-LAST:event_jRDisponibilidadPropiedadesItemStateChanged

    private void jBSalirPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirPropiedadesActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }
    }//GEN-LAST:event_jBSalirPropiedadesActionPerformed

    private void jBEliminarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarPropiedadesActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "\n\n¿Estás seguro que deseas eliminar la propiedad?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            Propiedad propiedadSeleccionado = (Propiedad) jCListaPropiedades.getSelectedItem();
            pd.darBajaAPropiedad(propiedadSeleccionado);
            limpiarCampos();
            cargarComboPropiedades();
        }

    }//GEN-LAST:event_jBEliminarPropiedadesActionPerformed

    private void jBModificarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarPropiedadesActionPerformed
        modificarPropiedad(); // Llama al método modificar solo si se ha seleccionado una propiedad
cargarComboPropiedades();
    }//GEN-LAST:event_jBModificarPropiedadesActionPerformed

    private void jBModificarPropiedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBModificarPropiedadesItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificarPropiedadesItemStateChanged

    private void jBGuardarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarPropiedadesActionPerformed
        guardarPropiedad();
        cargarComboPropiedades();
    }//GEN-LAST:event_jBGuardarPropiedadesActionPerformed

    private void jTAntiguedadPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAntiguedadPropiedadKeyReleased
        if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
            jBGuardarPropiedades.setEnabled(true);
        } else {
            deshabilitarBotones();
        }

        if (jTAntiguedadPropiedad.getText().isEmpty()) {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTAntiguedadPropiedadKeyReleased

    private void jTPrecioTasadoPropiedadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioTasadoPropiedadesKeyTyped
        //Solo dejo introducir numeros , puntos y comas
        int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57) || key == 46 || key == 44;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTPrecioTasadoPropiedadesKeyTyped

    private void jTPrecioTasadoPropiedadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioTasadoPropiedadesKeyReleased
        if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
            jBGuardarPropiedades.setEnabled(true);
        } else {
            deshabilitarBotones();
        }

        if (jTPrecioTasadoPropiedades.getText().isEmpty()) {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTPrecioTasadoPropiedadesKeyReleased

    private void jTSuperTotalPropiedadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSuperTotalPropiedadesKeyTyped
        //Solo dejo introducir numeros , puntos y comas
        int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57) || key == 46 || key == 44;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTSuperTotalPropiedadesKeyTyped

    private void jTSuperTotalPropiedadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSuperTotalPropiedadesKeyReleased
        if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
            jBGuardarPropiedades.setEnabled(true);
        } else {
            deshabilitarBotones();
        }

        if (jTSuperTotalPropiedades.getText().isEmpty()) {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTSuperTotalPropiedadesKeyReleased

    private void jTAlturaPropiedadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAlturaPropiedadesKeyReleased
        if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
            jBGuardarPropiedades.setEnabled(true);
        } else {
            deshabilitarBotones();
        }

        if (jTAlturaPropiedades.getText().isEmpty()) {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTAlturaPropiedadesKeyReleased

    private void jTDireccionPropiedadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDireccionPropiedadesKeyReleased
        if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
            jBGuardarPropiedades.setEnabled(true);
        } else {
            deshabilitarBotones();
        }

        if (jTDireccionPropiedades.getText().isEmpty()) {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTDireccionPropiedadesKeyReleased

    private void jTAlturaPropiedadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAlturaPropiedadesKeyTyped
        int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57) || key == 46 || key == 44;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTAlturaPropiedadesKeyTyped

    private void jTAntiguedadPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAntiguedadPropiedadKeyTyped
          int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57);
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTAntiguedadPropiedadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarPropiedades;
    private javax.swing.JButton jBGuardarPropiedades;
    private javax.swing.JButton jBModificarPropiedades;
    private javax.swing.JButton jBSalirPropiedades;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Inspector> jCListaInspectoresPropiedades;
    private javax.swing.JComboBox<Propiedad> jCListaPropiedades;
    private javax.swing.JComboBox<Propietario> jCListaPropietarios;
    private javax.swing.JComboBox<TipoPropiedad> jCListaTipoPropiedades;
    private javax.swing.JComboBox<Estado> jCListarEstadoPropiedades;
    private javax.swing.JComboBox<Zona> jCListarZonaPropiedades;
    private javax.swing.JLabel jLActivoPropiedades;
    private javax.swing.JLabel jLAlturaPropiedades;
    private javax.swing.JLabel jLAntiguedadPropiedades;
    private javax.swing.JLabel jLDireccionPropiedades;
    private javax.swing.JLabel jLDisponibilidadPropiedad;
    private javax.swing.JLabel jLEstadoPropiedad;
    private javax.swing.JLabel jLIDPropiedades;
    private javax.swing.JLabel jLInspectorPropiedades;
    private javax.swing.JLabel jLNavegacionEnBarra;
    private javax.swing.JLabel jLObservacionesPropiedades;
    private javax.swing.JLabel jLPrecioTasadoPropiedades;
    private javax.swing.JLabel jLSuperTotalPropiedades;
    private javax.swing.JLabel jLTipoPropiedades;
    private javax.swing.JLabel jLTituloPropiedades;
    private javax.swing.JLabel jLZonaPropiedades;
    private javax.swing.JPanel jPBarraNavegador;
    private javax.swing.JPanel jPPropiedades;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRActivoPropiedades1;
    private javax.swing.JRadioButton jRDisponibilidadPropiedades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAlturaPropiedades;
    private javax.swing.JTextField jTAntiguedadPropiedad;
    private javax.swing.JTextField jTDireccionPropiedades;
    private javax.swing.JTextArea jTObservacionesPropiedades;
    private javax.swing.JTextField jTPrecioTasadoPropiedades;
    private javax.swing.JTextField jTSuperTotalPropiedades;
    // End of variables declaration//GEN-END:variables

    public void guardarPropiedad() {
        PropiedadData pd = new PropiedadData();
        PropietarioData prod = new PropietarioData();

        try {
            if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                    && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                    && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                    && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
                habilitarBotones();
                // Propiedad PSelec = (Propiedad) jCListaTipoPropiedades.getSelectedItem();
                Propietario propietario = (Propietario) jCListaPropietarios.getSelectedItem();
                String direccion = jTDireccionPropiedades.getText();
                int altura = Integer.parseInt(jTAlturaPropiedades.getText());
                TipoPropiedad tipoSelec = (TipoPropiedad) jCListaTipoPropiedades.getSelectedItem();
                int superficieTotal = Integer.parseInt(jTSuperTotalPropiedades.getText());
                double precioTasado = Double.parseDouble(jTPrecioTasadoPropiedades.getText());
                int antiguedad = Integer.parseInt(jTAntiguedadPropiedad.getText());
                Inspector insSelec = (Inspector) jCListaInspectoresPropiedades.getSelectedItem();
                Zona zona = (Zona) jCListarZonaPropiedades.getSelectedItem();
                Estado estado = (Estado) jCListarEstadoPropiedades.getSelectedItem();
                String observaciones = jTObservacionesPropiedades.getText();
                boolean disponible = jRDisponibilidadPropiedades.isSelected();
                boolean activo = jRActivoPropiedades1.isSelected();
                Propiedad nuevo = new Propiedad(propietario, direccion, altura, tipoSelec, superficieTotal, precioTasado, antiguedad, insSelec, zona, estado, observaciones, disponible, activo);
                pd.agregarPropiedad(nuevo);
                JOptionPane.showMessageDialog(this, "Propiedad agregada exitosamente");
                limpiarCampos();
                deshabilitarBotones();
                // cargarCombo();

            } else {
                JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    }

    public void cargarComboPropietarios() {
        jCListaPropietarios.removeAllItems();

        List<Propietario> propietarios = propd.listarPropietarios();

        for (Propietario propietario : propietarios) {

            jCListaPropietarios.addItem(propietario);
        }
    }

    private void cargarComboTipo() {

        TipoPropiedadData tipD = new TipoPropiedadData();
        ArrayList<TipoPropiedad> tipoProp = new ArrayList<>();

        for (TipoPropiedad tipo : tipD.listarTipoPropiedadesActivas()) {
            tipoProp.add(tipo);
            jCListaTipoPropiedades.addItem(tipo);

        }
    }

    public void cargarComboInspector() {

        InspectorData inspectorD = new InspectorData();
        ArrayList<Inspector> inspectores = new ArrayList<>();

        for (Inspector inspector : inspectorD.listarInspectoresActivos()) {
            inspectores.add(inspector);
            jCListaInspectoresPropiedades.addItem(inspector);

        }
    }

    public void cargarComboEstado() {

        EstadoData estadoD = new EstadoData();
        ArrayList<Estado> Estados = new ArrayList<>();

        for (Estado est : estadoD.listarEstadosActivos()) {
            Estados.add(est);
            jCListarEstadoPropiedades.addItem(est);

        }
    }

    public void cargarComboZona() {

        ZonaData zonaD = new ZonaData();
        ArrayList<Zona> Zonas = new ArrayList<>();

        for (Zona zon : zonaD.listarZona()) {
            Zonas.add(zon);
            jCListarZonaPropiedades.addItem(zon);

        }
    }

    public void limpiarCampos() {
        //Cintia: Agrego limpieza de campos
        jTDireccionPropiedades.setText("");
        jTAlturaPropiedades.setText("");
        jTSuperTotalPropiedades.setText("");
        jTPrecioTasadoPropiedades.setText("");
        jTAntiguedadPropiedad.setText("");
        jRDisponibilidadPropiedades.isSelected();
        jRActivoPropiedades1.isSelected();
        jTObservacionesPropiedades.setText("");
        jCListaInspectoresPropiedades.setSelectedItem(null);
        jCListarZonaPropiedades.setSelectedItem(null);
        jCListarEstadoPropiedades.setSelectedItem(null);
        jCListaTipoPropiedades.setSelectedItem(null);

    }

    public void rellenarCampos() {

        Propiedad propiedadSeleccionado = (Propiedad) jCListaPropiedades.getSelectedItem();
        // boolean activo = jrbEstado.isSelected();

        if (propiedadSeleccionado != null) {

            jTDireccionPropiedades.setText(String.valueOf(propiedadSeleccionado.getDireccion()));
            jTAlturaPropiedades.setText(String.valueOf(propiedadSeleccionado.getAltura()));
            jTSuperTotalPropiedades.setText(String.valueOf(propiedadSeleccionado.getSuperficieTotal()));
            jTPrecioTasadoPropiedades.setText(String.valueOf(propiedadSeleccionado.getPrecioTasado()));
            jTAntiguedadPropiedad.setText(String.valueOf(propiedadSeleccionado.getAntiguedad()));
            jTObservacionesPropiedades.setText(String.valueOf(propiedadSeleccionado.getObservaciones()));

            //combos
            // jCListaTipoPropiedades 
            for (int i = 0; i < jCListaTipoPropiedades.getItemCount(); i++) {
                TipoPropiedad x = jCListaTipoPropiedades.getItemAt(i);
                if (x.getIdTipo() == propiedadSeleccionado.getTipo().getIdTipo()) {
                    jCListaTipoPropiedades.setSelectedIndex(i);
                }
            }

            //jCListaInspectoresPropiedades
            for (int i = 0; i < jCListaInspectoresPropiedades.getItemCount(); i++) {
                Inspector x = jCListaInspectoresPropiedades.getItemAt(i);
                if (x.getIdInspector() == propiedadSeleccionado.getInspector().getIdInspector()) {
                    jCListaInspectoresPropiedades.setSelectedIndex(i);
                }
            }

            //jCListarZonaPropiedades
            for (int i = 0; i < jCListarZonaPropiedades.getItemCount(); i++) {
                Zona x = jCListarZonaPropiedades.getItemAt(i);
                if (x.getIdZona() == propiedadSeleccionado.getZona().getIdZona()) {
                    jCListarZonaPropiedades.setSelectedIndex(i);
                }
            }

            //jCListarEstadoPropiedades
            for (int i = 0; i < jCListarEstadoPropiedades.getItemCount(); i++) {
                Estado x = jCListarEstadoPropiedades.getItemAt(i);
                if (x.getIdEstado() == propiedadSeleccionado.getEstado().getIdEstado()) {
                    jCListarEstadoPropiedades.setSelectedIndex(i);
                }
            }
            // Botones Radiales

            actualizarDisponibilidad();

            if (propiedadSeleccionado.isDisponible() == true) {
                jRDisponibilidadPropiedades.setSelected(true);
            } else {
                jRDisponibilidadPropiedades.setSelected(false);
            }

            actualizarActivo();

            if (propiedadSeleccionado.isActivo() == true) {
                jRActivoPropiedades1.setSelected(true);
            } else {

                jRActivoPropiedades1.setSelected(false);
            }

        }
    }

    public void modificarPropiedad() {

        try {
            if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                    && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                    && !jTAntiguedadPropiedad.getText().isEmpty() && !jTObservacionesPropiedades.getText().isEmpty()) {

                PropietarioData prod = new PropietarioData();
                Propiedad propiedadSeleccionada = (Propiedad) jCListaPropiedades.getSelectedItem();
                int id = propiedadSeleccionada.getIdPropiedad();
                Propietario propietario = (Propietario) jCListaPropietarios.getSelectedItem();
                String direccion = jTDireccionPropiedades.getText();
                int altura = Integer.parseInt(jTAlturaPropiedades.getText());
                TipoPropiedad tipoSelec = (TipoPropiedad) jCListaTipoPropiedades.getSelectedItem();
                int superficieTotal = Integer.parseInt(jTSuperTotalPropiedades.getText());
                double precioTasado = Double.parseDouble(jTPrecioTasadoPropiedades.getText());
                int antiguedad = Integer.parseInt(jTAntiguedadPropiedad.getText());
                Inspector insSelec = (Inspector) jCListaInspectoresPropiedades.getSelectedItem();
                Zona zona = (Zona) jCListarZonaPropiedades.getSelectedItem();
                Estado estado = (Estado) jCListarEstadoPropiedades.getSelectedItem();
                String observaciones = jTObservacionesPropiedades.getText();
                boolean disponible = jRDisponibilidadPropiedades.isSelected();
                boolean activo = jRActivoPropiedades1.isSelected();
                Propiedad nuevoP = new Propiedad(id, propietario, direccion, altura, tipoSelec, superficieTotal, precioTasado, antiguedad, insSelec, zona, estado, observaciones, disponible, activo);
                //pd.modificarPropiedad(nuevoP);

                int respuesta = JOptionPane.showConfirmDialog(this, "\n\n¿Estás seguro que deseas guardar los cambios?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    pd.modificarPropiedad(nuevoP); // Guardo el cambio
                    JOptionPane.showMessageDialog(this, "Modificado exitosamente");
                    deshabilitarBotones();
                } else {
                    limpiarCampos();
                    rellenarCampos();
                    JOptionPane.showMessageDialog(this, "Campos reestablecidos");
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar" + e.getMessage());
        }
    }

    private void actualizarDisponibilidad() {
        if (jRDisponibilidadPropiedades.isSelected()) {
            jLDisponibilidadPropiedad.setText("Disponible");
        } else {
            jLDisponibilidadPropiedad.setText("NO Disponible");
        }
    }

    private void actualizarActivo() {
        if (jRActivoPropiedades1.isSelected()) {
            jLActivoPropiedades.setText("Activa");
        } else {
            jLActivoPropiedades.setText("Inactiva");
        }
    }

    public void cargarComboPropiedades() {
        int idPropietario = -1;
        Object selectedItem = jCListaPropietarios.getSelectedItem();
        if (selectedItem != null) {
            if (selectedItem instanceof Propietario) { //USO UN instanceof PARA VERIFICAR SI EL OBJETO ES UNA INSTANCIA DE LA CALSE PROPIETARIO, LO CASTEO Y SACO EL ID DEL PROPIETARIO
                Propietario propietarioSeleccionado = (Propietario) selectedItem;
                idPropietario = propietarioSeleccionado.getIdPropietario(); //UNA VEZ TENGO EL ID, LLAMO, LIMPIO LOS CAMPOS DEL COMBO BOX DE PROPIEDADES Y CARGO LAS PROPIEDADES
                jCListaPropiedades.removeAllItems();
                List<Propiedad> propiedadesDelPropietario = pd.listarPropiedadesXDueño(propietarioSeleccionado.getIdPropietario());

                for (Propiedad propiedad : propiedadesDelPropietario) {
                    jCListaPropiedades.addItem(propiedad);
                }
                limpiarCampos();
                rellenarCampos();

            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un propietario válido");
            }
        }
    }

    public void deshabilitarBotones() {

        jBGuardarPropiedades.setEnabled(false);
        jBModificarPropiedades.setEnabled(false);
        jBEliminarPropiedades.setEnabled(false);

    }

    public void habilitarBotones() {

        jBGuardarPropiedades.setEnabled(false);
        jBModificarPropiedades.setEnabled(true);
        jBEliminarPropiedades.setEnabled(true);
    }

    public void combosEnBlanco() {
        jCListaPropietarios.setSelectedItem(null);
        jCListaPropiedades.setSelectedItem(null);
        jCListaInspectoresPropiedades.setSelectedItem(null);
        jCListarZonaPropiedades.setSelectedItem(null);
        jCListarEstadoPropiedades.setSelectedItem(null);
        jCListaTipoPropiedades.setSelectedItem(null);
    }
}
