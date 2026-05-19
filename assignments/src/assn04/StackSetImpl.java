package assn04;

public class StackSetImpl<T> implements StackSet<T>{
    private LinkedList<T> _ll;  // the underlying LinkedList of Nodes
    private final int _limit;  //defines the maximum size the stackset may contain
    private int _size;   //current count of elements in the stackset

    public StackSetImpl( int maxNumElts ){ //this constructor is needed for testing purposes.
        _ll = new LinkedList<>();                 //Please don't modify what you see here!
        _limit = maxNumElts;          // you may add fields if you need to
        _size = 0;
    }

    //implement all methods of the interface, and
    //also include the getRoot method below that we made for testing purposes.
    //Feel free to implement private helper methods!

    public LinkedList getRoot(){ //leave this method as is, used by the grader
        return _ll;
    }

    @Override
    public boolean push(T elt) {
       return false;
    }

    @Override
    public boolean pop() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean contains(T elt) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int limit() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public String toString() {
        String list = "";
        Node<T> current = _ll.getHead();
        while(current != null) {
            if(current.getNext() == null)
                list+= current.getValue();
            else
                list += current.getValue() + " -> ";
            current = current.getNext();
        }
        return list;
    }
}
