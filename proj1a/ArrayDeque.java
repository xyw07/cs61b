import javax.naming.spi.ObjectFactoryBuilder;

public class ArrayDeque<T> {
    private T[] array;
    private int size;

    public ArrayDeque() {
        this.array = (T[]) new Object[8];
        size= 0;
    }

    private void resize(int capacity){
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(array, 0, a, 0, size);
        this.array = a;
    }

    public void addFirst(T item) {
        if (size + 1 <= array.length) {
            ;
        } else {
            resize(2*size);
        }
        T[] a = (T[]) new Object[array.length];
        a[0] = item;
        System.arraycopy(array, 0, a, 1, size);
        size ++;
    }

    public void addLast(T item) {
        if (size == array.length) {
            resize(2*size);
        }
        array[size] = item;
        size ++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
    }

    public T removeFirst() {
        T[] a = (T[]) new Object[array.length];
        T first = array[0];
        System.arraycopy(array, 1, a, 0, size);
        array = a;
        size --;
        return first;
    }

    public T removeLast() {
        T last = array[size - 1];
        size --;
        return last;
    }

    public T get(int index) {
        return array[index];
    }
}
