/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexion.BaseDeDatosConexion;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 52953
 */
public class ReservaAlojamiento extends javax.swing.JFrame {
    //instancia conexion a la base de datos
    PreparedStatement ps=null;
    ResultSet rs=null;
    BaseDeDatosConexion con=new BaseDeDatosConexion();
    Connection conn=con.getConection();     
    
    public ReservaAlojamiento() {
        initComponents();
        //oculta jtextfield que guardan id's para posteriormente utulizarlos en las consultas
        guardaIdAl.setVisible(false);
        saveIdEst.setVisible(false);
        saveIdEst.setVisible(false);
        txtDisp.setVisible(false);
    }
    
    //metodo que muestra en una tabla los detalles del alojamiento seleccionado al inicio de la aplicacion
    public void mostrar1(){
        DefaultTableModel modelo1;
        modelo1=new DefaultTableModel();
        File archivo;
        try{
            DefaultTableModel modelo =new DefaultTableModel();
            detallesAlojamiento.setModel(modelo); 
            BaseDeDatosConexion con=new BaseDeDatosConexion();
            Connection conn=con.getConection();
            //consulta sql que selecciona los campos que seran acomodados en la tabla
            ps=conn.prepareStatement("SELECT id_alojamiento, titulo, entidad, municipio, cp, dir, numHabs FROM alojamiento WHERE id_alojamiento = ?");
            String id=guardaIdAl.getText(); 
            ps.setString(1,id);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas=rsMd.getColumnCount();
            //crea las columnas de la tabla y les da un titulo
            modelo1.addColumn("Id_Alojamiento");
            modelo1.addColumn("Titulo");
            modelo1.addColumn("Entidad Federativa");
            modelo1.addColumn("Ciudad o Municipio");
            modelo1.addColumn("Codigo Postal");
            modelo1.addColumn("Direccion");
            modelo1.addColumn("Numero de Habitaciones");
            this.detallesAlojamiento.setModel(modelo1);
            while(rs.next()){
                Object[] filas=new Object[cantColumnas];
                //for(int i=0; i<cantColumnas-1; i++){
                    //ordena los campos en la tabla de acuerdo a la consulta
                    filas[0]=rs.getObject(1);
                    filas[1]=rs.getObject(2);
                    filas[2]=rs.getObject(3);
                    filas[3]=rs.getObject(4);
                    filas[4]=rs.getObject(5);
                    filas[5]=rs.getObject(6);
                    filas[6]=rs.getObject(7);
                modelo1.addRow(filas);
            }
        }
        catch(SQLException exp){
            System.err.println(exp.toString());
        }
    }
    
    //metodo que muestra los datos del alojamiento en una segunda tabla
    //esto solo por presentacion.
    public void mostrar2(){        
        DefaultTableModel modelo2;
        modelo2=new DefaultTableModel();
        File archivo;
        try{
            DefaultTableModel modelo =new DefaultTableModel();
            masDetalles.setModel(modelo);
            BaseDeDatosConexion con=new BaseDeDatosConexion();
            Connection conn=con.getConection();
            //consulta sql que selecciona los campos que seran acomodados en la tabla
            ps=conn.prepareStatement("SELECT costo, servicios, tipo, detalles, arrendador_id, disponibilidad,imagen FROM alojamiento WHERE id_alojamiento = ?");
            String id=guardaIdAl.getText(); 
            ps.setString(1,id);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas=rsMd.getColumnCount();
            //crea las columnas de la tabla y les da un titulo
            modelo2.addColumn("Costo");
            modelo2.addColumn("Servicios");
            modelo2.addColumn("Tipo");
            modelo2.addColumn("Detalles");
            modelo2.addColumn("arrendador_id");
            modelo2.addColumn("Disponibilidad");
            modelo2.addColumn("Imagen");
            this.masDetalles.setModel(modelo2);  
            while(rs.next()){
                Object[] filas=new Object[cantColumnas];
                //for(int i=0; i<cantColumnas-1; i++){
                //ordena los campos en la tabla de acuerdo a la consulta
                    filas[0]=rs.getObject(1);
                    filas[1]=rs.getObject(2);
                    filas[2]=rs.getObject(3);
                    filas[3]=rs.getObject(4);
                    filas[4]=rs.getObject(5);
                    filas[5]=rs.getObject(6);
                    filas[6]=rs.getObject(7);
                modelo2.addRow(filas);
            }
        }
        catch(SQLException exp){
            System.err.println(exp.toString());
        }
    }
    
