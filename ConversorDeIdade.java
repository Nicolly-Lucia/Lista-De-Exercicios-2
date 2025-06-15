/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversordeidade;

/**
 *
 * @author ZEUS
 */
import java.util.Scanner;
public class ConversorDeIdade {

    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

System.out.println("Conversor de Idade para Dias");
System.out.println("---------------------------");
        
System.out.print("Digite os anos: ");
int anos = scanner.nextInt();
        
System.out.print("Digite os meses: ");
int meses = scanner.nextInt(); 
System.out.print("Digite os dias: ");
int dias = scanner.nextInt();

int totalDias = (anos * 365) + (meses * 30) + dias;
System.out.printf("%d anos, %d meses e %d dias = %d dias totais\n", 
anos, meses, dias, totalDias);
        
        scanner.close();
    }
}