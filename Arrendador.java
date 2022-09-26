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
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.SELECT;



public class Arrendador extends javax.swing.JFrame {
    //Conexion a la base de datos
    PreparedStatement ps=null;
    ResultSet rs=null;
    BaseDeDatosConexion con=new BaseDeDatosConexion();
    Connection conn=con.getConection();  
    
    public Arrendador() {
        initComponents();
        txtId.setVisible(false);
    }
    //metodo que limpia los cambios despues de realizar alguna acción.
    private void limpiar(){
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtFecha.setText(null);
        txtIde.setText(null);
        txtEntidad.setText(null);
        txtMunicipio.setText(null);
        txtCp.setText(null);
        txtDir.setText(null);
        txtDescCasa.setText(null);
        txtGenero.setText(null);
        txtTel.setText(null);
        txtCorreo.setText(null);
        passContra.setText(null);
    }
    //logo de la pagina
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
        ide = new javax.swing.JLabel();
        entidad = new javax.swing.JLabel();
        municipio = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();
        descrip = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        pasw = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtIde = new javax.swing.JTextField();
        txtEntidad = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        txtCp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescCasa = new javax.swing.JTextArea();
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
        jLabel3 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
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
        bienvReg.setText("Bienvenido, realice la accion que desea ");
        getContentPane().add(bienvReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 530, 40));

        nombre.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 51, 0));
        nombre.setText("Nombre:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        apellido.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(204, 51, 0));
        apellido.setText("Apellidos:");
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        ide.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        ide.setForeground(new java.awt.Color(204, 51, 0));
        ide.setText("Numero de identificacion:");
        getContentPane().add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        entidad.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        entidad.setForeground(new java.awt.Color(204, 51, 0));
        entidad.setText("Entidad Federativa:");
        getContentPane().add(entidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        municipio.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        municipio.setForeground(new java.awt.Color(204, 51, 0));
        municipio.setText("Municipio:");
        getContentPane().add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        cp.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        cp.setForeground(new java.awt.Color(204, 51, 0));
        cp.setText("Codigo Postal:");
        getContentPane().add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        descrip.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        descrip.setForeground(new java.awt.Color(204, 51, 0));
        descrip.setText("Descripcion:");
        getContentPane().add(descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        sexo.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(204, 51, 0));
        sexo.setText("Genero:");
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, -1, -1));

        tel.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        tel.setForeground(new java.awt.Color(204, 51, 0));
        tel.setText("Telefono:");
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        correo.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(204, 51, 0));
        correo.setText("Correo Electronico:");
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        pasw.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        pasw.setForeground(new java.awt.Color(204, 51, 0));
        pasw.setText("Contraseña:");
        getContentPane().add(pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 130, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 130, -1));
        getContentPane().add(txtIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 130, 30));
        getContentPane().add(txtEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 130, -1));
        getContentPane().add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 130, -1));
        getContentPane().add(txtCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 130, 30));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txtDescCasa.setBackground(new java.awt.Color(0, 0, 51));
        txtDescCasa.setColumns(20);
        txtDescCasa.setForeground(new java.awt.Color(255, 255, 255));
        txtDescCasa.setRows(5);
        jScrollPane1.setViewportView(txtDescCasa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 260, 120));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 130, 30));

        tw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t.jpg"))); // NOI18N
        getContentPane().add(tw, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 70, 70));

        fb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f.jpg"))); // NOI18N
        getContentPane().add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 70, 70));

        inst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/i.jpg"))); // NOI18N
        getContentPane().add(inst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 70, 70));

        Volver.setBackground(new java.awt.Color(0, 153, 153));
        Volver.setText("volver");
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
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 30));
        getContentPane().add(passContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 130, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 130, 30));

        btnModif.setBackground(new java.awt.Color(0, 153, 153));
        btnModif.setText("Guardar cambios");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });
        getContentPane().add(btnModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 140, 30));

        btnElim.setBackground(new java.awt.Color(0, 153, 153));
        btnElim.setText("Eliminar usuario");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });
        getContentPane().add(btnElim, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 140, 30));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 60, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 190, 20));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 130, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 100, 20));
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 130, 30));

        mostrar.setBackground(new java.awt.Color(0, 153, 153));
        mostrar.setText("Mostrar Datos actuales");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 160, 30));
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 130, 30));

        fondo.setBackground(new java.awt.Color(0, 153, 153));
        fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backGround.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
       
    }//GEN-LAST:event_VolverMouseClicked

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        //Funcion que elimina en arrendador
        try{
            JOptionPane.showMessageDialog(null,"Seguro que desea eliminar su usuario?");
            //Consulta sql para eliminar 
            ps=conn.prepareStatement("DELETE FROM arrendador WHERE id_arrendador=?");
            ps.setInt(1,Integer.parseInt(txtId.getText()));            
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Arrendador eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar arrendador");
                limpiar();
            }
            conn.close();
        }
        //muestra posible error
        catch(HeadlessException | SQLException e){
           System.err.println(e);
        }
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
            BaseDeDatosConexion con=new BaseDeDatosConexion();
            Connection conn=con.getConection();  
            //consulta aql para modificar campos del arrendador
            ps=conn.prepareStatement("UPDATE arrendador SET nombre=?,apellido=?,fecha=?,numIde=?,entidad=?,Municipio=?,cp=?,dir=?,descrip=?,genero=?,telefono=?,correo=?,contra=? WHERE id_arrendador=?");
            //obtiene el contenido de cada campo para ingresarlo a la base de datos
            ps.setString(1,txtNombre.getText());
            ps.setString(2,txtApellido.getText());
            ps.setDate(3,Date.valueOf(txtFecha.getText()));
            ps.setString(4,txtIde.getText());
            ps.setString(5,txtEntidad.getText());
            ps.setString(6,txtMunicipio.getText());
            ps.setString(7,txtCp.getText());
            ps.setString(8,txtDir.getText());
            ps.setString(9,txtDescCasa.getText());
            ps.setString(10,txtGenero.getText());
            ps.setString(11,txtTel.getText());
            ps.setString(12,txtCorreo.getText());
            //Se ejecuta la consulta cuando el de acuerdo al id_arrendador
            String pass=new String(passContra.getPassword());
            ps.setString(13,pass);           
            int ide=Integer.parseInt(txtId.getText());
            ps.setInt(14,ide);
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Arrendador modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar arrendador");
                limpiar();
            }
            //Cierra la conexion
            conn.close();
        }
        //muestra posoble error
        catch(HeadlessException | SQLException e){
           System.err.println(e);
        }
    }//GEN-LAST:event_btnModifActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
       //Nos manda a la ventana MenuArrendador
       MenuArrendador menuarr = new MenuArrendador();
       //Envia id del arrendador a la ventana anterior
       menuarr.recibeIdArr.setText(txtId.getText());
       menuarr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

        try{
            //Conexion a base de datos
            BaseDeDatosConexion con=new BaseDeDatosConexion();
            Connection conn=con.getConection();
            //Consulta sql que selecciona todos los campos del arrendador de acuerdo al id_arrendador 
            ps=conn.prepareStatement("SELECT * FROM arrendador WHERE id_arrendador = ?");
            int ide=Integer.parseInt(txtId.getText());
            ps.setInt(1,ide);
            rs=ps.executeQuery();
            if(rs.next()){  
            //Muestra en cada campo los datos guardados en la base de datos    
                txtNombre.setText(rs.getString("nombre"));
                txtApellido.setText(rs.getString("apellido"));
                txtFecha.setText(rs.getString("fecha"));
                txtIde.setText(rs.getString("numIde"));
                txtEntidad.setText(rs.getString("entidad"));
                txtMunicipio.setText(rs.getString("Municipio"));
                txtCp.setText(rs.getString("cp"));
                txtDir.setText(rs.getString("dir"));
                txtDescCasa.setText(rs.getString("descrip"));
                txtGenero.setText(rs.getString("genero"));
                txtTel.setText(rs.getString("telefono"));  
                txtCorreo.setText(rs.getString("correo"));
                passContra.setText(rs.getString("contra"));
               
            }else{
                JOptionPane.showMessageDialog(null,"No existe el usuario");
            }
        //Cacha posible error    
        }catch(HeadlessException | SQLException e){
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
            java.util.logging.Logger.getLogger(Arrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arrendador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel bienvReg;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnModif;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel descrip;
    private javax.swing.JLabel entidad;
    private javax.swing.JButton fb;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel ide;
    private javax.swing.JButton inst;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel municipio;
    private javax.swing.JLabel nombre;
    private javax.swing.JPasswordField passContra;
    private javax.swing.JLabel pasw;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tel;
    private javax.swing.JButton tw;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCp;
    private javax.swing.JTextArea txtDescCasa;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEntidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGenero;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIde;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField unirenta;
    // End of variables declaration//GEN-END:variables

  
}
