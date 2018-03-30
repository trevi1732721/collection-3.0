package liste;

/**
 * Created by trevi1732721 on 2018-03-26.
 */
public class Pile<T> {
    private ListeLiée liste = new ListeLiée();
    public void push(T objet){
        liste.add(objet);
    }
    public T pop(){
        T nouveau = (T) liste.get(liste.size());
        liste.remove(liste.size());
        return nouveau;

    }
    public T peek(){
        return (T) liste.get(liste.size());
    }
    public void clear(){
        liste.clear();
    }
    public int size(){
        return liste.size();

    }
}
