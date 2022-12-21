public class Main {
    public static void main(String[] args) {
        final Polynomial<Integer> p1 = new Polynomial<>(5, i -> i);
        System.out.println(p1);
        final Polynomial<Integer> p2 = new Polynomial<>(1, 2, 3, 4);
        System.out.println(p2);
    }
}