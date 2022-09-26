package ventanas;
import conexion.BaseDeDatosConexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.SELECT;



public class Estudiante extends javax.swing.JFrame {
    //Conecta a la base de datos
    PreparedStatement ps=null;
    ResultSet rs=null;
    BaseDeDatosConexion con=new BaseDeDatosConexion();
    Connection conn=con.getConection();  
    
    public Estudiante() {
        initComponents();
        //vuelve unvisible un jtextfield que guarda un id
        txtId.setVisible(false);
    }
    
    private void limpiar(){
        //Limpia los jtextfield despues de realizar alguna accion referente al estudiante
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtFecha.setText(null);
        txtEscuela.setText(null);
        txtGenero.setText(null);
        txtTel.setText(null);
        txtCorreo.setText(null);
        passContra.setText(null);
    }
    
     public Image getIconImage(){
         //Logotipo de la app
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo2.jpg"));
        return retValue;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        unirenta = new javax.swing.JTextField();
        bienvReg = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        pasw = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEscuela = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        tw = new javax.swing.JButton();
        fb = new javax.swing.JButton();
        inst = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        passContra = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        btnModif = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        codigoRes = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2.jpg"))); // NOI18N
        logo.setText("jLabel2");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, -1));

        unirenta.setEditable(false);
        unirenta.setBackground(new java.awt.Color(102, 204, 0));
        unirenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unirenta.setText("    UNIRENTA");
        getContentPane().add(unirenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 30));

        bienvReg.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        bienvReg.setForeground(new java.awt.Color(0, 204, 204));
        bienvReg.setText("Bienvenido realice la accion que desea.");
        getContentPane().add(bienvReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 540, 40));

        nombre.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 51, 0));
        nombre.setText("Nombre(s):");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        apellido.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(204, 51, 0));
        apellido.setText("Apellidos:");
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        cp.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        cp.setForeground(new java.awt.Color(204, 51, 0));
        cp.setText("Nombre escuela:");
        getContentPane().add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        sexo.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(204, 51, 0));
        sexo.setText("Genero:");
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        tel.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        tel.setForeground(new java.awt.Color(204, 51, 0));
        tel.setText("Telefono:");
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        correo.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(204, 51, 0));
        correo.setText("Correo Electronico:");
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        pasw.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        pasw.setForeground(new java.awt.Color(204, 51, 0));
        pasw.setText("Contraseña:");
        getContentPane().add(pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 130, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 130, -1));
        getContentPane().add(txtEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 130, 30));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 130, 30));

        tw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t.jpg"))); // NOI18N
        getContentPane().add(tw, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 70, 70));

        fb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f.jpg"))); // NOI18N
        getContentPane().add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 70, 70));

        inst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/i.jpg"))); // NOI18N
        getContentPane().add(inst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 70, 70));

        Volver.setBackground(new java.awt.Color(0, 153, 153));
        Volver.setText("Cerrar sesion");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 30));
        getContentPane().add(passContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 130, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 130, 30));

        btnModif.setBackground(new java.awt.Color(0, 153, 153));
        btnModif.setText("Guardar cambios");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });
        getContentPane().add(btnModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 130, 30));

        btnElim.setBackground(new java.awt.Color(0, 153, 153));
        btnElim.setText("Eliminar usuario");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });
        getContentPane().add(btnElim, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 140, 30));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 190, 20));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 130, 30));

        mostrar.setBackground(new java.awt.Color(0, 153, 153));
        mostrar.setText("Mostrar datos actuales");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 170, 30));
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 130, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Si tiene reservacion a continuacion se muestra su codigo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 510, -1));

        codigoRes.setEditable(false);
        getContentPane().add(codigoRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 80, 30));

        fondo.setBackground(new java.awt.Color(0, 153, 153));
        fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backGround.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
       
    }//GEN-LAST:event_VolverMouseClicked

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed

        try{
            //Consulta que elimina un estudiante de acuerdo a su id
            ps=conn.prepareStatement("DELETE FROM estudiante WHERE id_estudiante=?");
            ps.setInt(1,Integer.parseInt(txtId.getText()));            
            int res=ps.executeUpdate(); 
            if(res>0){
                JOptionPane.showMessageDialog(null, "estudiante eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar estudiante");
                limpiar();
            }
        }
        catch(HeadlessException | SQLException e){
           System.err.println(e);
        }
        //Nos manda de regreso a la ventana anterior(iniciar sesion)
        IniciarSesionEst isEst = new IniciarSesionEst();
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        isEst.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnElimActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed

        try{ 
            //Consulta sql que modifica los campos de un estudiante de acuerdo al id_estudiante
            ps=conn.prepareStatement("UPDATE estudiante SET nombre=?,apellido=?,fecha=?,escuela=?,genero=?,telefono=?,correo=?,contra=? WHERE id_estudiante=?");
            //Muestra los datos actuales del estudiante y los almacena en los jtextfiel para visualizarlos
            ps.setString(1,txtNombre.getText());
            ps.setString(2,txtApellido.getText());
            ps.setDate(3,Date.valueOf(txtFecha.getText()));
            ps.setString(4,txtEscuela.getText());
            ps.setString(5,txtGenero.getText());
            ps.setString(6,txtTel.getText());
            ps.setString(7,txtCorreo.getText());
            String pass=new String(passContra.getPassword());
            ps.setString(8,pass);           
            int ide=Integer.parseInt(txtId.getText());
            ps.setInt(9,ide);
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Estudiante modificado");
                //Limpia los jtextfield despues de una modificacion
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }
        catch(HeadlessException | SQLException e){
           System.err.println(e);
        }
    }//GEN-LAST:event_btnModifActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        try {
            //Nos manda a la ventana de inicio de sesion estudiante
            IniciarSesionEst isEst = new IniciarSesionEst();
            conn.close();
            //    menuReg.recibeIdArr.setText(txtId.getText());
            isEst.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VolverActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

        try{
            BaseDeDatosConexion con=new BaseDeDatosConexion();
            Connection conn=con.getConection();
            //Consulta sql que selecciona un estudiante de acuerdo a su id
            ps=conn.prepareStatement("SELECT * FROM estudiante WHERE id_estudiante = ?");
            int ide=Integer.parseInt(txtId.getText());
            ps.setInt(1,ide);
            rs=ps.executeQuery();
            if(rs.next()){  
                //Almacena en jtextfield la informacion del estudiante actual de la base de datos
                txtNombre.setText(rs.getString("nombre"));
                txtApellido.setText(rs.getString("apellido"));
                txtFecha.setText(rs.getString("fecha"));
                txtEscuela.setText(rs.getString("escuela"));
                txtGenero.setText(rs.getString("genero"));
                txtTel.setText(rs.getString("telefono"));  
                txtCorreo.setText(rs.getString("correo"));
                passContra.setText(rs.getString("contra"));
                codigoRes.setText(rs.getString("codigo"));        
            }else{
                JOptionPane.showMessageDialog(null,"No existe el usuario");
            }
        }
        catch(HeadlessException | SQLException e){
           System.err.println(e);
        }
    }//GEN-LAST:event_mostrarActionPerformed

 
    public static void main(String args[]) {

          /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel bienvReg;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnModif;
    private javax.swing.JTextField codigoRes;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel cp;
    private javax.swing.JButton fb;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton inst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel nombre;
    private javax.swing.JPasswordField passContra;
    private javax.swing.JLabel pasw;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tel;
    private javax.swing.JButton tw;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEscuela;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGenero;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField unirenta;
    // End of variables declaration//GEN-END:variables

  
}
