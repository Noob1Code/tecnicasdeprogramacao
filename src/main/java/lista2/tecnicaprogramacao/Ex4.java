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
 * @brief Class Ex4
 */
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); // atribuindo a entrada de dados a partir da palavra "ler"
        
      int x,y,z;  //declarando variaveis
      
        System.out.println("Informe o valor de X: ");
        x = ler.nextInt(); // pedindo para ler o valor da variavel x
        System.out.println("Informe o valor de Y: ");
        y = ler.nextInt(); // pedindo para ler o valor da variavel y
        System.out.println("Informe o valor de Z: ");
        z = ler.nextInt(); // pedindo para ler o valor da variavel z
        
        System.out.println((x*y)/z); // fazendo a conta entre os valore lidos
        
    }

}
