/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesaldo;

/**
 *
 * @author ZEUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class ReajusteSaldo extends JFrame {
    
    public ReajusteSaldo() {
        
        // Configuração da janela
        setTitle("Calculadora de Reajuste");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // Componentes
        JLabel lblInstrucao = new JLabel("Digite o valor do saldo:");
        lblInstrucao.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField txtSaldo = new JTextField();
        txtSaldo.setMaximumSize(new Dimension(300, 30));
        txtSaldo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton btnCalcular = new JButton("Calcular 1% de Reajuste");
        btnCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Área de resultado
        JTextArea txtResultado = new JTextArea(3, 30);
        txtResultado.setEditable(false);
        txtResultado.setLineWrap(true);
        txtResultado.setWrapStyleWord(true);
        txtResultado.setFont(new Font("Arial", Font.BOLD, 14));
        txtResultado.setBackground(panel.getBackground());
        
        // Adicionando componentes
        panel.add(lblInstrucao);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(txtSaldo);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(btnCalcular);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(new JScrollPane(txtResultado));
        
        // Ação do botão
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double saldo = Double.parseDouble(txtSaldo.getText());
                    double reajuste = saldo * 0.01;
                    double novoSaldo = saldo + reajuste;
                    
                    DecimalFormat df = new DecimalFormat("#,##0.00");
                    String resultado = "Saldo original: R$ " + df.format(saldo) + "\n" +
                                      "Reajuste (1%): R$ " + df.format(reajuste) + "\n" +
                                      "Novo saldo: R$ " + df.format(novoSaldo);
                    
                    txtResultado.setText(resultado);
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, digite um valor numérico válido!");
                }
            }
        });
        
        // Adiciona o painel
        add(panel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ReajusteSaldo().setVisible(true);
            }
        });
    }
}