package lec04.sortedList;


public class SortedArrayList<T extends Comparable <T>> implements SortedList<T> {

    private int _size;
    private Object[] _elements;

    @Override
    public int size() {
        return 0;
    }


    @Override
    public void insert(T element) {
        if (size() == _elements.length){
            // call method to resize array!
        }

        int index = look(element); // O(LOGN)
        for (int i = size(); i> index; i--) { // O(N)
            _elements[i] = _elements[i-1]; // O(1)
        }
        _elements[index] = element; // O(1)
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }
}
