package liste;

/**
 * Created by trevi1732721 on 2018-03-26.
 */
public class File<T> {
    private ListeLiée liste = new ListeLiée();
    public void push(T objet){
        liste.add(objet);
    }
    public Object remove(){
        Object nouveau = liste.get(0);
        liste.remove(0);
        return nouveau;
    }
    public T peek(){
        return (T)liste.get(0);
    }
    public void clear(){
        liste.clear();
    }
    public int size(){
        return liste.size();
    }
}

