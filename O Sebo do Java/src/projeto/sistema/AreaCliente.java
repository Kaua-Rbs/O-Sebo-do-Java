package projeto.sistema;

import projeto.sistema.arquivos.DiretorioArquivos;
import projeto.livros.repo.ArrayLivros;
import java.util.Arrays;
import java.util.List;
import projeto.livros.Livro;
import projeto.usuario.repo.*;
import projeto.usuario.*;
import projeto.usuario.repo.excecao.*;
import projeto.vendas.repo.*;
import projeto.vendas.repo.excecao.*;

public class AreaCliente extends javax.swing.JFrame {

    /**
     * Creates new form LoginCliente
     */
    public AreaCliente() {
        initComponents();
        ArrayLivros repoLivros = GerenciadorLivraria.desserializarLivros(DiretorioArquivos.getDir() + "\\src\\projeto\\sistema\\arquivos\\livros.bin");
        String[] tituloLivros = new String[repoLivros.getIndice()];
        for (int i = 0; i < repoLivros.getIndice(); i++) {
            tituloLivros[i] = repoLivros.livro(i).getTitulo();
        }
        List<String> tituloLivrosLista = Arrays.asList(tituloLivros);
        jListaLivros.setModel(new javax.swing.DefaultComboBoxModel<>(tituloLivrosLista.toArray(new String[0])));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Digitecpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBEfetuar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jListaLivros = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPag = new javax.swing.JTextField();
        jAutor = new javax.swing.JTextField();
        jBLivrosAdq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area Cliente");

        Digitecpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitecpfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setText("Sebo do Java");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel2.setText("CPF:");

        jBEfetuar.setText("Efetuar pedido");
        jBEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEfetuarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel4.setText("Livro:");

        jListaLivros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListaLivros.setMaximumRowCount(5);
        jListaLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaLivrosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel5.setText("Preço:");

        jPreco.setActionCommand("<Not Set>");
        jPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel6.setText("Autor:");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel7.setText("Número de páginas:");

        jPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPagActionPerformed(evt);
            }
        });

        jBLivrosAdq.setText("Ver livros adquiridos");
        jBLivrosAdq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLivrosAdqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Digitecpf, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBEfetuar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPag, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jListaLivros, 0, 345, Short.MAX_VALUE)
                                    .addComponent(jAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBLivrosAdq)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jListaLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Digitecpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEfetuar))
                .addGap(18, 18, 18)
                .addComponent(jBLivrosAdq)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DigitecpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigitecpfActionPerformed
     
    }//GEN-LAST:event_DigitecpfActionPerformed

    private void jBEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEfetuarActionPerformed
    String cpfc = Digitecpf.getText();
    
    ArrayLivros repoLivros = GerenciadorLivraria.desserializarLivros(DiretorioArquivos.getDir() + "\\src\\projeto\\sistema\\arquivos\\livros.bin");
    String tituloLivro = jListaLivros.getSelectedItem().toString();
    Livro livroEscolhido = null;
    
    for (int i = 0; i < repoLivros.getIndice(); i++) {
        if (tituloLivro.equals(repoLivros.livro(i).getTitulo())) {
            livroEscolhido = repoLivros.livro(i);
        }
    }
    
    ArrayClientes repoClientes = GerenciadorLivraria.desserializarCliente(DiretorioArquivos.getDir() + "\\src\\projeto\\sistema\\arquivos\\clientes.bin");
    ArrayVendas repoVendas = GerenciadorLivraria.desserializarVendas(DiretorioArquivos.getDir() + "\\src\\projeto\\sistema\\arquivos\\vendas.bin");
    
    boolean comprou = true;
    
    try {
        if (repoClientes.buscarUsuario(cpfc) == null) repoClientes.cadastrarUsuario(new Cliente(cpfc));
        repoVendas.gerarVenda(repoClientes, repoLivros, repoClientes.buscarUsuario(cpfc), livroEscolhido, 1);
    }
    
    catch (IAException | IBException | IDException | ICException | UCException e) {
        System.err.println("Exceção capturada: " + e.getMessage());
        comprou = false;
    }
    
    catch (IClException icl) {
        Cliente novoCliente = new Cliente(cpfc);
        try {
            repoClientes.cadastrarUsuario(novoCliente);
        }
        catch (ICException e) {
            CPFInvalido cpfi = new CPFInvalido();
            cpfi.setVisible(true);
            comprou = false;
        }
        catch (UCException e) {
            System.err.println("Exceção capturada: " + e.getMessage());
            comprou = false;
        }
    }
   
    if (comprou) {
        repoClientes.buscarUsuario(cpfc).comprarLivro(livroEscolhido);
        PedidoRealizado pf = new PedidoRealizado();
        pf.setVisible(true);
    }
    }//GEN-LAST:event_jBEfetuarActionPerformed

    private void jListaLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaLivrosActionPerformed
    ArrayLivros repoLivros = GerenciadorLivraria.desserializarLivros(DiretorioArquivos.getDir() + "\\src\\projeto\\sistema\\arquivos\\livros.bin");
    
    String tituloLivro = jListaLivros.getSelectedItem().toString();
    Livro livroEscolhido = null;
    String preco = "";
    String autor = "";
    String paginas = "";
    
    for (int i = 0; i < repoLivros.getIndice(); i++) {
        if (tituloLivro.equals(repoLivros.livro(i).getTitulo())) {
            livroEscolhido = repoLivros.livro(i);
            preco = "R$ " + Integer.toString(livroEscolhido.getPreco()) + ",00";
            autor = livroEscolhido.getAutor();
            paginas = Integer.toString(livroEscolhido.getPaginas());
        }
    }
    
    jPreco.setText(preco);
    jAutor.setText(autor);
    jPag.setText(paginas);
        
    }//GEN-LAST:event_jListaLivrosActionPerformed

    private void jPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecoActionPerformed

    private void jPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPagActionPerformed

    private void jBLivrosAdqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLivrosAdqActionPerformed
        LivrosAdquiridos la = new LivrosAdquiridos();
        la.setVisible(true);
    }//GEN-LAST:event_jBLivrosAdqActionPerformed

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
            java.util.logging.Logger.getLogger(AreaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Digitecpf;
    private javax.swing.JTextField jAutor;
    private javax.swing.JButton jBEfetuar;
    private javax.swing.JButton jBLivrosAdq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jListaLivros;
    private javax.swing.JTextField jPag;
    private javax.swing.JTextField jPreco;
    // End of variables declaration//GEN-END:variables
}
