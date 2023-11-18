/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.principall;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setTitle("Notas"); // Establece el título de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(VentanaPrincipal.EXIT_ON_CLOSE);
        setResizable(false); /* Establece que el tamaño de la ventana no
        se puede cambiar */
        nota1.setText("Nota 1:");
        nota2.setText("Nota 2:");
        nota3.setText("Nota 3:");
        nota4.setText("Nota 4:");
        nota5.setText("Nota 5:");
        calcular.setText("Calcular");
        limpiar.setText("limpiar");
        promedio.setText("Promedio = ");
        desviacion.setText("Desviación = ");
        mayor.setText("Nota mayor = ");
        menor.setText("Nota menor = ");
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nota1 = new javax.swing.JLabel();
        nota2 = new javax.swing.JLabel();
        nota3 = new javax.swing.JLabel();
        nota4 = new javax.swing.JLabel();
        nota5 = new javax.swing.JLabel();
        campoNota1 = new javax.swing.JTextField();
        campoNota2 = new javax.swing.JTextField();
        campoNota3 = new javax.swing.JTextField();
        campoNota4 = new javax.swing.JTextField();
        campoNota5 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        promedio = new javax.swing.JLabel();
        desviacion = new javax.swing.JLabel();
        mayor = new javax.swing.JLabel();
        menor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nota1.setText("Nota 1:");

        nota2.setText("Nota 2:");

        nota3.setText("Nota 3:");

        nota4.setText("Nota 4:");

        nota5.setText("Nota 5:");

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        promedio.setText("jLabel6");

        desviacion.setText("jLabel7");

        mayor.setText("jLabel8");

        menor.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nota5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calcular)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNota1)
                            .addComponent(campoNota2)
                            .addComponent(campoNota3)
                            .addComponent(campoNota4)
                            .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(limpiar)
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promedio)
                    .addComponent(menor)
                    .addComponent(desviacion)
                    .addComponent(mayor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nota1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nota2)
                        .addGap(18, 18, 18)
                        .addComponent(nota3)
                        .addGap(18, 18, 18)
                        .addComponent(nota4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nota5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcular)
                    .addComponent(limpiar))
                .addGap(19, 19, 19)
                .addComponent(promedio)
                .addGap(18, 18, 18)
                .addComponent(desviacion)
                .addGap(18, 18, 18)
                .addComponent(mayor)
                .addGap(18, 18, 18)
                .addComponent(menor)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        Notas notas = new Notas(); // Se crea un objeto Notas
        // Se obtiene y convierte el valor numérico de la nota 1
        notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
        // Se obtiene y convierte el valor numérico de la nota 2
        notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
        // Se obtiene y convierte el valor numérico de la nota 3
        notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
        // Se obtiene y convierte el valor numérico de la nota 4
        notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
        // Se obtiene y convierte el valor numérico de la nota 5
        notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());
        notas.calcularPromedio(); // Se calcula el promedio
        notas.calcularDesviación(); // Se calcula la desviación
        // Se muestra el promedio formateado
        promedio.setText("Promedio = " + String.valueOf(String.format("%.2f",
        notas.calcularPromedio())));
        double desv = notas.calcularDesviación();
        // Se muestra la desviación formateada
        desviacion.setText("Desviación estándar = " + String.format("%.2f", desv));
        // Se muestra el valor mayor formateado
        mayor.setText("Valor mayor = " + String.valueOf(notas.calcularMayor()));
        // Se muestra el valor menor formateado
        menor.setText("Valor menor = " + String.valueOf(notas.calcularMenor()));
    }//GEN-LAST:event_calcularActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    campoNota1.setText("");
    campoNota2.setText("");
    campoNota3.setText("");
    campoNota4.setText("");
    campoNota5.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoNota1;
    private javax.swing.JTextField campoNota2;
    private javax.swing.JTextField campoNota3;
    private javax.swing.JTextField campoNota4;
    private javax.swing.JTextField campoNota5;
    private javax.swing.JLabel desviacion;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel mayor;
    private javax.swing.JLabel menor;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JLabel nota4;
    private javax.swing.JLabel nota5;
    private javax.swing.JLabel promedio;
    // End of variables declaration//GEN-END:variables
}