    //costo, servicios, tipo, detalles, arrendador_id, disponibilidad,imagen
    
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo2.jpg"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        unirenta = new javax.swing.JTextField();
        inicio = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        face = new javax.swing.JButton();
        tw = new javax.swing.JButton();
        inst = new javax.swing.JButton();
        ISreservar = new javax.swing.JButton();
        servicios = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        ReservaRegistrate = new javax.swing.JButton();
        guardaIdAl = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        detallesAlojamiento = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masDetalles = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        saveIdEst = new javax.swing.JTextField();
        txtDisp = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2.jpg"))); // NOI18N
        logo.setText("jLabel2");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 150, 140));

        unirenta.setBackground(new java.awt.Color(102, 204, 0));
        unirenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unirenta.setText("     UNIRENTA");
        getContentPane().add(unirenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 150, 30));

        inicio.setBackground(new java.awt.Color(0, 153, 153));
        inicio.setText("Volver al inicio");
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 130, 30));

        buscar.setBackground(new java.awt.Color(0, 102, 102));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 120, 110, 30));

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, 160, 30));

        face.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f.jpg"))); // NOI18N
        getContentPane().add(face, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 70, 70));

        tw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t.jpg"))); // NOI18N
        getContentPane().add(tw, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 70, 70));

        inst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/i.jpg"))); // NOI18N
        getContentPane().add(inst, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 70, 70));

        ISreservar.setBackground(new java.awt.Color(0, 153, 153));
        ISreservar.setText("Reservar");
        ISreservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ISreservarMouseClicked(evt);
            }
        });
        ISreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISreservarActionPerformed(evt);
            }
        });
        getContentPane().add(ISreservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 100, 30));

        servicios.setFont(new java.awt.Font("Sitka Subheading", 3, 21)); // NOI18N
        servicios.setForeground(new java.awt.Color(204, 51, 0));
        servicios.setText("¿No tienes cuenta aun? ");
        getContentPane().add(servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 240, -1));

        volver.setBackground(new java.awt.Color(0, 153, 153));
        volver.setText("Volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 70, 30));

        ReservaRegistrate.setBackground(new java.awt.Color(0, 153, 153));
        ReservaRegistrate.setText("Registrate aqui");
        ReservaRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservaRegistrateActionPerformed(evt);
            }
        });
        getContentPane().add(ReservaRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 120, 30));
        getContentPane().add(guardaIdAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 60, -1));

        detallesAlojamiento.setBackground(new java.awt.Color(204, 153, 255));
        detallesAlojamiento.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        detallesAlojamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        detallesAlojamiento.setSelectionBackground(new java.awt.Color(153, 51, 255));
        jScrollPane2.setViewportView(detallesAlojamiento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 1250, 60));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Mostrar datos alojamiento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 190, 30));

        masDetalles.setBackground(new java.awt.Color(204, 153, 255));
        masDetalles.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        masDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        masDetalles.setSelectionBackground(new java.awt.Color(153, 51, 255));
        jScrollPane1.setViewportView(masDetalles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 1250, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 140, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Inicia Sesion para reservar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 240, 30));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 140, 30));
        getContentPane().add(saveIdEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 60, -1));
        getContentPane().add(txtDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 60, -1));

        fondo.setBackground(new java.awt.Color(0, 153, 153));
        fondo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fondo.setForeground(new java.awt.Color(204, 51, 0));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backGround.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void ISreservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISreservarMouseClicked
 
    }//GEN-LAST:event_ISreservarMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked

    }//GEN-LAST:event_volverMouseClicked

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
       //boton que los lleva a la ventana de inicio de nuestra aplicacion despues de realizar una busqueda
       BusquedaAlojamiento index = new BusquedaAlojamiento();
       index.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_inicioMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       //boton que los lleva a la ventana de inicio de nuestra aplicacion despues de realizar una busqueda
       BusquedaAlojamiento index = new BusquedaAlojamiento();
       index.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //boton que nos sirve para mostrar todos los detalles respecto al alojamiento seleccionado antes de hacer la reserva
        mostrar1();
        mostrar2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ISreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISreservarActionPerformed
        //para poder realizar una reserva se tiene que iniciar sesion
        //Se guarda en variable string el id del alojamiento que se usara para reliazar el proceso de reservacion
        String d=guardaIdAl.getText();
        int dis=disponible(d);
        System.out.println("esto retorna la funcion: "+dis);
        if(dis==1){
            String pas=new String(txtContra.getPassword());
            //Llama a la funcion que hace la consulta  para ver si el estudiante existe
            int id=login(txtUsuario.getText(),pas); 
            // String Cad= String.valueOf(id);
            if(id!=0){
                FinalizarReservaPago finRes = new FinalizarReservaPago();
                finRes.setVisible(true);
                finRes.guardaIdEst.setText(saveIdEst.getText());
                finRes.guardaIdAl.setText(guardaIdAl.getText());
                this.dispose();
            }  
        }else{
            JOptionPane.showMessageDialog(null,"Alojamiento no disponible");
        }   
    }//GEN-LAST:event_ISreservarActionPerformed

     public int login(String user, String pass){
        Integer result=0,id;
        MenuArrendador menu = new MenuArrendador();
        try{
            Statement ejecutor=conn.createStatement();
            //Consulta sql que busca que el correo y la contraseña ingresados para iniciar sesion
            //y posteriormente realizar una reservacion, sean correctos
            ResultSet rs=ejecutor.executeQuery("SELECT * FROM estudiante WHERE correo='"+user+"' AND contra='"+pass+"'");
            if(rs.next()){
                //guarda el id del estudiante que inicia sesion y lo almacena en un jtextfield
                saveIdEst.setText(rs.getString("id_estudiante"));  //Guarda id en txtId 
                result=1;
            }else{
                JOptionPane.showMessageDialog(null,"Problemas con el usuario y/o contraseña");
                result=0;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar"+e.getMessage(),e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    
     //metodo que verifica que un alojamiento este disponible para ser reservado
    public int disponible(String idAl){
        Integer result=0;
        try{
            Statement ejecutor=conn.createStatement();
            //consulta sql que verifica que el alojamiento este disponible
            ResultSet rs=ejecutor.executeQuery("SELECT disponibilidad FROM alojamiento WHERE id_alojamiento='"+idAl+"'");
            if(rs.next()){
               txtDisp.setText(rs.getString("disponibilidad"));  //Guarda si esta disponible en txtDisp
               String disp=txtDisp.getText();
                System.out.println("esto tiene disp:"+disp);
                String cadena1 = new String("Si");
                String cadena2 = new String("SI");
                String cadena3 = new String("si");
                String cadena4 = new String("sI");
                //Verifica que las cadenas sean iguales de ser asi el alojamiento esta disponible
               if(disp.equals(cadena1)||disp.equals(cadena2)||disp.equals(cadena3)||disp.equals(cadena4)){
                    result=1;
               }else{
                   System.out.println("entra aqui:"+disp);
                   result=0;
               }    
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo realizar la consulta");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar"+e.getMessage(),e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    
    private void ReservaRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservaRegistrateActionPerformed
       //boton que nos manda a una ventana donde el estudiante podra regustrarse si no lo esta aun
       ReservaRegistro resreg = new ReservaRegistro();
       resreg.setVisible(true);
       //guarda el id del alojamiento para que no se pierda y se pueda continuar con la reservacion 
       resreg.guardaIdAl.setText(guardaIdAl.getText());
       this.dispose();          
    }//GEN-LAST:event_ReservaRegistrateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservaAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaAlojamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ISreservar;
    private javax.swing.JButton ReservaRegistrate;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTable detallesAlojamiento;
    private javax.swing.JButton face;
    private javax.swing.JLabel fondo;
    public javax.swing.JTextField guardaIdAl;
    private javax.swing.JButton inicio;
    private javax.swing.JButton inst;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JTable masDetalles;
    private javax.swing.JTextField saveIdEst;
    private javax.swing.JLabel servicios;
    private javax.swing.JButton tw;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtDisp;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField unirenta;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
