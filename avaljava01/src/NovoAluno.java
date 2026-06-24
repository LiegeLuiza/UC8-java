
import javax.swing.table.*; 
import aluno.aluno;
import BancoSimulado.Banco;
public class NovoAluno extends javax.swing.JFrame {
   
    public NovoAluno() {
        initComponents();
        TabelaAlunos.setRowSelectionAllowed(true);
        TabelaAlunos.setSelectionMode(
            javax.swing.ListSelectionModel.SINGLE_SELECTION
        );
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAlunos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IdAluno = new javax.swing.JTextField();
        NomeC = new javax.swing.JTextField();
        Turma = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        btnAdicionarAluno = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelaAlunos);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de novo aluno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel1)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        IdAluno.setBackground(new java.awt.Color(153, 255, 153));
        IdAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("ID:"));
        IdAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdAlunoActionPerformed(evt);
            }
        });

        NomeC.setBackground(new java.awt.Color(153, 255, 153));
        NomeC.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));

        Turma.setBackground(new java.awt.Color(153, 255, 153));
        Turma.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma:"));

        Email.setBackground(new java.awt.Color(153, 255, 153));
        Email.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));

        btnAdicionarAluno.setBackground(new java.awt.Color(204, 255, 204));
        btnAdicionarAluno.setText("Adicionar Aluno");
        btnAdicionarAluno.setToolTipText("Salvar informações no sistemas");
        btnAdicionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAlunoActionPerformed(evt);
            }
        });

        btnExcluirCadastro.setBackground(new java.awt.Color(204, 255, 204));
        btnExcluirCadastro.setText("excluir cadastro");
        btnExcluirCadastro.setToolTipText("excluir registro selecionado");
        btnExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Turma)
                    .addComponent(NomeC)
                    .addComponent(IdAluno))
                .addGap(112, 112, 112)
                .addComponent(btnAdicionarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarAluno)
                            .addComponent(btnExcluirCadastro))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdAlunoActionPerformed

    private void btnAdicionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAlunoActionPerformed
    
       
aluno a = new aluno();

a.setId(Integer.parseInt(IdAluno.getText()));
    a.setNome(NomeC.getText());
    a.setTurma(Turma.getText());
    a.setEmail(Email.getText());

 Banco.aluno.add(a);
    
 DefaultTableModel modelo = (DefaultTableModel) TabelaAlunos.getModel();
 
    modelo.addRow(new Object[]{
        a.getId(),
        a.getNome(),
        a.getTurma(),
        a.getEmail()
            
            
            
            
    });
    
     IdAluno.setText("");
    NomeC.setText("");
    Turma.setText("");
    Email.setText("");
       

    }//GEN-LAST:event_btnAdicionarAlunoActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed


    int linha = TabelaAlunos.getSelectedRow();

    if (linha == -1) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Selecione um aluno para excluir!");
        return;
    }

    int opcao = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Tem certeza que deseja excluir este aluno?",
            "Confirmação",
            javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (opcao != javax.swing.JOptionPane.YES_OPTION) {
        return; // se clicou em NÃO, não faz nada
    }

    DefaultTableModel modelo =
            (DefaultTableModel) TabelaAlunos.getModel();

    int id = (int) modelo.getValueAt(linha, 0);

    java.util.Iterator<aluno> it = Banco.aluno.iterator();

    while (it.hasNext()) {
        aluno a = it.next();

        if (a.getId() == id) {
            it.remove();
            break;
        }
    }

    modelo.removeRow(linha);

    javax.swing.JOptionPane.showMessageDialog(this,
            "Aluno removido com sucesso!");

    
    }//GEN-LAST:event_btnExcluirCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField IdAluno;
    private javax.swing.JTextField NomeC;
    private javax.swing.JTable TabelaAlunos;
    private javax.swing.JTextField Turma;
    private javax.swing.JButton btnAdicionarAluno;
    private javax.swing.JButton btnExcluirCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
