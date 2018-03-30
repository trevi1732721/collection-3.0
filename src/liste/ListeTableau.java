package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class ListeTableau<T> implements Liste<T>{

    protected T liste[] =(T[]) new Object[5];
    protected int index;
    protected int taille = 0;

    public void add(int index,T objet){
        tooSmall();
        for(int i = taille-1; i>=0 ;i--){
            liste[i+1]=liste[i];
        }
        liste[index]=objet;
        taille++;
        tooSmall();
    }
    public void add(T objet) {
        tooSmall();
        liste[taille] = objet;
        taille++;
    }
    public void set(int index,T objet){
        liste[index] = objet;
    }
    public T get(int index){
        return liste[index];
    }
    public void remove(int index){
        liste[index]= null;
        taille--;
        for(int i = index;i<liste.length-1 ;i++){
            liste[i] = liste[i+1];
        }
    }
    public void clear(){
        liste = (T[]) new Object[5];
        taille=0;
    }
    public int size(){
        return taille;
    }

    public void tooSmall(){
        if(liste.length == taille) {
            T tableau[] = (T[]) new Object[liste.length * 2];
            for (int i = 0; i < liste.length; i++) {
                tableau[i] = liste[i];
            }
            liste = (T[]) new Object[tableau.length];
            for (int i = 0; i < liste.length; i++) {
                liste[i] = tableau[i];
            }
        }
    }
}
