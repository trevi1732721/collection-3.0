package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class ListeLiée<T> implements Liste<T> {
    private Noeud debut = null;
    private Noeud fin;
    private int taille;

    public void add(T objet) {
        if (taille == 0) {
            Noeud nouveau = new Noeud();
            nouveau.setObject(objet);
            debut = nouveau;
            fin = debut;
            taille++;
        } else {
            Noeud suite = new Noeud();
            Noeud nouveauFin = new Noeud();
            suite.setObject(fin.getObject());
            suite.setNext(nouveauFin);
            nouveauFin.setObject(objet);
            fin = nouveauFin;
            index(taille - 2).setNext(suite);
            taille++;
        }
    }

    public void add(int index, T objet) {
        if (index == 0) {
            Noeud nouveau = new Noeud();
            nouveau.setObject(objet);
            debut = nouveau;
            fin = debut;
            taille++;
        } else {
            Noeud nouveau = new Noeud();
            nouveau.setObject(objet);
            nouveau.setNext(index(index));
            Noeud commencement = new Noeud();
            commencement = index(index-1);
            Noeud continuité = new Noeud();
            continuité = commencement.getNext();
            commencement.setNext(nouveau);
            taille++;
        }
    }

    public void set(int index, T objet) {
        index(index).setObject(objet);
    }

    public T get(int index) {
            return (T)(index(index).getObject());
    }

    public void remove(int index) {
        if(index == 0){
            debut = debut.getNext();
            taille--;
        }else{
        index(index - 1).setNext(index(index + 1));
        taille--;
        }
    }

    public void clear() {
        debut.setNext(null);
        debut.setObject(null);
        taille = 0;
    }

    public int size() {
        return taille;
    }

    public Noeud index(int index) {
        Noeud position;
        position = debut;
        if (index == 0) {
            return debut;
        }else{
            for (int i = 0; i < index; i++) {
                position = position.getNext();
            }
            return position;
        }
    }
}
