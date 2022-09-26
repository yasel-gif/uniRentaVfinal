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



public class RegistroEstudiante extends javax.swing.JFrame {
    //Conexion con la base de datos
    PreparedStatement ps=null;
    ResultSet rs=null;
    BaseDeDatosConexion con=new BaseDeDatosConexion();
    Connection conn=con.getConection();  
    
    public RegistroEstudiante() {
        initComponents();
    }
    
    private void limpiar(){
        //limpia los jtextfield despues de que un estudiante se registre en caso de que exista en nuevo registro
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
        registroEstudiante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
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
        bienvReg.setText("Bienvenido, ingrese sus datos para registrarse.");
        getContentPane().add(bienvReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 620, 40));

        nombre.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 51, 0));
        nombre.setText("Nombre(s):");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        apellido.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(204, 51, 0));
        apellido.setText("Apellidos:");
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        cp.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        cp.setForeground(new java.awt.Color(204, 51, 0));
        cp.setText("Nombre escuela:");
        getContentPane().add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        sexo.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(204, 51, 0));
        sexo.setText("Genero:");
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        tel.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        tel.setForeground(new java.awt.Color(204, 51, 0));
        tel.setText("Telefono:");
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        correo.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(204, 51, 0));
        correo.setText("Correo Electronico:");
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        pasw.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        pasw.setForeground(new java.awt.Color(204, 51, 0));
        pasw.setText("Contraseña:");
        getContentPane().add(pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 130, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 130, -1));
        getContentPane().add(txtEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 130, 30));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 130, 30));

        tw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t.jpg"))); // NOI18N
        getContentPane().add(tw, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 70, 70));

        fb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f.jpg"))); // NOI18N
        getContentPane().add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 70, 70));

        inst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/i.jpg"))); // NOI18N
        getContentPane().add(inst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 70, 70));

        Volver.setBackground(new java.awt.Color(0, 153, 153));
        Volver.setText("Volver");
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
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 90, 30));
        getContentPane().add(passContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 130, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 130, 30));

        registroEstudiante.setBackground(new java.awt.Color(0, 153, 153));
        registroEstudiante.setText("Registrate");
        registroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(registroEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 90, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 190, 20));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 130, 30));
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 130, 30));

        fondo.setBackground(new java.awt.Color(0, 153, 153));
        fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backGround.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
       
    }//GEN-LAST:event_VolverMouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void registroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEstudianteActionPerformed
        try{ 
            //Consulta sql que inserta a la base de datos todos los datos del estudiante
            ps=conn.prepareStatement("INSERT INTO estudiante (nombre,apellido,fecha,escuela,genero,telefono,correo,contra) VALUES (?,?,?,?,?,?,?,?)"); 
            //guarda los datos de los jtextfield de acuerdo al campo de la base de datos
            ps.setString(1,txtNombre.getText());
            ps.setString(2,txtApellido.getText());
            ps.setString(3,txtFecha.getText());
            ps.setString(4,txtEscuela.getText());
            ps.setString(5,txtGenero.getText());
            ps.setString(6,txtTel.getText());
            ps.setString(7,txtCorreo.getText());
            String pass=new String(passContra.getPassword());
            ps.setString(8,pass);           
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Estudiante registrado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al registrar");
                limpiar();
            }
        }
        catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null, "Ingrese sus datos correctamente");
        }
    }//GEN-LAST:event_registroEstudianteActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        try {
            //envia de regreso a la ventana de menu registro
            RegistroNuevo menureg = new RegistroNuevo();
            conn.close();
            //    menuReg.recibeIdArr.setText(txtId.getText());
            menureg.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VolverActionPerformed

 
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
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel bienvReg;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel cp;
    private javax.swing.JButton fb;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton inst;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre;
    private javax.swing.JPasswordField passContra;
    private javax.swing.JLabel pasw;
    private javax.swing.JButton registroEstudiante;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tel;
    private javax.swing.JButton tw;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEscuela;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField unirenta;
    // End of variables declaration//GEN-END:variables

  
}
