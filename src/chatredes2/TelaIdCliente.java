/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatredes2;

/**
 *
 * @author Nailton
 */
public class TelaIdCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaIdCliente
     */
    public TelaIdCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Cor = new javax.swing.ButtonGroup();
        jLabel_Nome = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel_Sala = new javax.swing.JLabel();
        jComboBox_Sala = new javax.swing.JComboBox<>();
        jLabel_Cor = new javax.swing.JLabel();
        jRadioButton_Azul = new javax.swing.JRadioButton();
        jRadioButton_Rosa = new javax.swing.JRadioButton();
        jRadioButton_Verde = new javax.swing.JRadioButton();
        jButton_Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Nome.setText("Nome:");

        jLabel_Sala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Sala.setText("Sala:");

        jComboBox_Sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_Cor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Cor.setText("Cor:");

        buttonGroup_Cor.add(jRadioButton_Azul);
        jRadioButton_Azul.setForeground(new java.awt.Color(0, 51, 204));
        jRadioButton_Azul.setText("Azul");

        buttonGroup_Cor.add(jRadioButton_Rosa);
        jRadioButton_Rosa.setForeground(new java.awt.Color(255, 153, 153));
        jRadioButton_Rosa.setText("Rosa");

        buttonGroup_Cor.add(jRadioButton_Verde);
        jRadioButton_Verde.setForeground(new java.awt.Color(0, 153, 0));
        jRadioButton_Verde.setText("Verde");

        jButton_Entrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Entrar.setText("Entrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Sala, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Cor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Azul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton_Rosa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Verde)
                                .addGap(2, 2, 2))
                            .addComponent(jComboBox_Sala, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Nome, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Sala, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Sala))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Azul)
                    .addComponent(jRadioButton_Rosa)
                    .addComponent(jRadioButton_Verde)
                    .addComponent(jLabel_Cor))
                .addGap(18, 18, 18)
                .addComponent(jButton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaIdCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIdCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIdCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIdCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIdCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Cor;
    private javax.swing.JButton jButton_Entrar;
    private javax.swing.JComboBox<String> jComboBox_Sala;
    private javax.swing.JLabel jLabel_Cor;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Sala;
    private javax.swing.JRadioButton jRadioButton_Azul;
    private javax.swing.JRadioButton jRadioButton_Rosa;
    private javax.swing.JRadioButton jRadioButton_Verde;
    private javax.swing.JTextField jTextField_Nome;
    // End of variables declaration//GEN-END:variables
}
