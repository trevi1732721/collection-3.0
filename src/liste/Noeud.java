package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class Noeud {
    protected Object object;
    protected Noeud next;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Noeud getNext() {
        return next;
    }

    public void setNext(Noeud nextObject) {
        this.next = nextObject;
    }
}
