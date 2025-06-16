/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;

/**
 *
 * @author ZEUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MediaAritmetica extends JFrame {
    
    public MediaAritmetica() {
        // Configuração básica da janela
        setTitle("Calculadora de Médias");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Título
        JLabel lblTitulo = new JLabel("Calculadora de Médias");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Área de resultados
        JTextArea txtResultado = new JTextArea(10, 25);
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(txtResultado);
        
        // Botão calcular
        JButton btnCalcular = new JButton("Calcular Médias");
        btnCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Adicionando componentes
        panel.add(lblTitulo);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(btnCalcular);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(scrollPane);
        
        // Ação do botão
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularMedias(txtResultado);
            }
        });
        
        add(panel);
    }
    
    private void calcularMedias(JTextArea txtResultado) {
        // Média dos números 8, 9 e 7
        double media1 = (8 + 9 + 7) / 3.0;
        
        // Média dos números 4, 5 e 6
        double media2 = (4 + 5 + 6) / 3.0;
        
        // Soma das médias
        double soma = media1 + media2;
        
        // Média das médias
        double mediaDasMedias = soma / 2;
        
        // Formatando o resultado
        String resultado = "Média de 8, 9 e 7: " + String.format("%.2f", media1) + "\n" +
                          "Média de 4, 5 e 6: " + String.format("%.2f", media2) + "\n" +
                          "Soma das médias: " + String.format("%.2f", soma) + "\n" +
                          "Média das médias: " + String.format("%.2f", mediaDasMedias);
        
        txtResultado.setText(resultado);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MediaAritmetica().setVisible(true);
            }
        });
    }
}