/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novosistcalmargemdefaturamento;

/**
 *
 * @author Windows Pro
 */
public class TelaReceitaDespesas extends javax.swing.JFrame {

    /**
     * Creates new form TelaReceitaDespesas
     */
    public TelaReceitaDespesas() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tituloFaturamento = new javax.swing.JLabel();
        tituloFaturamento2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tituloDespesas = new javax.swing.JLabel();
        tituloMaterialExpediente = new javax.swing.JLabel();
        tituloImpostos1 = new javax.swing.JLabel();
        tituloEnergia = new javax.swing.JLabel();
        tituloPlanoDeInternet = new javax.swing.JLabel();
        tituloCombustivel = new javax.swing.JLabel();
        tituloPlanTelefonico1 = new javax.swing.JLabel();
        tituloAlimentacao = new javax.swing.JLabel();
        tituloOutros = new javax.swing.JLabel();
        resultadoFaturamento = new javax.swing.JTextField();
        resultadoImpostos = new javax.swing.JTextField();
        resultadoMaterialExpediente = new javax.swing.JTextField();
        resultadoEnergia = new javax.swing.JTextField();
        resultadoPlanoInternet = new javax.swing.JTextField();
        resultadoPlanoTelefonico = new javax.swing.JTextField();
        resultadoCombustivel = new javax.swing.JTextField();
        resultadoAlimentacao = new javax.swing.JTextField();
        resultadoOutros = new javax.swing.JTextField();
        botaoCalcularLucro = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LANÇAMENTOS");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setForeground(new java.awt.Color(51, 0, 51));

        tituloFaturamento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tituloFaturamento.setText("Receita do Mês");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(tituloFaturamento)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFaturamento, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        tituloFaturamento2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloFaturamento2.setForeground(new java.awt.Color(255, 255, 255));
        tituloFaturamento2.setText("Faturamento");

        tituloDespesas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tituloDespesas.setText("Despesas do Mês");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(tituloDespesas)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        tituloMaterialExpediente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloMaterialExpediente.setForeground(new java.awt.Color(255, 255, 255));
        tituloMaterialExpediente.setText("Material de Expediente");

        tituloImpostos1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloImpostos1.setForeground(new java.awt.Color(255, 255, 255));
        tituloImpostos1.setText("Impostos");

        tituloEnergia.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloEnergia.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergia.setText("Energia");

        tituloPlanoDeInternet.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloPlanoDeInternet.setForeground(new java.awt.Color(255, 255, 255));
        tituloPlanoDeInternet.setText("Plano de Internet");

        tituloCombustivel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        tituloCombustivel.setText("Combustível");

        tituloPlanTelefonico1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloPlanTelefonico1.setForeground(new java.awt.Color(255, 255, 255));
        tituloPlanTelefonico1.setText("Plano Telefônico");

        tituloAlimentacao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloAlimentacao.setForeground(new java.awt.Color(255, 255, 255));
        tituloAlimentacao.setText("Alimentação");

        tituloOutros.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloOutros.setForeground(new java.awt.Color(255, 255, 255));
        tituloOutros.setText("Outros");

        botaoCalcularLucro.setText("Calc. Lucro");

        botaoVoltar.setText("Voltar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tituloFaturamento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultadoFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloMaterialExpediente)
                            .addComponent(tituloImpostos1)
                            .addComponent(tituloEnergia)
                            .addComponent(tituloPlanoDeInternet)
                            .addComponent(tituloPlanTelefonico1)
                            .addComponent(tituloCombustivel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(resultadoCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(resultadoPlanoTelefonico)
                                .addComponent(resultadoPlanoInternet)
                                .addComponent(resultadoEnergia))
                            .addComponent(resultadoMaterialExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tituloAlimentacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultadoAlimentacao))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoCalcularLucro, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tituloOutros)
                                .addGap(49, 49, 49)
                                .addComponent(resultadoOutros)))))
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultadoImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloFaturamento2)
                    .addComponent(resultadoFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloImpostos1)
                    .addComponent(tituloAlimentacao)
                    .addComponent(resultadoImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloMaterialExpediente)
                    .addComponent(tituloOutros)
                    .addComponent(resultadoOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoMaterialExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloEnergia)
                    .addComponent(resultadoEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloPlanoDeInternet)
                    .addComponent(resultadoPlanoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloPlanTelefonico1)
                            .addComponent(resultadoPlanoTelefonico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCombustivel)
                            .addComponent(resultadoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar)
                            .addComponent(botaoCalcularLucro))
                        .addGap(62, 62, 62))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(527, 391));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(TelaReceitaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReceitaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReceitaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReceitaDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReceitaDespesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcularLucro;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField resultadoAlimentacao;
    private javax.swing.JTextField resultadoCombustivel;
    private javax.swing.JTextField resultadoEnergia;
    private javax.swing.JTextField resultadoFaturamento;
    private javax.swing.JTextField resultadoImpostos;
    private javax.swing.JTextField resultadoMaterialExpediente;
    private javax.swing.JTextField resultadoOutros;
    private javax.swing.JTextField resultadoPlanoInternet;
    private javax.swing.JTextField resultadoPlanoTelefonico;
    private javax.swing.JLabel tituloAlimentacao;
    private javax.swing.JLabel tituloCombustivel;
    private javax.swing.JLabel tituloDespesas;
    private javax.swing.JLabel tituloEnergia;
    private javax.swing.JLabel tituloFaturamento;
    private javax.swing.JLabel tituloFaturamento2;
    private javax.swing.JLabel tituloImpostos1;
    private javax.swing.JLabel tituloMaterialExpediente;
    private javax.swing.JLabel tituloOutros;
    private javax.swing.JLabel tituloPlanTelefonico1;
    private javax.swing.JLabel tituloPlanoDeInternet;
    // End of variables declaration//GEN-END:variables
}