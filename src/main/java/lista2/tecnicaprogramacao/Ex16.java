/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista2.tecnicaprogramacao;

import java.util.Scanner;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 03/03/2024
 * @brief Class Ex16
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //funcao para entrada de dados 
        System.out.println("Escreva o tamanho da matriz:");// msg para o usuario
        //declarando variaveis 
        int tam = ler.nextInt(); //declarando e lendo a variavel para colocar o tamanho da matiz quadrada
        int linha, coluna;
        int matriz[][];
        matriz = new int[tam][tam]; // matiz
        //laco de repeticao 
        for(linha = 0; linha < tam; linha ++){  //Itera pelas linhas da matriz.
            for(coluna = 0; coluna < tam; coluna++){ // Itera pelas colunas da matriz.
                System.out.println("Escreva o numero no elemento["+linha+"]["+coluna+"]"); //perguntando ao usuario para q ele informe o numero da matiz, saida de dados 
                matriz[linha][coluna] = ler.nextInt(); //e entrada de dados
                
            }
           
        }
        /*
        Dentro deste loop, verifica se a soma da linha e coluna é igual ao tamanho da matriz menos 1 
        (ou seja, se a posição está na diagonal secundária).
        */
         for(linha = 0; linha < tam; linha ++){ 
            for(coluna = 0; coluna < tam; coluna++){
                if((linha + coluna) == (tam - 1)){
                    /*
                    Se a condição for verdadeira, imprime o valor da matriz correspondente àquela posição.
                    */
                    System.out.println(matriz[linha][coluna]);
                } 
            }
         }
            
        
    }

}
