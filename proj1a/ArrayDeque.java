public class ArrayDeque<T> {
    private T[] array;
    private int size;
    private int nextFirst;
    private int nextLast;

    public ArrayDeque() {
        this.array = (T[]) new Object[8];
        size = 0;
        nextFirst = 4;
        nextLast = 5;
    }

    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(array, nextFirst + 1, a, 1, size);
        nextFirst = 0;
        nextLast = size + 1;
        this.array = a;
    }


    public void addFirst(T item) {
        if (size == array.length) {
            resize(2 * size);
        }
        if (nextFirst == 0) {
            nextFirst = array.length - 1;
        }
        array[nextFirst] = item;
        nextFirst--;
        size ++;
        // if < 0?
    }

    public void addLast(T item) {
        if (size == array.length) {
            resize(2 * size);
        }
        if (nextLast == array.length - 1) {
            nextLast = 0;
        }
        array[nextLast] = item;
        nextLast++;
        size++;
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
        if (size > 0) {
            double usage = size/array.length;
            if (usage < 0.25) {
                resize(2 * size);
            }
            T first = array[nextFirst + 1];
            array[nextFirst + 1] = null;
            nextFirst++;
            size--;
            return first;
        } else {
            return null;
        }
    }

    public T removeLast() {
        if (size > 0) {
            T last = array[size - 1];
            size--;
            return last;
        } else {
            return null;
        }
    }

    public T get(int index) {
        return array[index];
    }
}
