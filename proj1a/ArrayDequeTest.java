public class ArrayDequeTest {
    public static void addFirstTest() {
        System.out.println("Test");
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addFirst(5);
        a.addFirst(10);
        a.removeFirst();
    }

    public static void main(String[] args) {
        addFirstTest();
    }
}
