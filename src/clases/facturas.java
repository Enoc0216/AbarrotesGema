/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import java.awt.event.KeyEvent;
/**
 *
 * @author LEMUEL
 */
public class facturas extends javax.swing.JFrame {

    /**
     * Creates new form factura
     */
    public facturas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("facturas");
        limpiar ();
        bloquear ();
        //desbloquear ();
        //mostrardatos("");
    }
void mostrardatos(String valor) {
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre_del_proveedor");
    modelo.addColumn("Producto");
    modelo.addColumn("Cantidad_de_producto");
    modelo.addColumn("Precio");
    tbfacturas.setModel(modelo);
    
    String sql="";
    if (valor.equals(""))
    {
        sql="SELECT * FROM facturas";
    }
    else{
        sql= "SELECT * FROM facturas where CONCAT (cod_fac,' ',nompro_fac,' ',prod_fac,' ',cant_fac,' ',prec_fac) LIKE '%"+valor+"%'";
    }
    String []datos = new String[5];
    try {
        Statement st =cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            modelo.addRow(datos);
        }
        tbfacturas.setModel(modelo);
      }catch (SQLException ex) {
        Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
void limpiar(){
    
    txtnom.setText("");
    txtprod.setText("");
    txtcant.setText("");
    txtprec.setText("");
}
    void bloquear(){
        txttem.setEnabled(false);
        txtcod.setEnabled(false);
        txtnom.setEnabled(false);
        txtprod.setEnabled(false);
        txtcant.setEnabled(false);
        txtprec.setEnabled(false);
        txtreg.setEnabled(false);
        jButton1.setEnabled(true);
        jButton3.setEnabled(false);
    }
    
    void desbloquear(){
       
        txtnom.setEnabled(true);
        txtprod.setEnabled(true);
        txtcant.setEnabled(true);
        txtprec.setEnabled(true);
        txtreg.setEnabled(true);
        jButton1.setEnabled(false);
        jButton3.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtprod = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        txtprec = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtreg = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbfacturas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txttem = new javax.swing.JTextField();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setText("Nombre del proveedor");

        jLabel2.setText("Producto ");

        jLabel3.setText("Cantidad de productos");

        jLabel4.setText("Precio");

        txtnom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomKeyPressed(evt);
            }
        });

        txtprod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodActionPerformed(evt);
            }
        });
        txtprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprodKeyPressed(evt);
            }
        });

        txtcant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtcant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantActionPerformed(evt);
            }
        });
        txtcant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantKeyPressed(evt);
            }
        });

        txtprec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtprec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecActionPerformed(evt);
            }
        });
        txtprec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/btnnuevo.gif"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtreg.setBackground(new java.awt.Color(255, 255, 0));
        txtreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/registrar.png"))); // NOI18N
        txtreg.setText("Registrar");
        txtreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/DeleteRed.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/modificar.png"))); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/1447321202_1-04.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/buscar.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/mostrar todo.png"))); // NOI18N
        jButton8.setText("Mostrar todo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tbfacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbfacturas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbfacturas);

        jLabel5.setText("Codigo");

        txtcod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/salir.png"))); // NOI18N
        jButton2.setText("Regresar a la Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txttem.setBackground(new java.awt.Color(255, 204, 255));
        txttem.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        txttem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttem.setText("FACTURAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnom, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(txtprod)
                            .addComponent(txtcant)
                            .addComponent(txtprec)
                            .addComponent(txtcod))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1)
                                .addGap(56, 56, 56)
                                .addComponent(txtreg)
                                .addGap(62, 62, 62)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtbuscar)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton4)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton8))
                        .addGap(95, 95, 95))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(159, 159, 159))
            .addComponent(txttem)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txttem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregActionPerformed
        // TODO add your handling code here:
                try {
     PreparedStatement pst = cn.prepareStatement("INSERT INTO facturas (nompro_fac,prod_fac,cant_fac,prec_fac) VALUES(?,?,?,?)");
     pst.setString(1, txtnom.getText());
     pst.setString(2, txtprod.getText());
     pst.setString(3, txtcant.getText());
     pst.setString(4, txtprec.getText());
     
     pst.executeUpdate();
     mostrardatos("");
        }catch (Exception e) {
           
        }
          
    }//GEN-LAST:event_txtregActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            desbloquear();
    limpiar();
    txtnom.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                try {    
        PreparedStatement pst = cn.prepareStatement("UPDATE facturas SET nompro_fac='"+txtnom.getText()+"',prod_fac='"+txtprod.getText()+"',cant_fac='"+txtcant.getText()+"',prec_fac='"+txtprec.getText()+"' WHERE cod_fac='"+txtcod.getText()+"'");
        pst.executeUpdate();
        mostrardatos("");
        } catch (Exception e) {
            System.out.print(e.getMessage());    
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             bloquear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
         txtnom.transferFocus();
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodActionPerformed
        // TODO add your handling code here:
         txtprod.transferFocus();
    }//GEN-LAST:event_txtprodActionPerformed

    private void txtcantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantActionPerformed
        // TODO add your handling code here:
         txtcant.transferFocus();
    }//GEN-LAST:event_txtcantActionPerformed

    private void txtprecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecActionPerformed
        // TODO add your handling code here:
         txtprec.transferFocus();
    }//GEN-LAST:event_txtprecActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
               mostrardatos(txtbuscar.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
          jButton8.transferFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
                int fila= tbfacturas.getSelectedRow();
        if (fila>=0) {
            txtcod.setText(tbfacturas.getValueAt(fila, 0).toString());
            txtnom.setText(tbfacturas.getValueAt(fila, 1).toString());
            txtprod.setText(tbfacturas.getValueAt(fila, 2).toString());
            txtcant.setText(tbfacturas.getValueAt(fila, 3).toString());
            txtprec.setText(tbfacturas.getValueAt(fila, 4).toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "no selecciono fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
                    int fila = tbfacturas.getSelectedRow();
        String cod="";
        cod=tbfacturas.getValueAt(fila, 0).toString();
        try {
         PreparedStatement pst = cn.prepareStatement("DELETE FROM facturas WHERE cod_fac='"+cod+"'");
         pst.executeUpdate();
         mostrardatos("");
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Principal obj=new Principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyPressed
        // TODO add your handling code here:
       if (txtnom.getText().length() >= 20) {
       evt.setKeyChar((char) KeyEvent.VK_CLEAR);                                  //Limpiar el carácter ingresado
       JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de caracteres!!! (20)", "Validando Datos",
       JOptionPane.ERROR_MESSAGE);
    }
   int k = (int) evt.getKeyChar();                                                               //k = al valor de la tecla presionada   
         if (k > 47 && k < 58) {                                                                 //Si el carácter ingresado es una letra
          evt.setKeyChar((char) KeyEvent.VK_CLEAR);                                //Limpiar el carácter ingresado
          JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
          JOptionPane.ERROR_MESSAGE);
    }   

    }//GEN-LAST:event_txtnomKeyPressed

    private void txtprodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodKeyPressed
        // TODO add your handling code here:
               if (txtprod.getText().length() >= 20) {
       evt.setKeyChar((char) KeyEvent.VK_CLEAR);                                  //Limpiar el carácter ingresado
       JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de caracteres!!! (20)", "Validando Datos",
       JOptionPane.ERROR_MESSAGE);
    }
   int k = (int) evt.getKeyChar();                                                               //k = al valor de la tecla presionada   
         if (k > 47 && k < 58) {                                                                 //Si el carácter ingresado es una letra
          evt.setKeyChar((char) KeyEvent.VK_CLEAR);                                //Limpiar el carácter ingresado
          JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
          JOptionPane.ERROR_MESSAGE);
    }   

    }//GEN-LAST:event_txtprodKeyPressed

    private void txtcantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantKeyPressed
        // TODO add your handling code here:
                        int k = (int) evt.getKeyChar();                                             //k = al valor de la tecla presionada    
         if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {       //Si el carácter ingresado es una letra
           evt.setKeyChar((char) KeyEvent.VK_CLEAR);      //Limpiar el carácter ingresado
           JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
           JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_txtcantKeyPressed

    private void txtprecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecKeyPressed
        // TODO add your handling code here:
                        int k = (int) evt.getKeyChar();                                             //k = al valor de la tecla presionada    
         if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {       //Si el carácter ingresado es una letra
           evt.setKeyChar((char) KeyEvent.VK_CLEAR);      //Limpiar el carácter ingresado
           JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
           JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_txtprecKeyPressed

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
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbfacturas;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprec;
    private javax.swing.JTextField txtprod;
    private javax.swing.JButton txtreg;
    private javax.swing.JTextField txttem;
    // End of variables declaration//GEN-END:variables
conectar cc=new conectar();
Connection cn=cc.conexion();
}
