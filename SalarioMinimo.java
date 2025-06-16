/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariominimo;

/**
 *
 * @author ZEUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class SalarioMinimo extends JFrame {
    
    private JTextField txtSalarioUsuario;
    private JTextArea txtResultado;
    private final double SALARIO_MINIMO = 1000.00;
    
    public SalarioMinimo() {
        // Configuração da janela
        setTitle("Calculadora de Salários Mínimos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Painel de entrada
        JPanel painelEntrada = new JPanel();
        painelEntrada.setLayout(new GridLayout(2, 1, 5, 5));
        
        JLabel lblInstrucao = new JLabel("Digite o valor do seu salário:");
        txtSalarioUsuario = new JTextField();
        
        painelEntrada.add(lblInstrucao);
        painelEntrada.add(txtSalarioUsuario);
        
        // Botão de cálculo
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this::calcularSalarios);
        
        // Área de resultado
        txtResultado = new JTextArea(5, 30);
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 14));
        txtResultado.setLineWrap(true);
        txtResultado.setWrapStyleWord(true);
        
        // Adicionando componentes
        panel.add(painelEntrada, BorderLayout.NORTH);
        panel.add(btnCalcular, BorderLayout.CENTER);
        panel.add(new JScrollPane(txtResultado), BorderLayout.SOUTH);
        
        add(panel);
    }
    
    private void calcularSalarios(ActionEvent e) {
        try {
            double salario = Double.parseDouble(txtSalarioUsuario.getText());
            
            if (salario < 0) {
                throw new NumberFormatException();
            }
            
            double qtdSalarios = salario / SALARIO_MINIMO;
            DecimalFormat df = new DecimalFormat("#,##0.00");
            
            String resultado = "Salário informado: R$ " + df.format(salario) + "\n" +
                              "Salário mínimo: R$ " + df.format(SALARIO_MINIMO) + "\n" +
                              "Você recebe: " + df.format(qtdSalarios) + " salários mínimos\n\n" +
                              "Cálculo: " + df.format(salario) + " ÷ " + 
                              df.format(SALARIO_MINIMO) + " = " + df.format(qtdSalarios);
            
            txtResultado.setText(resultado);
            
        } catch (NumberFormatException ex) {
            txtResultado.setText("Por favor, digite um valor válido (maior que zero)");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SalarioMinimo().setVisible(true);
        });
    }
}