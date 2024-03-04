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
 * @brief Class Ex6
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //chamando uma funcao e atribuindo a palavra ler para que quando eu chame essa palavra ela execute a funcao
        System.out.println("Qual o valor de x1: ");
        int x1 = ler.nextInt(); //declarando a variavel e ja recebendo o valor dela
        System.out.println("Qual o valor de y1: ");
        int y1 = ler.nextInt(); //declarando a variavel e ja recebendo o valor dela
        System.out.println("Qual o valor de x2: ");
        int x2 = ler.nextInt(); //declarando a variavel e ja recebendo o valor dela
        System.out.println("Qual o valor de y2: ");
        int y2 = ler.nextInt(); //declarando a variavel e ja recebendo o valor dela
        double d;  //declarando uma varivel do tipo double para nao dar conflito  na hora de fazer a conta
        d = Math.pow(x1-x2,2) + Math.pow(y1-y2,2); //processamento e atribuicao do resultado a variavel d
                System.out.println(d); // saida de dados para mostrar ao usuario       
    }

}
