public class Main {
    public static void main(String[] args) {
        final Polynomial p1 = new Polynomial(5, i -> i);
        final Polynomial p2 = new Polynomial(1, 2, 3, 4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Multiply.multiply(p1, p2));
        System.out.println(Add.add(p1, p2));
    }
}