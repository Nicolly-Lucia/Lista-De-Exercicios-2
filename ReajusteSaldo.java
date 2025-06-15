/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesaldo;

/**
 *
 * @author ZEUS
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class ReajusteSaldo {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#,##0.00");
        
System.out.println("Calculadora de Reajuste de Saldo");
System.out.println("--------------------------------");
        
System.out.print("Digite o valor do saldo: R$ ");
double saldo = scanner.nextDouble();
        
// Calcula o reajuste de 1%
double reajuste = saldo * 0.01;
double saldoReajustado = saldo + reajuste;

System.out.println("\nResultado:");
System.out.println("Saldo original: R$ " + df.format(saldo));
System.out.println("Reajuste (1%): R$ " + df.format(reajuste));
System.out.println("Saldo reajustado: R$ " + df.format(saldoReajustado));
        
scanner.close();

}
}