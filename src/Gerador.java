import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.lang.Math;

public class Gerador {

    public void Gerador(){

    }

    public Double desvioPadrao(ArrayList<Long> lista){
        if (lista == null || lista.isEmpty()) {
            return 0.0; // Ou lançar uma exceção, dependendo do caso
        }

        // 1. Calcular a média
        double media = 0.0;
        for (Long numero : lista) {
            media += numero;
        }
        media /= lista.size();

        // 2. Calcular a soma dos quadrados das diferenças em relação à média
        double somaDasDiferencasQuadradas = 0.0;
        for (Long numero : lista) {
            somaDasDiferencasQuadradas += Math.pow(numero - media, 2);
        }

        // 3. Calcular a variância (média dos quadrados das diferenças)
        double variancia = somaDasDiferencasQuadradas / lista.size();

        // 4. Calcular o desvio padrão (raiz quadrada da variância)
        return Math.sqrt(variancia);
    }

    public void gerarDecrescente(){
        System.out.println("Gerando listas em ordem decrescente");
        ArrayList<Long> BubbleSortMil = new ArrayList<>();
        ArrayList<Long> BubbleSortDezMil = new ArrayList<>();
        ArrayList<Long> InsertionSortMil = new ArrayList<>();
        ArrayList<Long> InsertionSortDezMil = new ArrayList<>();
        ArrayList<Long> QuickSortMil = new ArrayList<>();
        ArrayList<Long> QuickSortDezMil = new ArrayList<>();
        ArrayList<Long> MergeSortMil = new ArrayList<>();
        ArrayList<Long> MergeSortDezMil = new ArrayList<>();
        ArrayList<Long> SelectionSortMil = new ArrayList<>();
        ArrayList<Long> SelectionSortDezMil = new ArrayList<>();

        Ordenador or = new Ordenador(new ArrayList<>());
        Random r = new Random();
        int mil = 1000;
        int dez_mil = 10000;
        GeradorLista gerador = new GeradorLista();
        ArrayList<Integer> desordenada = new ArrayList<Integer>();
        ArrayList<String> ordenacoes = new ArrayList<String>();
        ordenacoes.add("aleatorio");
        ordenacoes.add("crescente");
        ordenacoes.add("decrescente");
        ListaCircular ordens = new ListaCircular(ordenacoes);
        ArrayList<String> metodosOrdenadores = new ArrayList<String>();
        metodosOrdenadores.add("bubbleSort");
        metodosOrdenadores.add("insertionSort");
        metodosOrdenadores.add("quickSort");
        metodosOrdenadores.add("selectionSort");
        metodosOrdenadores.add("mergeSort");
        ListaCircular jeitosOrdenadores = new ListaCircular(metodosOrdenadores);
        ArrayList<Integer> quantidades = new ArrayList<Integer>();
        quantidades.add(1000);
        quantidades.add(10000);
        ListaCircularNum quantidadesOrdenadoras = new ListaCircularNum(quantidades);
        Cronometro t = new Cronometro();
        long tempo_total=0;


        for (int repeticoes = 0; repeticoes < 30; repeticoes++) {
            System.out.println("Repetição: " + (repeticoes + 1));
            System.out.println(jeitosOrdenadores.paraFrente());

            desordenada = gerador.gerarDecrescente(mil);

            long tempo_inicial = System.currentTimeMillis();
            or.bubbleSort(desordenada);
            long tempo_final = System.currentTimeMillis();

            tempo_total= (tempo_final-tempo_inicial);
            //tempo_total = t.Milissegundos(jeitosOrdenadores.getPosition(),desordenada);
            System.out.println(jeitosOrdenadores.getPosition()+ " com "+ mil+ "elementos, tempo: "+ tempo_total+ "ms");
            BubbleSortMil.add(tempo_total);
            desordenada.removeAll(desordenada);
            System.out.println("----mais ainda----");
            desordenada = gerador.gerarDecrescente(dez_mil);
            long tempo_inicial2 = System.currentTimeMillis();
            or.bubbleSort(new ArrayList<>(desordenada));
            long tempo_final2 = System.currentTimeMillis();
            long tempo_total2 = (tempo_final2 - tempo_inicial2);
            System.out.println("BubbleSort com " + dez_mil + " elementos tempo: " + tempo_total2 + " ms");
            BubbleSortDezMil.add(tempo_total2);
            desordenada.removeAll(desordenada);


            //tempo_total = t.Milissegundos(jeitosOrdenadores.getPosition(),desordenada);
            System.out.println(jeitosOrdenadores.getPosition()+ " com "+ dez_mil+ "elementos, tempo: "+ tempo_total2 + "ms");
            BubbleSortDezMil.add(tempo_total2);
            desordenada.removeAll(desordenada);
            // --- Insertion Sort ---
            System.out.println(jeitosOrdenadores.paraFrente());
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarDecrescente(mil);
            long tempo_inicial3 = System.currentTimeMillis();
            or.insertionSort(new ArrayList<>(desordenada));
            long tempo_final3 = System.currentTimeMillis();
            long tempo_total3 = (tempo_final3 - tempo_inicial3);
            System.out.println("InsertionSort com " + mil + " elementos tempo: " + tempo_total3 + " ms");
            InsertionSortMil.add(tempo_total3);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println("-----Ainda mais ------");
            desordenada = gerador.gerarDecrescente(dez_mil);
            long tempo_inicial4 = System.currentTimeMillis();
            or.insertionSort(new ArrayList<>(desordenada));
            long tempo_final4 = System.currentTimeMillis();
            long tempo_total4 = (tempo_final4 - tempo_inicial4);
            System.out.println("InsertionSort com " + dez_mil + " elementos tempo: " + tempo_total4 + " ms");
            InsertionSortDezMil.add(tempo_total4);
            desordenada.removeAll(desordenada);

            // --- QuickSort ---
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarDecrescente(mil);
            long tempo_inicial5 = System.currentTimeMillis();
            or.quickSort(new ArrayList<>(desordenada));
            long tempo_final5 = System.currentTimeMillis();
            long tempo_total5 = (tempo_final5 - tempo_inicial5);
            System.out.println("QuickSort com " + mil + " elementos tempo: " + tempo_total5 + " ms");
            QuickSortMil.add(tempo_total5);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println("----Ainda mais ----");
            desordenada = gerador.gerarDecrescente(dez_mil);
            long tempo_inicial6 = System.currentTimeMillis();
            or.quickSort(new ArrayList<>(desordenada));
            long tempo_final6 = System.currentTimeMillis();
            long tempo_total6 = (tempo_final6 - tempo_inicial6);
            System.out.println("QuickSort com " + dez_mil + " elementos tempo: " + tempo_total6 + " ms");
            QuickSortDezMil.add(tempo_total6);
            desordenada.removeAll(desordenada);

            // --- Selection Sort ---
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarDecrescente(mil);
            long tempo_inicial7 = System.currentTimeMillis();
            or.selectionSort(new ArrayList<>(desordenada));
            long tempo_final7 = System.currentTimeMillis();
            long tempo_total7 = (tempo_final7 - tempo_inicial7);
            System.out.println("SelectionSort com " + mil + " elementos tempo: " + tempo_total7 + " ms");
            SelectionSortMil.add(tempo_total7);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println(jeitosOrdenadores.paraFrente());
            desordenada = gerador.gerarDecrescente(dez_mil);
            long tempo_inicial8 = System.currentTimeMillis();
            or.selectionSort(new ArrayList<>(desordenada));
            long tempo_final8 = System.currentTimeMillis();
            long tempo_total8 = (tempo_final8 - tempo_inicial8);
            System.out.println("SelectionSort com " + dez_mil + " elementos tempo: " + tempo_total8 + " ms");
            SelectionSortDezMil.add(tempo_total8);
            desordenada.removeAll(desordenada);

            // --- Merge Sort ---
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarDecrescente(mil);
            long tempo_inicial9 = System.currentTimeMillis();
            or.mergeSort(new ArrayList<>(desordenada));
            long tempo_final9 = System.currentTimeMillis();
            long tempo_total9 = (tempo_final9 - tempo_inicial9);
            System.out.println("MergeSort com " + mil + " elementos tempo: " + tempo_total9 + " ms");
            MergeSortMil.add(tempo_total9);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println("----Ainda mais----");
            desordenada = gerador.gerarDecrescente(dez_mil);
            long tempo_inicial10 = System.currentTimeMillis();
            or.mergeSort(new ArrayList<>(desordenada));
            long tempo_final10 = System.currentTimeMillis();
            long tempo_total10 = (tempo_final10 - tempo_inicial10);
            System.out.println("MergeSort com " + dez_mil + " elementos tempo: " + tempo_total10 + " ms");
            MergeSortDezMil.add(tempo_total10);
            desordenada.removeAll(desordenada);
        }

        Gerador g = new Gerador();

        System.out.println("\n--- Médias de Tempo de Execução (em ms) ---");
        System.out.println("QuickSort com " + mil + " elementos: " + QuickSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("QuickSort com " + dez_mil + " elementos: " + QuickSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("BubbleSort com " + mil + " elementos: " + BubbleSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("BubbleSort com " + dez_mil + " elementos: " + BubbleSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("InsertionSort com " + mil + " elementos: " + InsertionSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("InsertionSort com " + dez_mil + " elementos: " + InsertionSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("SelectionSort com " + mil + " elementos: " + SelectionSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("SelectionSort com " + dez_mil + " elementos: " + SelectionSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("MergeSort com " + mil + " elementos: " + MergeSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("MergeSort com " + dez_mil + " elementos: " + MergeSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");

        System.out.println("\n--- Desvio Padrão de Tempo de Execução (em ms) ---");
        System.out.println("QuickSort com " + mil + " elementos: " + g.desvioPadrao(QuickSortMil) + " ms");
        System.out.println("QuickSort com " + dez_mil + " elementos: " + g.desvioPadrao(QuickSortDezMil) + " ms");
        System.out.println("BubbleSort com " + mil + " elementos: " + g.desvioPadrao(BubbleSortMil) + " ms");
        System.out.println("BubbleSort com " + dez_mil + " elementos: " + g.desvioPadrao(BubbleSortDezMil) + " ms");
        System.out.println("InsertionSort com " + mil + " elementos: " + g.desvioPadrao(InsertionSortMil) + " ms");
        System.out.println("InsertionSort com " + dez_mil + " elementos: " + g.desvioPadrao(InsertionSortDezMil) + " ms");
        System.out.println("SelectionSort com " + mil + " elementos: " + g.desvioPadrao(SelectionSortMil) + " ms");
        System.out.println("SelectionSort com " + dez_mil + " elementos: " + g.desvioPadrao(SelectionSortDezMil) + " ms");
        System.out.println("MergeSort com " + mil + " elementos: " + g.desvioPadrao(MergeSortMil) + " ms");
        System.out.println("MergeSort com " + dez_mil + " elementos: " + g.desvioPadrao(MergeSortDezMil) + " ms");
    }

    public void gerarOrdenadas(){

        System.out.println("Gerando listas em ordem Crescente");
        ArrayList<Long> BubbleSortMil = new ArrayList<>();
        ArrayList<Long> BubbleSortDezMil = new ArrayList<>();
        ArrayList<Long> InsertionSortMil = new ArrayList<>();
        ArrayList<Long> InsertionSortDezMil = new ArrayList<>();
        ArrayList<Long> QuickSortMil = new ArrayList<>();
        ArrayList<Long> QuickSortDezMil = new ArrayList<>();
        ArrayList<Long> MergeSortMil = new ArrayList<>();
        ArrayList<Long> MergeSortDezMil = new ArrayList<>();
        ArrayList<Long> SelectionSortMil = new ArrayList<>();
        ArrayList<Long> SelectionSortDezMil = new ArrayList<>();

        Ordenador or = new Ordenador(new ArrayList<>());
        Random r = new Random();
        int mil = 1000;
        int dez_mil = 10000;
        GeradorLista gerador = new GeradorLista();
        ArrayList<Integer> desordenada = new ArrayList<Integer>();
        ArrayList<String> ordenacoes = new ArrayList<String>();
        ordenacoes.add("aleatorio");
        ordenacoes.add("crescente");
        ordenacoes.add("decrescente");
        ListaCircular ordens = new ListaCircular(ordenacoes);
        ArrayList<String> metodosOrdenadores = new ArrayList<String>();
        metodosOrdenadores.add("bubbleSort");
        metodosOrdenadores.add("insertionSort");
        metodosOrdenadores.add("quickSort");
        metodosOrdenadores.add("selectionSort");
        metodosOrdenadores.add("mergeSort");
        ListaCircular jeitosOrdenadores = new ListaCircular(metodosOrdenadores);
        ArrayList<Integer> quantidades = new ArrayList<Integer>();
        quantidades.add(1000);
        quantidades.add(10000);
        ListaCircularNum quantidadesOrdenadoras = new ListaCircularNum(quantidades);
        Cronometro t = new Cronometro();
        long tempo_total=0;


        for (int repeticoes = 0; repeticoes < 30; repeticoes++) {
            System.out.println("Repetição: " + (repeticoes + 1));
            System.out.println(jeitosOrdenadores.paraFrente());

            desordenada = gerador.gerarCrescente(mil);

            long tempo_inicial = System.currentTimeMillis();
            or.bubbleSort(desordenada);
            long tempo_final = System.currentTimeMillis();

            tempo_total= (tempo_final-tempo_inicial);
            //tempo_total = t.Milissegundos(jeitosOrdenadores.getPosition(),desordenada);
            System.out.println(jeitosOrdenadores.getPosition()+ " com "+ mil+ "elementos, tempo: "+ tempo_total+ "ms");
            BubbleSortMil.add(tempo_total);
            desordenada.removeAll(desordenada);
            System.out.println("----mais ainda----");
            desordenada = gerador.gerarCrescente(dez_mil);
            long tempo_inicial2 = System.currentTimeMillis();
            or.bubbleSort(new ArrayList<>(desordenada));
            long tempo_final2 = System.currentTimeMillis();
            long tempo_total2 = (tempo_final2 - tempo_inicial2);
            System.out.println("BubbleSort com " + dez_mil + " elementos tempo: " + tempo_total2 + " ms");
            BubbleSortDezMil.add(tempo_total2);
            desordenada.removeAll(desordenada);


            //tempo_total = t.Milissegundos(jeitosOrdenadores.getPosition(),desordenada);
            System.out.println(jeitosOrdenadores.getPosition()+ " com "+ dez_mil+ "elementos, tempo: "+ tempo_total2 + "ms");
            BubbleSortDezMil.add(tempo_total2);
            desordenada.removeAll(desordenada);
            // --- Insertion Sort ---
            System.out.println(jeitosOrdenadores.paraFrente());
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarCrescente(mil);
            long tempo_inicial3 = System.currentTimeMillis();
            or.insertionSort(new ArrayList<>(desordenada));
            long tempo_final3 = System.currentTimeMillis();
            long tempo_total3 = (tempo_final3 - tempo_inicial3);
            System.out.println("InsertionSort com " + mil + " elementos tempo: " + tempo_total3 + " ms");
            InsertionSortMil.add(tempo_total3);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println("-----Ainda mais ------");
            desordenada = gerador.gerarCrescente(dez_mil);
            long tempo_inicial4 = System.currentTimeMillis();
            or.insertionSort(new ArrayList<>(desordenada));
            long tempo_final4 = System.currentTimeMillis();
            long tempo_total4 = (tempo_final4 - tempo_inicial4);
            System.out.println("InsertionSort com " + dez_mil + " elementos tempo: " + tempo_total4 + " ms");
            InsertionSortDezMil.add(tempo_total4);
            desordenada.removeAll(desordenada);

            // --- QuickSort ---
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarCrescente(mil);
            long tempo_inicial5 = System.currentTimeMillis();
            or.quickSort(new ArrayList<>(desordenada));
            long tempo_final5 = System.currentTimeMillis();
            long tempo_total5 = (tempo_final5 - tempo_inicial5);
            System.out.println("QuickSort com " + mil + " elementos tempo: " + tempo_total5 + " ms");
            QuickSortMil.add(tempo_total5);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println("----Ainda mais ----");
            desordenada = gerador.gerarCrescente(dez_mil);
            long tempo_inicial6 = System.currentTimeMillis();
            or.quickSort(new ArrayList<>(desordenada));
            long tempo_final6 = System.currentTimeMillis();
            long tempo_total6 = (tempo_final6 - tempo_inicial6);
            System.out.println("QuickSort com " + dez_mil + " elementos tempo: " + tempo_total6 + " ms");
            QuickSortDezMil.add(tempo_total6);
            desordenada.removeAll(desordenada);

            // --- Selection Sort ---
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarCrescente(mil);
            long tempo_inicial7 = System.currentTimeMillis();
            or.selectionSort(new ArrayList<>(desordenada));
            long tempo_final7 = System.currentTimeMillis();
            long tempo_total7 = (tempo_final7 - tempo_inicial7);
            System.out.println("SelectionSort com " + mil + " elementos tempo: " + tempo_total7 + " ms");
            SelectionSortMil.add(tempo_total7);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println(jeitosOrdenadores.paraFrente());
            desordenada = gerador.gerarCrescente(dez_mil);
            long tempo_inicial8 = System.currentTimeMillis();
            or.selectionSort(new ArrayList<>(desordenada));
            long tempo_final8 = System.currentTimeMillis();
            long tempo_total8 = (tempo_final8 - tempo_inicial8);
            System.out.println("SelectionSort com " + dez_mil + " elementos tempo: " + tempo_total8 + " ms");
            SelectionSortDezMil.add(tempo_total8);
            desordenada.removeAll(desordenada);

            // --- Merge Sort ---
            System.out.println(jeitosOrdenadores.paraFrente());

            // Com 1000 elementos
            desordenada = gerador.gerarCrescente(mil);
            long tempo_inicial9 = System.currentTimeMillis();
            or.mergeSort(new ArrayList<>(desordenada));
            long tempo_final9 = System.currentTimeMillis();
            long tempo_total9 = (tempo_final9 - tempo_inicial9);
            System.out.println("MergeSort com " + mil + " elementos tempo: " + tempo_total9 + " ms");
            MergeSortMil.add(tempo_total9);
            desordenada.removeAll(desordenada);

            // Com 10000 elementos
            System.out.println("----Ainda mais----");
            desordenada = gerador.gerarCrescente(dez_mil);
            long tempo_inicial10 = System.currentTimeMillis();
            or.mergeSort(new ArrayList<>(desordenada));
            long tempo_final10 = System.currentTimeMillis();
            long tempo_total10 = (tempo_final10 - tempo_inicial10);
            System.out.println("MergeSort com " + dez_mil + " elementos tempo: " + tempo_total10 + " ms");
            MergeSortDezMil.add(tempo_total10);
            desordenada.removeAll(desordenada);
        }

        Gerador g = new Gerador();

        System.out.println("\n--- Médias de Tempo de Execução (em ms) ---");
        System.out.println("QuickSort com " + mil + " elementos: " + QuickSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("QuickSort com " + dez_mil + " elementos: " + QuickSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("BubbleSort com " + mil + " elementos: " + BubbleSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("BubbleSort com " + dez_mil + " elementos: " + BubbleSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("InsertionSort com " + mil + " elementos: " + InsertionSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("InsertionSort com " + dez_mil + " elementos: " + InsertionSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("SelectionSort com " + mil + " elementos: " + SelectionSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("SelectionSort com " + dez_mil + " elementos: " + SelectionSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("MergeSort com " + mil + " elementos: " + MergeSortMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");
        System.out.println("MergeSort com " + dez_mil + " elementos: " + MergeSortDezMil.stream().mapToLong(Long::longValue).average().orElse(0) + " ms");

        System.out.println("\n--- Desvio Padrão de Tempo de Execução (em ms) ---");
        System.out.println("QuickSort com " + mil + " elementos: " + g.desvioPadrao(QuickSortMil) + " ms");
        System.out.println("QuickSort com " + dez_mil + " elementos: " + g.desvioPadrao(QuickSortDezMil) + " ms");
        System.out.println("BubbleSort com " + mil + " elementos: " + g.desvioPadrao(BubbleSortMil) + " ms");
        System.out.println("BubbleSort com " + dez_mil + " elementos: " + g.desvioPadrao(BubbleSortDezMil) + " ms");
        System.out.println("InsertionSort com " + mil + " elementos: " + g.desvioPadrao(InsertionSortMil) + " ms");
        System.out.println("InsertionSort com " + dez_mil + " elementos: " + g.desvioPadrao(InsertionSortDezMil) + " ms");
        System.out.println("SelectionSort com " + mil + " elementos: " + g.desvioPadrao(SelectionSortMil) + " ms");
        System.out.println("SelectionSort com " + dez_mil + " elementos: " + g.desvioPadrao(SelectionSortDezMil) + " ms");
        System.out.println("MergeSort com " + mil + " elementos: " + g.desvioPadrao(MergeSortMil) + " ms");
        System.out.println("MergeSort com " + dez_mil + " elementos: " + g.desvioPadrao(MergeSortDezMil) + " ms");

    }
}
