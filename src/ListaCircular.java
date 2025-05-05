import java.util.ArrayList;

public class ListaCircular {
    private ArrayList<String> palavras;

    private int index;

    public ListaCircular(ArrayList<String> p){
        this.palavras=p;
        this.index=0;
    }

    public void reset(){
        this.index=0;
    }

    public String paraFrente(){
        if (palavras.isEmpty()){
            return null;
        }
        index++;
        if (index>= palavras.size()){
            index=0;
        }
        return palavras.get(index);
    }

    public int getIndex(){
        return this.index;
    }

    public ArrayList<String> getPalavras(){
        return this.palavras;
    }

    public String getPosition(){
        return palavras.get(getIndex());
    }

}
