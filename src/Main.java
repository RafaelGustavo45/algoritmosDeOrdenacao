import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> a = new ArrayList<Integer>();

        Ordenador or = new Ordenador(a);

        //or.add(34);
        //or.add(90);
        //or.add(67);

        //System.out.println(or);

        ArrayList<Integer> desordenada = new ArrayList<Integer>();

        desordenada.add(90);
        desordenada.add(83);
        desordenada.add(10);
        desordenada.add(43);
        desordenada.add(111);

        System.out.println("----BubleSort----");

        System.out.println("desordenada: "+ desordenada);

        System.out.println("ordenada: "+ or.bubbleSort(desordenada));

        ArrayList<Integer> desordenada2 = new ArrayList<Integer>();

        desordenada2.add(1);
        desordenada2.add(548);
        desordenada2.add(349);
        desordenada2.add(77);
        desordenada2.add(154);
        desordenada2.add(45);

        System.out.println("----InserionSort----");

        System.out.println("desordenada: "+ desordenada2);
        System.out.println("ordenada: "+ or.insertionSort(desordenada2));

        System.out.println("----quickSort---");

        ArrayList<Integer> desordenada3 = new ArrayList<Integer>();

        desordenada3.add(19);
        desordenada3.add(1345);
        desordenada3.add(300);
        desordenada3.add(7563);
        desordenada3.add(45);
        desordenada3.add(9);

        System.out.println("desordenada: "+ desordenada3);
        System.out.println("ordenada: "+ or.quickSort(desordenada3));

        System.out.println("----SelectionSort---");

        ArrayList<Integer> desordenada4 = new ArrayList<Integer>();

        desordenada4.add(304);
        desordenada4.add(13);
        desordenada4.add(3);
        desordenada4.add(450);
        desordenada4.add(674);
        desordenada4.add(100);

        System.out.println("desordenada: "+ desordenada4);
        System.out.println("ordenada: "+ or.selectionSort(desordenada4));









    }
}