public class LinkedListDeque<T> implements Deque<T> {
    private IntNode sentinel;
    private int size;

    public class IntNode {
        private T item;
        private IntNode next;
        private IntNode prev;

        public IntNode(T item) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }
        public IntNode(T item, IntNode prev, IntNode next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    public LinkedListDeque() {
        this.sentinel = new IntNode(null);
        this.sentinel.next = sentinel;
        this.sentinel.prev = sentinel;
//        this.sentinel = new IntNode(null, this.sentinel,sentinel);
    }

    @Override
    public void addFirst(T item) {
        IntNode remain = this.sentinel.next;
        IntNode a = new IntNode(item, sentinel, sentinel.next);
        this.sentinel.next = a;
        remain.prev = a;
        if (this.sentinel.prev == this.sentinel) {
            this.sentinel.prev = a;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        IntNode prevNode = sentinel.prev;
        IntNode a = new IntNode(item, sentinel.prev, sentinel);
        prevNode.next = a;
        sentinel.prev = a;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        IntNode curr = sentinel.next;
        while (curr.item != null) {
            System.out.print(curr.item);
            curr = curr.next;
        }
    }

    @Override
    public T removeFirst() {
        if (size > 0) {
            T first = sentinel.next.item;
            IntNode remain = this.sentinel.next.next;
            this.sentinel.next = remain;
            remain.prev = this.sentinel;
            size--;
            return first;
        } else {
            return null;
        }
    }

    @Override
    public T removeLast() {
        if (size > 0) {
            T last = sentinel.prev.item;
            IntNode remain = sentinel.prev.prev;
            remain.next = sentinel;
            sentinel.prev = remain;
            size--;
            return last;
        } else {
            return null;
        }
    }

    @Override
    public T get(int index) {
        IntNode curr = sentinel.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.item;
    }


    public T getRecursive(int index) {
        return helper(sentinel.next, index, 0);
    }

    private  T helper(IntNode n, int index, int level) {
        if (level == index) {
            return n.item;
        }
        return helper(n.next, index, level + 1);
    }
}
