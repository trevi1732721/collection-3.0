package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public interface Liste<T> {
   public void add(int index, T objet);
   public void add(T objet);
   public void set(int index, T objet);
   public Object get(int index);
   public void remove(int index);
   public void clear();
   public int size();

}
