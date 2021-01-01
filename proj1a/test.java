public class test {
    /** To test variable point to an elemnt of an array and chaneg that to a null*/
    public static void main(String[] args) {
//        String[] a = new String[]{"I", "am", "testing"};
//        String pointer = a[2];
//        System.out.println(pointer);
//        a[2] = null;
//        System.out.println(pointer);

        test[] t = (test[])new Object[3];
        test p = t[2];
        t[2] = null;
        if (p == null) {
            System.out.println("null");
        } else {
            System.out.println("p is copy");
            System.out.println(p.test);
        }

    }
    public boolean test;

    public test() {
        test = true;
    }


}
