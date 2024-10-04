package Telas;

import javax.swing.JOptionPane;

//Declaracao da classe e JFrame
public class TelaPrincipal extends javax.swing.JFrame {

    //Declaracao de variáveis
    String operacao, resultado;
    double numero1, numero2;

    //Inicializacao dos configuracoes e componentes
    public TelaPrincipal() {
        initComponents();
        //Inicialização do padrão da tela principal
        setTitle("Calculadora");
        setLocationRelativeTo(null);
    }

    //padrao do JFrame, não alterar essa bagaça
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfTela = new javax.swing.JTextField();
        JBtnClear = new javax.swing.JButton();
        JBtnDelete = new javax.swing.JButton();
        JBtnPorcentagem = new javax.swing.JButton();
        JBtnMultiplicar = new javax.swing.JButton();
        JBtnDividir = new javax.swing.JButton();
        JBtnAdcao = new javax.swing.JButton();
        JBtnSubtrair = new javax.swing.JButton();
        JBtnDecimal = new javax.swing.JButton();
        JBtnResultado = new javax.swing.JButton();
        JBtnNove = new javax.swing.JButton();
        JBtnOito = new javax.swing.JButton();
        JBtnSete = new javax.swing.JButton();
        JBtnSeis = new javax.swing.JButton();
        JBtnCinco = new javax.swing.JButton();
        JBtnQuatro = new javax.swing.JButton();
        JBtnTres = new javax.swing.JButton();
        JBtnDois = new javax.swing.JButton();
        JBtnUm = new javax.swing.JButton();
        JBtnZero = new javax.swing.JButton();
        jmmPrincipal = new javax.swing.JMenuBar();
        jmmSair = new javax.swing.JMenu();
        jmbSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfTela.setEditable(false);
        jtfTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelaActionPerformed(evt);
            }
        });

        JBtnClear.setText("CE");
        JBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnClearActionPerformed(evt);
            }
        });

        JBtnDelete.setText("<-");
        JBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnDeleteActionPerformed(evt);
            }
        });

        JBtnPorcentagem.setText("%");
        JBtnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnPorcentagemActionPerformed(evt);
            }
        });

        JBtnMultiplicar.setText("X");
        JBtnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnMultiplicarActionPerformed(evt);
            }
        });

        JBtnDividir.setText("/");
        JBtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnDividirActionPerformed(evt);
            }
        });

        JBtnAdcao.setText("+");
        JBtnAdcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnAdcaoActionPerformed(evt);
            }
        });

        JBtnSubtrair.setText("-");
        JBtnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSubtrairActionPerformed(evt);
            }
        });

        JBtnDecimal.setText(",");
        JBtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnDecimalActionPerformed(evt);
            }
        });

        JBtnResultado.setText("=");
        JBtnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnResultadoActionPerformed(evt);
            }
        });

        JBtnNove.setText("9");
        JBtnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnNoveActionPerformed(evt);
            }
        });

        JBtnOito.setText("8");
        JBtnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnOitoActionPerformed(evt);
            }
        });

        JBtnSete.setText("7");
        JBtnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSeteActionPerformed(evt);
            }
        });

        JBtnSeis.setText("6");
        JBtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSeisActionPerformed(evt);
            }
        });

        JBtnCinco.setText("5");
        JBtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCincoActionPerformed(evt);
            }
        });

        JBtnQuatro.setText("4");
        JBtnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnQuatroActionPerformed(evt);
            }
        });

        JBtnTres.setText("3");
        JBtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnTresActionPerformed(evt);
            }
        });

        JBtnDois.setText("2");
        JBtnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnDoisActionPerformed(evt);
            }
        });

        JBtnUm.setText("1");
        JBtnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnUmActionPerformed(evt);
            }
        });

        JBtnZero.setText("0");
        JBtnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnZeroActionPerformed(evt);
            }
        });

        jmmSair.setText("Sair");

        jmbSair.setText("Sair");
        jmbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSairActionPerformed(evt);
            }
        });
        jmmSair.add(jmbSair);

        jmmPrincipal.add(jmmSair);

        setJMenuBar(jmmPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfTela, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBtnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBtnDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBtnSete, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBtnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBtnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JBtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBtnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JBtnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JBtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JBtnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JBtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(JBtnAdcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JBtnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfTela, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnPorcentagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(JBtnUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtnDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(JBtnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtnSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnNove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JBtnOito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(JBtnSete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JBtnAdcao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBtnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(JBtnZero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtnDecimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        setBounds(0, 0, 366, 433);
    }// </editor-fold>//GEN-END:initComponents

    /*
    Não consegui apagar, mas seria onde instruiríamos o que fazer
    quando houvesse ação (clique, drag, duplo clique, etc...) 
    no visor de dados. Por exemplo copiar para
    a área de transferência (ctrl+c) do usuário.
     */
    private void jtfTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelaActionPerformed
        // Deixa quieto
    }//GEN-LAST:event_jtfTelaActionPerformed

    //Adiciona o número 7 ao visor quando apertado
    private void JBtnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSeteActionPerformed
        jtfTela.setText(jtfTela.getText() + "7");
    }//GEN-LAST:event_JBtnSeteActionPerformed

    //Adiciona o número 6 ao visor quando apertado
    private void JBtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSeisActionPerformed
        jtfTela.setText(jtfTela.getText() + "6");
    }//GEN-LAST:event_JBtnSeisActionPerformed

    //Limpa a tela
    private void JBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnClearActionPerformed
        jtfTela.setText("");
    }//GEN-LAST:event_JBtnClearActionPerformed

    /*
    Enquanto haver valor na tela, tira um a um. 
     */
    private void JBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnDeleteActionPerformed
        if (jtfTela.getText().length() > 0) {
            jtfTela.setText(jtfTela.getText().substring(0, jtfTela.getText().length() - 1));
        }
    }//GEN-LAST:event_JBtnDeleteActionPerformed

    //Adiciona o número 1 ao visor quando apertado
    private void JBtnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnUmActionPerformed
        jtfTela.setText(jtfTela.getText() + "1");
    }//GEN-LAST:event_JBtnUmActionPerformed

    //Adiciona o número 2 ao visor quando apertado
    private void JBtnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnDoisActionPerformed
        jtfTela.setText(jtfTela.getText() + "2");
    }//GEN-LAST:event_JBtnDoisActionPerformed

    //Adiciona o número 3 ao visor quando apertado
    private void JBtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnTresActionPerformed

        jtfTela.setText(jtfTela.getText() + "3");
    }//GEN-LAST:event_JBtnTresActionPerformed

    //Adiciona o número 4 ao visor quando apertado
    private void JBtnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnQuatroActionPerformed
        jtfTela.setText(jtfTela.getText() + "4");
    }//GEN-LAST:event_JBtnQuatroActionPerformed

    //Adiciona o número 5 ao visor quando apertado
    private void JBtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCincoActionPerformed
        jtfTela.setText(jtfTela.getText() + "5");
    }//GEN-LAST:event_JBtnCincoActionPerformed

    //Adiciona o número 8 ao visor quando apertado
    private void JBtnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnOitoActionPerformed
        jtfTela.setText(jtfTela.getText() + "8");
    }//GEN-LAST:event_JBtnOitoActionPerformed

    //Adiciona o número 9 ao visor quando apertado
    private void JBtnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnNoveActionPerformed
        jtfTela.setText(jtfTela.getText() + "9");
    }//GEN-LAST:event_JBtnNoveActionPerformed

    /*
    Quando é apertado a subtracao, ele guarda o primeiro valor,
    escolhe o tipo de operação, e reseta o visor
     */
    private void JBtnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSubtrairActionPerformed
        numero1 = Double.parseDouble(jtfTela.getText());
        operacao = "subtracao";
        jtfTela.setText("");
    }//GEN-LAST:event_JBtnSubtrairActionPerformed

    private void JBtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnDecimalActionPerformed
        if (jtfTela.getText().contains(".")) {
            JOptionPane.showMessageDialog(null, "Virgula ja foi adicionada");
        } else if (jtfTela.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nao ha digitos na tela");
        } else {
            jtfTela.setText(jtfTela.getText() + ".");
        }
    }//GEN-LAST:event_JBtnDecimalActionPerformed

    private void JBtnAdcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnAdcaoActionPerformed
        numero1 = Double.parseDouble(jtfTela.getText());
        operacao = "adicao";
        jtfTela.setText("");
    }//GEN-LAST:event_JBtnAdcaoActionPerformed

    private void JBtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnDividirActionPerformed
        numero1 = Double.parseDouble(jtfTela.getText());
        operacao = "divisao";
        jtfTela.setText("");
    }//GEN-LAST:event_JBtnDividirActionPerformed

    private void JBtnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnMultiplicarActionPerformed
        numero1 = Double.parseDouble(jtfTela.getText());
        operacao = "multiplicacao";
        jtfTela.setText("");
    }//GEN-LAST:event_JBtnMultiplicarActionPerformed

    private void JBtnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnPorcentagemActionPerformed
        numero1 = Double.parseDouble(jtfTela.getText());
        operacao = "percentual";
        jtfTela.setText("");
    }//GEN-LAST:event_JBtnPorcentagemActionPerformed

    private void JBtnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnResultadoActionPerformed
        if (!jtfTela.getText().isEmpty()) {
            numero2 = Double.parseDouble(jtfTela.getText());
            switch (operacao) {
                case "adicao":
                    operacao = "+";
                    resultado = String.valueOf(numero1 + numero2);
                    jtfTela.setText(String.valueOf(resultado));
                    break;

                case "subtracao":
                    operacao = "-";
                    resultado = String.valueOf(numero1 - numero2);
                    jtfTela.setText(String.valueOf(resultado));
                    break;

                case "divisao":
                    operacao = "/";
                    if (numero2 != 0) {
                        resultado = String.valueOf(numero1 / numero2);
                        jtfTela.setText(resultado);
                    }else{
                        JOptionPane.showMessageDialog(null, "Nao e possivel dividir por 0");
                        resultado = "Indeterminado";
                    }
                    break;

                case "multiplicacao":
                    operacao = "*";
                    resultado = String.valueOf(numero1 * numero2);
                    jtfTela.setText(String.valueOf(resultado));
                    break;

                case "percentual":
                    operacao = "%";
                    resultado = String.valueOf((numero1 * numero2) / 100);
                    jtfTela.setText(String.valueOf(resultado));
                    break;
            }

        }
    }//GEN-LAST:event_JBtnResultadoActionPerformed

    //Adiciona o número 0 ao visor quando apertado
    private void JBtnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnZeroActionPerformed
        jtfTela.setText(jtfTela.getText() + "0");
    }//GEN-LAST:event_JBtnZeroActionPerformed

    //Seta que apertar o botão de sair encerra o programa
    private void jmbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmbSairActionPerformed

    //Funcao Main que executa a janela e a deixa visível ao inicializar
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnAdcao;
    private javax.swing.JButton JBtnCinco;
    private javax.swing.JButton JBtnClear;
    private javax.swing.JButton JBtnDecimal;
    private javax.swing.JButton JBtnDelete;
    private javax.swing.JButton JBtnDividir;
    private javax.swing.JButton JBtnDois;
    private javax.swing.JButton JBtnMultiplicar;
    private javax.swing.JButton JBtnNove;
    private javax.swing.JButton JBtnOito;
    private javax.swing.JButton JBtnPorcentagem;
    private javax.swing.JButton JBtnQuatro;
    private javax.swing.JButton JBtnResultado;
    private javax.swing.JButton JBtnSeis;
    private javax.swing.JButton JBtnSete;
    private javax.swing.JButton JBtnSubtrair;
    private javax.swing.JButton JBtnTres;
    private javax.swing.JButton JBtnUm;
    private javax.swing.JButton JBtnZero;
    private javax.swing.JMenuItem jmbSair;
    private javax.swing.JMenuBar jmmPrincipal;
    private javax.swing.JMenu jmmSair;
    private javax.swing.JTextField jtfTela;
    // End of variables declaration//GEN-END:variables
}
