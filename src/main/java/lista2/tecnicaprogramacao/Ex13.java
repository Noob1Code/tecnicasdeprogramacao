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
 * @brief Class Ex13
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//chamando a funcao para receber dados
        
        int x,y,p;//declaracao de variaveis do tipo inteiro
        
        System.out.println("Escreva a base");
        x = sc.nextInt(); //receber dados
        System.out.println("Escreva o expoente");
        y = sc.nextInt(); // receber dados
        p = x; //atribuindo  o valor de variavel  x para o p
        
        for(int i= 1; i < y; i++ ) { //laco de repeticao 
          p = p*x;  //processamento
        }
        System.out.println("Valor é igual: " + p ); //saida de dados
    }

}
