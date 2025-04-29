import java.util.ArrayList;
import java.util.Random;
public class GeradorLista {


    public ArrayList<Integer> gerarAleatorio(int tamanho){
        ArrayList<Integer> o = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < tamanho; i++) {
            o.add(r.nextInt());
        }
        return o;
    }

    public ArrayList<Integer> gerarCrescente(int tamanho){
        ArrayList<Integer> o = new ArrayList<Integer>();
        for (int i = 0; i < tamanho; i++) {
            o.add(i);
        }
        return o;
    }

    public ArrayList<Integer> gerarDecrescente(int tamanho){
        ArrayList<Integer> o = new ArrayList<Integer>();
        int max = tamanho;
        for (int i = 0; i < tamanho; i++) {
            o.add(max);
            max--;
        }
        return o;
    }

}
