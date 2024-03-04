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
 * @brief Class Ex9
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
    int a,b,c;
    System.out.println("primeiro lado");
    a = ler.nextInt(); //entrada de dados
    System.out.println("segundo lado");
    b = ler.nextInt(); //entrada de dados
    System.out.println("terceiro lado");
    c = ler.nextInt(); //entrada de dados
    
    //processamento
    if(a == b && a==c && b==c){ // condicional de execucao
        System.out.println("equilátero"); // saida de dados
    }else{ // caso o if nao for executado caira no else e ele automaticamente sera executado
       if(a!=b && a!=c && b!=c){ // condicional de execucao
           System.out.println("escaleno");// saida de dados
       }else{ // caso o if nao for executado caira no else e ele automaticamente sera executado
           System.out.println("isócelos"); // saida de dados
       }
    }
    
    }

}
