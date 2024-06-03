/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iniciante;

/*
 
 QUESTÃO
 Leia 2 valores com uma casa decimal (x e y), que devem representar
 as cordenadas de um ponto em um plano. A seguir, determine qual o
 quadrante ao qual pertence o ponto, ou se esta sobre um dos eixos
 cartesianos ou na origem (x = y = 0)

 Se o ponto estiver na origem, escreva a mensagem  "Origem".
 Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y"

 ENTRADA
 A entrada contem as coordenadas de um ponto
 
 SAÍDA
 A saida deve apresentar o qudrante em que o ponto se encontra
 
*/

import java.util.Scanner;
import java.io.IOException;

public class URI1042 {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x = teclado.nextDouble();
        double y = teclado.nextDouble();
        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x == 0){
            System.out.println("Eixo Y");
        }
        else if (y == 0){
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
       }
    }