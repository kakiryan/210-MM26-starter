package lec04.sortedList;

public interface SortedList<T extends Comparable<T>> {
    // size
    // Returns the number of elements in the list.
    int size();

    // isEmpty
    // Returns true if list is empty, false otherwise.
    default boolean isEmpty() {
        return size() == 0;
    }

    // lookup
    // Given an element, returns index where element would
    // be found if inserted into the list. Result ranges from
    // 0 to size() inclusive.
    default int look(T element) {
        if (isEmpty()) {
            return 0;
        }

        // if smaller than than smallest thing in the list, then it should go at zero
        if (element.compareTo(get(0)) <=0 ) {
            return 0;
        }

        // go end at the end
        if (element.compareTo(get(size()-1)) >=0 ) {
            return size();
        }

        // if i get here, i'm strictly smaller than the size
        // strictly greater than the low
        int low = 0;
        int high = size() - 1;
        while (low < high - 1) {
            int mid = (high + low) / 2;
            T mid_elt = get(mid);

            // found element
            if (element.compareTo(mid_elt) == 0) {
                return mid;
            } else if (element.compareTo(mid_elt) < 0) {
                // pull high down
                high = mid - 1;
            } else {
                // pull the low up
                low = mid + 1;
            }
        }
        return high;
    }

    // find
    // Returns index of first occurrence of specified element
    // or -1 if not found.
    default int find(T element) {
        int idx = look(element);
        if (get(idx).compareTo(element) == 0) {
            return idx;
        }
        return -1;
    }

    // insert
    // Inserts element to list at appropriate sorted position.
    void insert(T element);

    // remove
    // Removes element from list and returns true if found,
    // otherwise list is unchanged and returns false.
    boolean remove(T element);

    // get
    // Returns the element at the specified position in this list.
    // Position must be in the range between 0 and size-1.
    T get(int index);
}
