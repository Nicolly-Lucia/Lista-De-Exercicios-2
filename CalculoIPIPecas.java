/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoipipecas;

/**
 *
 * @author ZEUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CalculoIPIPecas extends JFrame {
    
    private JTextField txtIPI, txtCodigo1, txtValor1, txtQuant1, txtCodigo2, txtValor2, txtQuant2;
    private JTextArea txtResultado;
    
    public CalculoIPIPecas() {
        // Configuração da janela
        setTitle("Cálculo de IPI para Peças");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Painel de entrada de dados
        JPanel painelEntrada = new JPanel();
        painelEntrada.setLayout(new GridLayout(7, 2, 5, 5));
        painelEntrada.setBorder(BorderFactory.createTitledBorder("Dados das Peças"));
        
        // Componentes para entrada de dados
        painelEntrada.add(new JLabel("Percentual IPI (%):"));
        txtIPI = new JTextField();
        painelEntrada.add(txtIPI);
        
        painelEntrada.add(new JLabel("Peça 1 - Código:"));
        txtCodigo1 = new JTextField();
        painelEntrada.add(txtCodigo1);
        
        painelEntrada.add(new JLabel("Peça 1 - Valor Unitário:"));
        txtValor1 = new JTextField();
        painelEntrada.add(txtValor1);
        
        painelEntrada.add(new JLabel("Peça 1 - Quantidade:"));
        txtQuant1 = new JTextField();
        painelEntrada.add(txtQuant1);
        
        painelEntrada.add(new JLabel("Peça 2 - Código:"));
        txtCodigo2 = new JTextField();
        painelEntrada.add(txtCodigo2);
        
        painelEntrada.add(new JLabel("Peça 2 - Valor Unitário:"));
        txtValor2 = new JTextField();
        painelEntrada.add(txtValor2);
        
        painelEntrada.add(new JLabel("Peça 2 - Quantidade:"));
        txtQuant2 = new JTextField();
        painelEntrada.add(txtQuant2);
        
        // Botão de cálculo
        JButton btnCalcular = new JButton("Calcular Valor com IPI");
        btnCalcular.addActionListener(this::calcularIPI);
        
        // Área de resultados
        txtResultado = new JTextArea(10, 40);
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(txtResultado);
        
        // Adicionando componentes ao painel principal
        panel.add(painelEntrada, BorderLayout.NORTH);
        panel.add(btnCalcular, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);
        
        add(panel);
    }
    
    private void calcularIPI(ActionEvent e) {
        try {
            // Obter valores dos campos
            double ipi = Double.parseDouble(txtIPI.getText());
            int codigo1 = Integer.parseInt(txtCodigo1.getText());
            double valor1 = Double.parseDouble(txtValor1.getText());
            int quant1 = Integer.parseInt(txtQuant1.getText());
            int codigo2 = Integer.parseInt(txtCodigo2.getText());
            double valor2 = Double.parseDouble(txtValor2.getText());
            int quant2 = Integer.parseInt(txtQuant2.getText());
            
            // Realizar cálculos
            double valorTotalSemIPI = (valor1 * quant1) + (valor2 * quant2);
            double valorIPI = valorTotalSemIPI * (ipi / 100);
            double valorTotalComIPI = valorTotalSemIPI + valorIPI;
            
            // Formatador para valores monetários
            DecimalFormat df = new DecimalFormat("#,##0.00");
            
            // Construir resultado
            String resultado = "=== RESUMO DO CÁLCULO ===\n\n" +
                              "Peça " + codigo1 + ":\n" +
                              "  " + quant1 + " x R$ " + df.format(valor1) + " = R$ " + df.format(valor1 * quant1) + "\n\n" +
                              "Peça " + codigo2 + ":\n" +
                              "  " + quant2 + " x R$ " + df.format(valor2) + " = R$ " + df.format(valor2 * quant2) + "\n\n" +
                              "Valor total sem IPI: R$ " + df.format(valorTotalSemIPI) + "\n" +
                              "IPI (" + ipi + "%): R$ " + df.format(valorIPI) + "\n" +
                              "VALOR TOTAL COM IPI: R$ " + df.format(valorTotalComIPI);
            
            txtResultado.setText(resultado);
            
        } catch (NumberFormatException ex) {
            txtResultado.setText("Erro: Por favor, insira valores válidos em todos os campos!");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculoIPIPecas().setVisible(true);
        });
    }
}
