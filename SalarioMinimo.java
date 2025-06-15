/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariominimo;

/**
 *
 * @author ZEUS
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Valor do salário mínimo
        final double SALARIO_MINIMO = 1000.00;
        
        System.out.println("Calculadora de Salários Mínimos");
        System.out.println("------------------------------");
        System.out.printf("Salário mínimo de referência: R$ %s\n", df.format(SALARIO_MINIMO));
        
        // Entrada do salário do usuário
        System.out.print("\nDigite o valor do seu salário: R$ ");
        double salarioUsuario = scanner.nextDouble();
        
        // Cálculo da quantidade de salários mínimos
        double qtdSalariosMinimos = salarioUsuario / SALARIO_MINIMO;
        
        // Saída dos resultados
        System.out.println("\nResultado:");
        System.out.printf("Você recebe: R$ %s\n", df.format(salarioUsuario));
        System.out.printf("Isso equivale a: %.2f salários mínimos\n", qtdSalariosMinimos);
        System.out.printf("(R$ %s / R$ %s)\n", df.format(salarioUsuario), df.format(SALARIO_MINIMO));
        
        scanner.close();
    }
}