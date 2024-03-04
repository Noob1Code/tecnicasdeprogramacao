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
 * @brief Class Ex15
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz quadrada:");
        int ordem = ler.nextInt();//entrada de dados

        //o valor digitado pelo usuario vai sair o tamanho da matriz
        int[][] matriz = new int[ordem][ordem]; //criando uma matriz que so recebe valor inteiro

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) { //percorrendo a matriz para preencher os elementos da matriz
            //i sendo  linha e o j sendo a coluna
            for (int j = 0; j < ordem; j++) { //percorrendo a coluna
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Diagonal principal da matriz:"); // saindo de dados
        for (int i = 0; i < ordem; i++) { //verificando se o numero do local da matriz e igual para a verificacao ou seja 11/22/33
            System.out.print(matriz[i][i] + " "); //imprimindo os elementos da diagonal principal
        }
    }

}
