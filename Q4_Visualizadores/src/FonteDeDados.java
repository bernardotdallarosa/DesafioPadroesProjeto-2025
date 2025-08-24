import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observer> observers;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observers = new LinkedList<>();
    }

    public void add(Integer value){
        if (value < -2) throw new IllegalArgumentException("Valor invalido");
        if(value > 0){
            lst.add(value);
            notifica(value);
        }
    }

    public void notifica(Integer value){
        for(Observer o : observers){
            o.update(value);
        }
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    
    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}