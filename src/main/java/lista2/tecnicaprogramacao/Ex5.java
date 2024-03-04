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
 * @brief Class Ex5
 */
public class Ex5 {
    public static void main(String[] args) {
        //declarando variaveis do tipo inteiro
        int v;
        int d;
        int t;
        
        Scanner ler = new Scanner(System.in); // a funcao ler
        
        System.out.println("Insira a velocidade em Km/h: ");
        v = ler.nextInt(); // entrada de dados
        
        System.out.println("Insira o tempo em horas: ");
        t = ler.nextInt();
        
        d = (v*t);//processamento 
        
        System.out.print("Distância percorrida: " + d + "Km."); //saida
        }

}
