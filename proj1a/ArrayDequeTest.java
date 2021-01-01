public class ArrayDequeTest {
    public static void addFirstTest() {
        System.out.println("Test");
        ArrayDeque<Integer> a = new ArrayDeque<>();
        for (int i =0; i < 4; i++) {
            a.addFirst(i);
        }
        int b = a.removeLast();
        System.out.print("removeLast" + b);
        System.out.println();
        a.printDeque();
    }

    public static void addFirstEmptyTest() {
        ArrayDeque<Integer> ArrayDeque = new ArrayDeque<>();
        ArrayDeque.addFirst(0);
        ArrayDeque.addFirst(1);
        ArrayDeque.addFirst(2);
        ArrayDeque.addFirst(3);
        ArrayDeque.addFirst(4);
        ArrayDeque.addFirst(5);
        ArrayDeque.isEmpty();
        ArrayDeque.addFirst(7);
        ArrayDeque.addFirst(8);
        ArrayDeque.addFirst(9);
    }

    public static void addLastremoveTest() {
        ArrayDeque<Integer> ArrayDeque = new ArrayDeque<>();
        ArrayDeque.addLast(0);
        ArrayDeque.removeLast();//      ==> 0
        ArrayDeque.addLast(2);
        ArrayDeque.isEmpty();
        ArrayDeque.addLast(4);
        ArrayDeque.addLast(5);
        ArrayDeque.addLast(6);
        ArrayDeque.addLast(7);
        ArrayDeque.addLast(8);
        ArrayDeque.addLast(9);
        ArrayDeque.addLast(10);
        ArrayDeque.addLast(11);
    }

    public static void test() {
        ArrayDeque<Integer> ArrayDeque = new ArrayDeque<>();
        boolean a = ArrayDeque.isEmpty();
        System.out.println(a);
        ArrayDeque.addFirst(1);
        int b = ArrayDeque.removeFirst();
        System.out.println(b);
    }
    public static void main(String[] args) {
//        addFirstTest();
//        addFirstEmptyTest();
//        addLastremoveTest();
        test();
    }
}
