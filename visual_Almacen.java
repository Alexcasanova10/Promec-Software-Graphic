/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package promec.software;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static promec.software.visual_Cliente.getConnection;

/**
 *
 * @author ALEX
 */
public class visual_Almacen extends javax.swing.JPanel {

    /**
     * Creates new form visual_Almacen
     */
    Refaccion refac01;
    Conexion conexion01;
    
    public visual_Almacen() {
        initComponents();
        p_ingProd.setVisible(false);
        p_eliProd.setVisible(false);
        p_Alma.setVisible(false);
        ver_IdProd.setVisible(false);
        ver_MontoProd.setVisible(false);
        ver_DescProd.setVisible(false);
        ver_NameProd.setVisible(false);
        ver_CantProd.setVisible(false);
        
        refac01 = new Refaccion();
        conexion01 = new Conexion("promec_Soft");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        v_Almacen = new javax.swing.JPanel();
        p_Btn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        volver_MenuPBtn = new javax.swing.JButton();
        ing_ProdBtn = new javax.swing.JButton();
        eliminar_ProductoBtn = new javax.swing.JButton();
        ver_AlmaBtn = new javax.swing.JButton();
        p_ingProd = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        descTxt = new javax.swing.JTextField();
        id_ProdTxt = new javax.swing.JTextField();
        cant_ItemsTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        salvar_Prod = new javax.swing.JButton();
        p_eliProd = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        eli_IdTxt = new javax.swing.JTextField();
        eli_ProdBtn = new javax.swing.JButton();
        p_Alma = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        label_monto = new javax.swing.JLabel();
        label_desc = new javax.swing.JLabel();
        label_IdProd = new javax.swing.JLabel();
        ver_IdProd = new javax.swing.JTextField();
        ver_MontoProd = new javax.swing.JTextField();
        ver_DescProd = new javax.swing.JTextField();
        label_Cant = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        ver_NameProd = new javax.swing.JTextField();
        ver_CantProd = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        p_Btn.setBackground(new java.awt.Color(0, 142, 234));

        jLabel1.setFont(new java.awt.Font("Expletus Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Almacen");

        volver_MenuPBtn.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        volver_MenuPBtn.setForeground(new java.awt.Color(0, 142, 234));
        volver_MenuPBtn.setText("Volver a Menú");
        volver_MenuPBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver_MenuPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_MenuPBtnActionPerformed(evt);
            }
        });

        ing_ProdBtn.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ing_ProdBtn.setForeground(new java.awt.Color(0, 142, 234));
        ing_ProdBtn.setText("Agregar Producto");
        ing_ProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ing_ProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ing_ProdBtnActionPerformed(evt);
            }
        });

        eliminar_ProductoBtn.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        eliminar_ProductoBtn.setForeground(new java.awt.Color(0, 142, 234));
        eliminar_ProductoBtn.setText("Eliminar Producto");
        eliminar_ProductoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_ProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_ProductoBtnActionPerformed(evt);
            }
        });

        ver_AlmaBtn.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ver_AlmaBtn.setForeground(new java.awt.Color(0, 142, 234));
        ver_AlmaBtn.setText("Ver Almacen");
        ver_AlmaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver_AlmaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_AlmaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_BtnLayout = new javax.swing.GroupLayout(p_Btn);
        p_Btn.setLayout(p_BtnLayout);
        p_BtnLayout.setHorizontalGroup(
            p_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_BtnLayout.createSequentialGroup()
                .addGroup(p_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_BtnLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(p_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ver_AlmaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volver_MenuPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ing_ProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar_ProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                    .addGroup(p_BtnLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        p_BtnLayout.setVerticalGroup(
            p_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(ing_ProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar_ProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ver_AlmaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(volver_MenuPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Expletus Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 142, 234));
        jLabel13.setText("Agregar Producto");

        jLabel3.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 142, 234));
        jLabel3.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 142, 234));
        jLabel5.setText("Descripción");

        jLabel6.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 142, 234));
        jLabel6.setText("Cantidad Items");

        jLabel7.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 142, 234));
        jLabel7.setText("ID Producto");

        jLabel8.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 142, 234));
        jLabel8.setText("Precio");

        nombreTxt.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N

        descTxt.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N

        id_ProdTxt.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N

        cant_ItemsTxt.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N

        precioTxt.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N

        salvar_Prod.setBackground(new java.awt.Color(0, 142, 234));
        salvar_Prod.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        salvar_Prod.setForeground(new java.awt.Color(255, 255, 255));
        salvar_Prod.setText("Agregar Producto");
        salvar_Prod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvar_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_ProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_ingProdLayout = new javax.swing.GroupLayout(p_ingProd);
        p_ingProd.setLayout(p_ingProdLayout);
        p_ingProdLayout.setHorizontalGroup(
            p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_ingProdLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_ingProdLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_ProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p_ingProdLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cant_ItemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_ingProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar_Prod)
                .addGap(124, 124, 124))
        );
        p_ingProdLayout.setVerticalGroup(
            p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_ingProdLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cant_ItemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(id_ProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(p_ingProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(salvar_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        jLabel9.setFont(new java.awt.Font("Expletus Sans", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 142, 234));
        jLabel9.setText("Eliminar Producto");

        jLabel11.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 142, 234));
        jLabel11.setText("Ingresar ID :");

        eli_IdTxt.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N

        eli_ProdBtn.setBackground(new java.awt.Color(0, 142, 234));
        eli_ProdBtn.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        eli_ProdBtn.setForeground(new java.awt.Color(255, 255, 255));
        eli_ProdBtn.setText("Eliminar");
        eli_ProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eli_ProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eli_ProdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_eliProdLayout = new javax.swing.GroupLayout(p_eliProd);
        p_eliProd.setLayout(p_eliProdLayout);
        p_eliProdLayout.setHorizontalGroup(
            p_eliProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_eliProdLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addGroup(p_eliProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eli_ProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(eli_IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        p_eliProdLayout.setVerticalGroup(
            p_eliProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_eliProdLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addGroup(p_eliProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eli_IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(eli_ProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );

        jLabel10.setFont(new java.awt.Font("Expletus Sans", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 142, 234));
        jLabel10.setText("Almacen");

        label_monto.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        label_monto.setForeground(new java.awt.Color(0, 142, 234));
        label_monto.setText("Monto");

        label_desc.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        label_desc.setForeground(new java.awt.Color(0, 142, 234));
        label_desc.setText("Descripción");

        label_IdProd.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        label_IdProd.setForeground(new java.awt.Color(0, 142, 234));
        label_IdProd.setText("ID de Producto");

        ver_IdProd.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ver_IdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_IdProdActionPerformed(evt);
            }
        });

        ver_MontoProd.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ver_MontoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_MontoProdActionPerformed(evt);
            }
        });

        ver_DescProd.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ver_DescProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_DescProdActionPerformed(evt);
            }
        });

        label_Cant.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        label_Cant.setForeground(new java.awt.Color(0, 142, 234));
        label_Cant.setText("Cantidad Items");

        label_name.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        label_name.setForeground(new java.awt.Color(0, 142, 234));
        label_name.setText("Nombre");

        ver_NameProd.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ver_NameProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_NameProdActionPerformed(evt);
            }
        });

        ver_CantProd.setFont(new java.awt.Font("Expletus Sans", 1, 16)); // NOI18N
        ver_CantProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_CantProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_AlmaLayout = new javax.swing.GroupLayout(p_Alma);
        p_Alma.setLayout(p_AlmaLayout);
        p_AlmaLayout.setHorizontalGroup(
            p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_AlmaLayout.createSequentialGroup()
                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_AlmaLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel10))
                    .addGroup(p_AlmaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_AlmaLayout.createSequentialGroup()
                                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_desc)
                                    .addComponent(label_monto)
                                    .addComponent(label_IdProd))
                                .addGap(18, 18, 18)
                                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ver_DescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ver_MontoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ver_IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p_AlmaLayout.createSequentialGroup()
                                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Cant)
                                    .addComponent(label_name))
                                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p_AlmaLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(ver_NameProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(p_AlmaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ver_CantProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        p_AlmaLayout.setVerticalGroup(
            p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_AlmaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_IdProd)
                    .addGroup(p_AlmaLayout.createSequentialGroup()
                        .addComponent(ver_IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ver_MontoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_monto))
                        .addGap(18, 18, 18)
                        .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ver_DescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_desc))))
                .addGap(18, 18, 18)
                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ver_NameProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_name))
                .addGap(18, 18, 18)
                .addGroup(p_AlmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver_CantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Cant))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout v_AlmacenLayout = new javax.swing.GroupLayout(v_Almacen);
        v_Almacen.setLayout(v_AlmacenLayout);
        v_AlmacenLayout.setHorizontalGroup(
            v_AlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(v_AlmacenLayout.createSequentialGroup()
                .addComponent(p_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_ingProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(v_AlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, v_AlmacenLayout.createSequentialGroup()
                    .addGap(0, 230, Short.MAX_VALUE)
                    .addComponent(p_eliProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(v_AlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, v_AlmacenLayout.createSequentialGroup()
                    .addGap(0, 229, Short.MAX_VALUE)
                    .addComponent(p_Alma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        v_AlmacenLayout.setVerticalGroup(
            v_AlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_ingProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(v_AlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(p_eliProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(v_AlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(p_Alma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(v_Almacen, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ing_ProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ing_ProdBtnActionPerformed
        p_ingProd.setVisible(true);
        p_eliProd.setVisible(false);
        p_Alma.setVisible(false);
    }//GEN-LAST:event_ing_ProdBtnActionPerformed

    private void eliminar_ProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_ProductoBtnActionPerformed

        p_ingProd.setVisible(false);
        p_eliProd.setVisible(true);
        p_Alma.setVisible(false);
    }//GEN-LAST:event_eliminar_ProductoBtnActionPerformed

    private void ver_AlmaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_AlmaBtnActionPerformed
        p_ingProd.setVisible(false);
        p_eliProd.setVisible(false);
        p_Alma.setVisible(true);
        
        ver_IdProd.setVisible(true);
        ver_MontoProd.setVisible(true);
        ver_DescProd.setVisible(true);
        ver_NameProd.setVisible(true);
        ver_CantProd.setVisible(true);
        
        ver_IdProd.setText(id_ProdTxt.getText());
        ver_MontoProd.setText(precioTxt.getText());
        ver_DescProd.setText(descTxt.getText());
        ver_NameProd.setText(nombreTxt.getText());
        ver_CantProd.setText(cant_ItemsTxt.getText());
    }//GEN-LAST:event_ver_AlmaBtnActionPerformed

    private void volver_MenuPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_MenuPBtnActionPerformed
        menu_Principal mainMenu = new menu_Principal();
        mainMenu.setSize(720, 472);
        mainMenu.setLocation(0,0);

        v_Almacen.removeAll();
        v_Almacen.add(mainMenu, BorderLayout.CENTER);
        v_Almacen.revalidate();
        v_Almacen.repaint();
    }//GEN-LAST:event_volver_MenuPBtnActionPerformed

    private void salvar_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_ProdActionPerformed
        if (!refac01.setNombre(nombreTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Favor de ingresar nombre de producto");
        }else if(!refac01.setDescripcion(descTxt.getText())){
            JOptionPane.showMessageDialog(null, "Favor de ingresar descripción de producto");
        }else if(!refac01.setId_Refac(id_ProdTxt.getText())){
            JOptionPane.showMessageDialog(null, "ID debe contener 5 dígitos, intentar de nuevo");
        }else if(!refac01.setCantidad(cant_ItemsTxt.getText())){
            JOptionPane.showMessageDialog(null, "Favor de ingresar una cantidad válida");
        }else if(!refac01.setPrecio(precioTxt.getText())){
            JOptionPane.showMessageDialog(null, "Favor de ingresar un precio válido");    
        }else {
            try{
                Connection con = getConnection();
            String Cadena = "INSERT INTO clientes (nombre_Prod, descripcion, cant_It, id_Prod, precio) VALUES ('"+refac01.getNombre()+"', '"+refac01.getDescripcion()+"', '"+refac01.getCantidad()+"', '"+refac01.getId_Refac()+"', '"+refac01.getPrecio()+"');";            
                PreparedStatement posted = con.prepareStatement(Cadena);
                posted.executeUpdate();
                //return true;
            } catch(Exception e){
                System.out.println(e);
                //return false;
            }
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
        }        
    }//GEN-LAST:event_salvar_ProdActionPerformed

    private void ver_IdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_IdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_IdProdActionPerformed

    private void ver_MontoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_MontoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_MontoProdActionPerformed

    private void ver_DescProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_DescProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_DescProdActionPerformed

    private void ver_NameProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_NameProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_NameProdActionPerformed

    private void ver_CantProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_CantProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_CantProdActionPerformed

    private void eli_ProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eli_ProdBtnActionPerformed
        if (eli_IdTxt.getText().equals(id_ProdTxt.getText())) {
            ver_IdProd.setText(null);
            ver_MontoProd.setText(null);
            ver_DescProd.setText(null);
            ver_NameProd.setText(null);
            ver_CantProd.setText(null);
            
            refac01.setId_Refac(null);
            refac01.setPrecio(null);
            refac01.setDescripcion("");
            refac01.setNombre(null);
            refac01.setCantidad(0);
            
            nombreTxt.setText(null);
            descTxt.setText(null);
            id_ProdTxt.setText(null);
            cant_ItemsTxt.setText(null);
            precioTxt.setText(null);
            
            refac01.setNombre("");
            refac01.setDescripcion("");
            refac01.setId_Refac("");
            refac01.setCantidad("");
            refac01.setPrecio("");
            
            
            JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "ID incorrecto, favor de intentar de nuevo");
        }
 
    }//GEN-LAST:event_eli_ProdBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cant_ItemsTxt;
    private javax.swing.JTextField descTxt;
    private javax.swing.JTextField eli_IdTxt;
    private javax.swing.JButton eli_ProdBtn;
    private javax.swing.JButton eliminar_ProductoBtn;
    private javax.swing.JTextField id_ProdTxt;
    private javax.swing.JButton ing_ProdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_Cant;
    private javax.swing.JLabel label_IdProd;
    private javax.swing.JLabel label_desc;
    private javax.swing.JLabel label_monto;
    private javax.swing.JLabel label_name;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel p_Alma;
    private javax.swing.JPanel p_Btn;
    private javax.swing.JPanel p_eliProd;
    private javax.swing.JPanel p_ingProd;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JButton salvar_Prod;
    private javax.swing.JPanel v_Almacen;
    private javax.swing.JButton ver_AlmaBtn;
    private javax.swing.JTextField ver_CantProd;
    private javax.swing.JTextField ver_DescProd;
    private javax.swing.JTextField ver_IdProd;
    private javax.swing.JTextField ver_MontoProd;
    private javax.swing.JTextField ver_NameProd;
    private javax.swing.JButton volver_MenuPBtn;
    // End of variables declaration//GEN-END:variables
}
