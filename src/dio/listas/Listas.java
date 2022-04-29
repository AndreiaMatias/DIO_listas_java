package dio.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listas {
    // Dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 0, 3.5}. Faça:

    //Crie uma lista e adicione as 7 notas.
    public static void main(String[] args) {
        List <Double> notas = new ArrayList <Double>();

        //adicionando as notas

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.5);

        //imprimindo as notas
        System.out.println(notas);

        //imprima a posição da nota 5.0

        System.out.println(notas.indexOf(5.0));

        //adicione a nota 8 na posição 4

        notas.add(4,8d);

        System.out.println(notas.toString());

        //substituir a nota 5.0 pela nota 6.0

        notas.set(notas.indexOf(5.0), 6.0);

        System.out.println(notas);

        //confira se a nota 5 está na lista

        System.out.println(notas.contains(5.0));

        //Exiba todas as notas na ordem em que foram informada

        for (Double nota : notas){
            System.out.println(nota);
        }

        //exiba a terceira nota adicionada

        System.out.println("Nota: " + notas.get(2));

        //imprima a menor nota

        System.out.println(Collections.min(notas));

        //imprima a maior nota
        System.out.println(Collections.max(notas));

        //retorne a soma das notas

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("soma: " + soma);

        System.out.println("Média: " + (soma/notas.size()));

        System.out.println("Remover a nota 0.0: " + notas.remove(0d));
        System.out.println(notas);

        System.out.println("Remover a nota na posição 0: " + notas.remove(0));
        System.out.println(notas);

        System.out.println("remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague a lista");

        notas.clear();
        System.out.println(notas);
        System.out.println(notas.isEmpty());



    }


}
