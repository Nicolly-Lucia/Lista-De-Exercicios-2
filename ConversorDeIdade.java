/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversordeidade;

/**
 *
 * @author ZEUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorDeIdade extends JFrame {
    
    public ConversorDeIdade() {
        // Configuração básica da janela
        setTitle("Conversor de Idade");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));
        
        // Componentes
        JLabel lblAnos = new JLabel("Anos:");
        JTextField txtAnos = new JTextField();
        
        JLabel lblMeses = new JLabel("Meses:");
        JTextField txtMeses = new JTextField();
        
        JLabel lblDias = new JLabel("Dias:");
        JTextField txtDias = new JTextField();
        
        JButton btnCalcular = new JButton("Calcular");
        JLabel lblResultado = new JLabel("Resultado:");
        
        // Adicionando componentes ao painel
        panel.add(lblAnos);
        panel.add(txtAnos);
        panel.add(lblMeses);
        panel.add(txtMeses);
        panel.add(lblDias);
        panel.add(txtDias);
        panel.add(btnCalcular);
        panel.add(lblResultado);
        
        // Ação do botão
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int anos = Integer.parseInt(txtAnos.getText());
                    int meses = Integer.parseInt(txtMeses.getText());
                    int dias = Integer.parseInt(txtDias.getText());
                    
                    int total = anos * 365 + meses * 30 + dias;
                    lblResultado.setText("Total: " + total + " dias");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Digite números válidos!");
                }
            }
        });
        
        // painel a janela
        add(panel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ConversorDeIdade().setVisible(true);
            }
        });
    }
}