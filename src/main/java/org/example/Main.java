package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       try {
              dividePorCero();
         } catch (ArithmeticException e) {
              System.out.println("Demo de código");
       }

    }

    /**
     * Reverses a string.
     * @param s The string to reverse.
     * @return The reversed string.
     */
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void recorrerArrayBidimensional(int[][] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.println("Posición ["+i+"]"+"["+j+"]  "+array[i][j]);
            }
        }
    }


    public static void crearVector5Elementos(){
        Vector<Integer> vector = new Vector<>(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(2);
        vector.remove(3);
        System.out.println("vector = " + vector);
    }

    /**
     * Un vector con una capacidad de 1000 elementos sería menos eficiente
     * debido a que se reservaría espacio para 1000 elementos aunque no se
     * vayan a utilizar todos, o en caso de usar todos en memoria se debe reservar
     * espacio para 1000 elementos todos de manera contigua; es decir, que no se
     * pueden encontrar en cualquier parte de la memoria, sino que deben estar
     * todos juntos.
     */

    public static void crearArrayListyLinkedList(){
        ArrayList<String> arrayList = new ArrayList<>(List.of(new String[]{"a", "b", "c", "d", "e"}));

        arrayList.forEach(System.out::println);
        System.out.println();

        System.out.println("LinkedList");
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        linkedList.forEach(System.out::println);

    }

    public static void eliminarParesArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.removeIf(integer -> integer % 2 == 0);
        arrayList.forEach(System.out::println);
    }


    public static void dividePorCero() throws ArithmeticException{
        int a = 5;
        int b = 0;
        if(b == 0) throw new ArithmeticException("No se puede dividir por cero");

    }

}