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
 * @brief Class Ex7
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b;
        System.out.println("Informe o primeiro valor");
        a = ler.nextInt();
        System.out.println("Informe o segundo valor");
        b = ler.nextInt();
        
        if (a > b){ // if e uma condicional se bater essa condicional ele executara oq esta contido dentro do if a parti da chave
            //faca isso caso contrario:
            System.out.println("Valor de A:" + a);
            System.out.println("Valor de B:" + b);
            System.out.println("Mairo:" + a);
        }else{ //else e quando a execucao do if nao e processiguida, e cai dentro do else, se o if for executado o else nao vai ser e visse versa
            //faca isso
            System.out.println("Valor de A:" + a);
            System.out.println("Valor de B:" + b);
            System.out.println("Mairo:" + b);
        }
    }

}
