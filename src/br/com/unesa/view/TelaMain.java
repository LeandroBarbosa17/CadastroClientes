package br.com.unesa.view;
import br.com.unesa.control.ControleCliente;
import br.com.unesa.model.Cliente;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 * @brief Tela principal onde será exibido o sistema de cadastro
 * @date 19/11/2020
 */
public class TelaMain extends javax.swing.JFrame {
    
    ControleCliente controle = new ControleCliente();

    /**
     * Creates new form TelaMain
     */
    public TelaMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfIdade = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO");

        jLabel2.setText("ID:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Email:");
        
            tfId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btListarActionPerformed(evt);
            }
        });
        
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btExcluirActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");

        btListar.setText("Listar");

        btExcluir.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfId)
                            .addComponent(tfIdade)
                            .addComponent(tfNome)
                            .addComponent(tfTelefone)
                            .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCadastrar)
                        .addGap(47, 47, 47)
                        .addComponent(btListar)
                        .addGap(51, 51, 51)
                        .addComponent(btExcluir)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btListar)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setId(Integer.parseInt(tfId.getText()));
        cliente.setIdade(Integer.parseInt(tfIdade.getText()));
        cliente.setNome(tfNome.getText());
        cliente.setTelefone(tfTelefone.getText());
        cliente.setEmail(tfEmail.getText());
        
        controle.incluir(cliente);

        JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado com sucesso!");

        tfId.setText("");
        tfIdade.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        
        
    }                                           
    
    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {
        controle.ObterTodos().forEach((cliente) -> {
        JOptionPane.showMessageDialog(rootPane, cliente.getId() + "," + cliente.getIdade() + "," +
                cliente.getNome() + "," + cliente.getTelefone() + "," + cliente.getEmail());
    });
    }
    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Digite a Id a ser excluida: "));
        controle.excluir(id);
        
        JOptionPane.showMessageDialog(rootPane, "Cliente deletado!");
    }
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
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
                new TelaMain().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration
}

