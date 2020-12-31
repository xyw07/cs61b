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

    public static void main(String[] args) {
        addFirstTest();
    }
}
