import java.util.ArrayList;

public class ListaCircularNum {
    private ArrayList<Integer> numeros;

    private int index;

    public ListaCircularNum(ArrayList<Integer> p){
        this.numeros=p;
        this.index=0;

    }

    public int paraFrente(){
        if (numeros.isEmpty()){
            return 0;
        }
        index++;
        if (index>= numeros.size()){
            index=0;
        }
        return numeros.get(index);
    }

    public int getIndex(){
        return this.index;
    }

    public ArrayList<Integer> getPalavras(){
        return this.numeros;
    }

    public int getPosition(){
        return numeros.get(index);
    }

}
