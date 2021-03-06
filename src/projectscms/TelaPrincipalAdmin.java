/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectscms;

import modeloConexao.ConexaoBD;

/**
 *
 * @author wamberto
 */
public class TelaPrincipalAdmin extends javax.swing.JFrame {
    ConexaoBD conecta=new ConexaoBD();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalAdmin() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPlanoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdministrador = new javax.swing.JMenu();
        jMenuItemIncluirUsuario = new javax.swing.JMenuItem();
        jMenuItemExcluirUsuario = new javax.swing.JMenuItem();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemSetor = new javax.swing.JMenuItem();
        jMenuItemMaterial = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Material de Subunidade");
        getContentPane().setLayout(null);

        jLabelPlanoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wellness-2758146__340.jpg"))); // NOI18N
        jLabelPlanoPrincipal.setText("jLabel2");
        getContentPane().add(jLabelPlanoPrincipal);
        jLabelPlanoPrincipal.setBounds(0, 0, 580, 340);

        jMenuAdministrador.setText("Administrador");

        jMenuItemIncluirUsuario.setText("Incluir usuário");
        jMenuItemIncluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIncluirUsuarioActionPerformed(evt);
            }
        });
        jMenuAdministrador.add(jMenuItemIncluirUsuario);

        jMenuItemExcluirUsuario.setText("Excluir usuário");
        jMenuItemExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirUsuarioActionPerformed(evt);
            }
        });
        jMenuAdministrador.add(jMenuItemExcluirUsuario);

        jMenuBar1.add(jMenuAdministrador);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemSetor.setText("Setor");
        jMenuItemSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSetorActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemSetor);

        jMenuItemMaterial.setText("Material");
        jMenuItemMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMaterialActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemMaterial);

        jMenuBar1.add(jMenuCadastrar);

        jMenuRelatorios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuSobre.setText("Sobre");
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(599, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemMaterialActionPerformed

    private void jMenuItemSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSetorActionPerformed
        FormSetor tela = new FormSetor();
        tela.setVisible(true);        
    }//GEN-LAST:event_jMenuItemSetorActionPerformed

    private void jMenuItemIncluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIncluirUsuarioActionPerformed
        FormIncluiUsuario telaincluiusu = new FormIncluiUsuario();
        telaincluiusu.setVisible(true);        
    }//GEN-LAST:event_jMenuItemIncluirUsuarioActionPerformed

    private void jMenuItemExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirUsuarioActionPerformed
        FormExcluiUsuario telaexcluiusu = new FormExcluiUsuario();
        telaexcluiusu.setVisible(true);    
    }//GEN-LAST:event_jMenuItemExcluirUsuarioActionPerformed
                       
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
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelPlanoPrincipal;
    private javax.swing.JMenu jMenuAdministrador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemExcluirUsuario;
    private javax.swing.JMenuItem jMenuItemIncluirUsuario;
    private javax.swing.JMenuItem jMenuItemMaterial;
    private javax.swing.JMenuItem jMenuItemSetor;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}
