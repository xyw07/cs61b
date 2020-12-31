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


    public static void main(String[] args) {
//        addFirstTest();
        addFirstEmptyTest();
    }
}
