/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;

/**
 *
 * @author ZEUS
 */
import java.util.Scanner;
public class MediaAritmetica {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        
System.out.println("Cálculo de Médias Aritméticas");
System.out.println("--------------------------------------------");

// 1. Média dos números 8, 9 e 7
double media879 = calcularMedia(8, 9, 7);
System.out.printf("\n1. Média de 8, 9 e 7: %.2f\n", media879);
        
// 2. Média dos números 4, 5 e 6
double media456 = calcularMedia(4, 5, 6);
System.out.printf("\n2. Média de 4, 5 e 6: %.2f\n", media456);
        
// 3. Soma das duas médias
double somaMedias = media879 + media456;
System.out.printf("\n3. Soma das duas médias: %.2f\n", somaMedias);
        
// 4. MÉDIA DAS MÉDIAS
System.out.println("\n4. Cálculo da Média das Médias:");

// Criando um array com todas as médias calculadas
double[] todasMedias = {media879, media456};
        
// Calculando a média das médias
double mediaDasMedias = calcularMedia(todasMedias);
        
System.out.printf("   - Quantidade de médias consideradas: %d\n", todasMedias.length);
System.out.printf("   - Média das médias: %.2f\n", mediaDasMedias);
        
scanner.close();

}
    
// Método para calcular média de 3 números
public static double calcularMedia(double a, double b, double c) {
return (a + b + c) / 3;

}
    
// Método sobrecarregado para calcular média de um array de valores
public static double calcularMedia(double[] valores) {
double soma = 0;
for (double valor : valores) {
soma += valor;

}

return soma / valores.length;
    }
}