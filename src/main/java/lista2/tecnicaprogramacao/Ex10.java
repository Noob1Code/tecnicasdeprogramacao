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
 * @brief Class Ex10
 */
public class Ex10 {
    public static void main(String[] args) {
        int j = 1; //declarando uma variavel e ja atribuindo o valor nela
        
        //for e um laco de repeticao que sera executado ate que a condicinal que faz ele executar for falsa
        for(int i = 0; i < 10000; i++/*incrementando a variavel i toda vez que o laco de repeticao for executado ate que o i chegue no valor determinado*/){
            System.out.println(j);// saida de dados
            j++;// incrementando a varivel j toda vez q o laco repetir
        }
        //obs o for so e usado quando vc sabe quantas vezes quer repetir
    }

}
