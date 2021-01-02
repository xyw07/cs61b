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
//        System.arraycopy(array, nextFirst, a, 1, size);
        int last;
        if (nextLast == 0) {
            last = array.length - 1;
        } else {
            last = nextLast - 1;
        }
        int first;
        if (nextFirst == array.length - 1) {
            first = 0;
        } else {
            first = nextFirst + 1;
        }
        if (first > last) {
            int j = 0;
            for (int i = first; i <= array.length - 1; i ++) {
                a[j] = array[i];
                j++;
            }
            for (int i = 0; i <= last; i++) {
                a [j] = array[i];
                j++;
            }
        } else {
            System.arraycopy(array, first, a, 0, size);
        }
        nextFirst = capacity - 1;
        nextLast = size;
        this.array = a;
    }


    public void addFirst(T item) {
        if (size == array.length) {
            resize(2 * size);
        }
        array[nextFirst] = item;
        if (nextFirst == 0) {
            nextFirst = array.length - 1;
        } else {
            nextFirst--;
        }
        size++;
        // if < 0?
    }

    public void addLast(T item) {
        if (size == array.length) {
            resize(2 * size);
        }
        array[nextLast] = item;
        if (nextLast == array.length - 1) {
            nextLast = 0;
        } else {
            nextLast++;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        // prob: if nextFirst = length -1
        for (int i = nextFirst + 1; i < nextLast; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public T removeFirst() {
        if (size > 0) {
            double usage = 1.0 * size / array.length;
            if (usage < 0.25) {
                resize(2 * size);
            }
            int firstIndex;
            // prob: if nextFirst = length -1
            if (nextFirst == array.length - 1) {
                firstIndex = 0;
            } else {
                firstIndex = nextFirst + 1;
            }
            T first = array[firstIndex];
            array[firstIndex] = null;
            nextFirst = firstIndex;
            size--;
            return first;
        } else {
            return null;
        }
    }

    public T removeLast() {
        if (size > 0) {
            // prob: if nextLast = 0
            int lastIndex;
            if (nextLast == 0) {
                lastIndex = array.length - 1;
            } else {
                lastIndex = nextLast - 1;
            }
            T last = array[lastIndex]; // will the last change after array[lastIndex] = null? or is it a copy?
            array[lastIndex] = null;
            nextLast = lastIndex;
            size--;
            return last;
        } else {
            return null;
        }
    }

    public T get(int index) {
        if (index < size) {
            if (nextFirst + index + 1 <= array.length - 1) {
                return array[nextFirst + index + 1];
            } else {
                return array[nextFirst + index + 1 - (array.length)];
            }
        } else {
            return null;
        }
    }
}
