/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antecessoresucessor;

/**
 *
 * @author ZEUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AntecessorESucessor {
    public static void main(String[] args) {
        // Configuração da janela principal
        JFrame janela = new JFrame("Calculadora de Antecessor e Sucessor");
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout(10, 10));
        janela.setLocationRelativeTo(null);

        // Painel de entrada com GridLayout
        JPanel painelEntrada = new JPanel(new GridLayout(2, 1, 5, 5));
        
        // Sub-painel para o campo de entrada
        JPanel painelCampo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelNumero = new JLabel("Digite um número inteiro:");
        JTextField campoNumero = new JTextField(10);
        painelCampo.add(labelNumero);
        painelCampo.add(campoNumero);

        // Sub-painel para o botão (agora com espaço adequado)
        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botaoCalcular = new JButton("Calcular");
        painelBotao.add(botaoCalcular);

        painelEntrada.add(painelCampo);
        painelEntrada.add(painelBotao);

        // Painel de resultados
        JPanel painelResultado = new JPanel(new GridLayout(2, 1, 5, 5));
        JLabel labelAntecessor = new JLabel("Antecessor: ");
        JLabel labelSucessor = new JLabel("Sucessor: ");

        labelAntecessor.setFont(new Font("Arial", Font.BOLD, 14));
        labelSucessor.setFont(new Font("Arial", Font.BOLD, 14));

        painelResultado.add(labelAntecessor);
        painelResultado.add(labelSucessor);

        // Adiciona os painéis à janela
        janela.add(painelEntrada, BorderLayout.NORTH);
        janela.add(painelResultado, BorderLayout.CENTER);

        // Ação do botão
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(campoNumero.getText());
                    labelAntecessor.setText("Antecessor: " + (numero - 1));
                    labelSucessor.setText("Sucessor: " + (numero + 1));
                } catch (NumberFormatException ex) {
                    labelAntecessor.setText("Erro: Digite um número válido!");
                    labelSucessor.setText("");
                }
            }
        });

        janela.setVisible(true);
    }
}