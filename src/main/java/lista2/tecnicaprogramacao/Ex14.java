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

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 03/03/2024
 * @brief Class Ex14
 */
public class Ex14 {
    public static void main(String[] args) {
        //declarando variaveis e ja atribuindo valores
        int maximo = 1000; 
        int cntPrimo = 0;

        System.out.println("Números primos de 1 a 1000:"); //mostrando uma msg para o usuario

        for (int i = 2; i <= maximo; i++) { //laco de repeticao, com uma condicional para que repita ate que seja verdadeira
           // condicional para que execute a acao dentro do if 
            if (primo(i)) {
                cntPrimo++;
                System.out.print(i + " "); // imprimindo o valor junto com uma caractere em branco  para q os numeros n saiam colados e fique dificil a identificacao
            }
        }

        System.out.println("\nQuantidade de números primos de 1 a 1000: " + cntPrimo); //saida de dados com quebra de linha
    }
    public static boolean primo(int num) {
        //fiz uma funcao para verificar se ele e um numero primo
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { //A função Math. sqrt() retorna a raiz quadrada de um número ( x ).
            if (num % i == 0) { //condicional para verificar se o resto da divisao for igual a 0
                return false;
            }
        }
        return true;
    }

}
