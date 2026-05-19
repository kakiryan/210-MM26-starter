package lec05;

public class BinaryTreeImpl<T> implements BinaryTree<T> {

    private T _value;
    private BinaryTree<T> _left;
    private BinaryTree<T> _right;

    public BinaryTreeImpl(T value, BinaryTree<T> left, BinaryTree<T> right) {
        _value = value;
        _left = left;
        _right = right;
    }


    @Override
    public T getValue() {
        return _value;
    }

    @Override
    public void setValue(T value) {
        _value = value;
    }

    @Override
    public BinaryTree<T> getLeft() {
        return _left;
    }

    @Override
    public BinaryTree<T> getRight() {
        return _right;
    }

    @Override
    public void setLeft(BinaryTree<T> left) {
        _left = left;
    }

    @Override
    public void setRight(BinaryTree<T> right) {
        _right = right;
    }

    @Override
    public int height() {
        // Done in class
        if (_left == null && _right == null) {
            return 0;
        } else if (_left == null) {
            return _right.height() + 1;
        } else if (_right == null) {
            return _left.height() + 1;
        } else {
            return Math.max(_left.height(), _right.height()) + 1;
        }
    }

    @Override
    public boolean contains(T value) {
        // Done in class
        if (_value == value) {
            return true;
        }  else if (_left == null && _right == null) {
            return false;
        } else if (_left == null) {
            return _right.contains(value);
        } else if (_right == null) {
            return _left.contains(value);
        } else {
            return _left.contains(value) || _right.contains(value);
        }
    }

    @Override
    public boolean isEmpty() {
        // Done in class
        return false;
    }
}
