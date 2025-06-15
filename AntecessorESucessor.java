/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antecessoresucessor;

/**
 *
 * @author ZEUS
 */
import java.util.Scanner;
public class AntecessorESucessor {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        
        System.out.println("Antecessor e Sucessor");
        System.out.println("-------------------------------------");
        
        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        // Cálculo do antecessor e sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("Número digitado: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
        
        scanner.close();
    }
}