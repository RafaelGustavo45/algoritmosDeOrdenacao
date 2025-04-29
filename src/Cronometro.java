import java.util.ArrayList;
public class Cronometro {

    public long tempo_inicial;

    public long tempo_final;
    public Ordenador ordem;

    public long getMs() {
        return ms;
    }

    public void setMs(long ms) {
        this.ms = ms;
    }

    public Ordenador getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordenador ordem) {
        this.ordem = ordem;
    }

    public long ms;

    public long getTempo_inicial() {
        return tempo_inicial;
    }

    public void setTempo_inicial(long tempo_inicial) {
        this.tempo_inicial = tempo_inicial;
    }

    public long getTempo_final() {
        return tempo_final;
    }

    public void setTempo_final(long tempo_final) {
        this.tempo_final = tempo_final;
    }


    public Cronometro(){
        Ordenador ordem = new Ordenador();
    }



    public long Milissegundos(String algoritmo,ArrayList<Integer> lista){
        switch (algoritmo){
            case "bubbleSort":
                setTempo_inicial(System.currentTimeMillis());
                ordem.bubbleSort(lista);
                setTempo_final(System.currentTimeMillis());
                setMs(calculoDeTempo());
                return ms;
            case "insertionSort":
                setTempo_inicial(System.currentTimeMillis());
                ordem.insertionSort(lista);
                setTempo_final(System.currentTimeMillis());
                setMs(calculoDeTempo());
                return ms;


            case "quickSort":
                setTempo_inicial(System.currentTimeMillis());
                ordem.quickSort(lista);
                setTempo_final(System.currentTimeMillis());
                setMs(calculoDeTempo());
                return ms;

            case "selectionSort":
                setTempo_inicial(System.currentTimeMillis());
                ordem.selectionSort(lista);
                setTempo_final(System.currentTimeMillis());
                setMs(calculoDeTempo());
                return ms;

            case "mergeSort":
                setTempo_inicial(System.currentTimeMillis());
                ordem.mergeSort(lista);
                setTempo_final(System.currentTimeMillis());
                setMs(calculoDeTempo());
                return ms;

            default:
                System.out.println("opção invalida");

        }
        return 0;
    }

    public long calculoDeTempo(){
        return getTempo_final()-getTempo_inicial();
    }
}
