/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoipipecas;

/**
 *
 * @author ZEUS
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class CalculoIPIPecas {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#,##0.00");
        
System.out.println("Cálculo de Valor com IPI");
System.out.println("-----------------------");
        
// Entrada dos dados
System.out.print("Digite a porcentagem do IPI (%): ");
double ipi = scanner.nextDouble();
        
System.out.println("\nDados da Peça 1:");
System.out.print("Código: ");
int codigo1 = scanner.nextInt();
System.out.print("Valor unitário: R$ ");
double valor1 = scanner.nextDouble();
System.out.print("Quantidade: ");
int quant1 = scanner.nextInt();
        
System.out.println("\nDados da Peça 2:");
System.out.print("Código: ");
int codigo2 = scanner.nextInt();
System.out.print("Valor unitário: R$ ");
double valor2 = scanner.nextDouble();
System.out.print("Quantidade: ");
int quant2 = scanner.nextInt();
        
// Cálculos
double valorTotalSemIPI = (valor1 * quant1) + (valor2 * quant2);
double valorTotalComIPI = valorTotalSemIPI * (ipi/100 + 1);
        
// Saída dos resultados
System.out.println("\nResumo das Peças:");
System.out.printf("Peça %d - %d unidades x R$ %.2f = R$ %.2f\n", 
codigo1, quant1, valor1, valor1 * quant1);
System.out.printf("Peça %d - %d unidades x R$ %.2f = R$ %.2f\n", 
codigo2, quant2, valor2, valor2 * quant2);
        
System.out.println("\nCálculo do IPI:");
System.out.printf("Valor total sem IPI: R$ %s\n", df.format(valorTotalSemIPI));
System.out.printf("IPI (%.2f%%): R$ %s\n", ipi, df.format(valorTotalSemIPI * ipi/100));
System.out.printf("VALOR TOTAL COM IPI: R$ %s\n", df.format(valorTotalComIPI));
        
scanner.close();

}
}