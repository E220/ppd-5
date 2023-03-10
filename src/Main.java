import model.Polynomial;
import operations.multiply.Karatsuba;
import operations.multiply.Multiply;
import program.Program;
import program.Timer;

public class Main {
    public static void main(String[] args) {
        final Polynomial p1 = new Polynomial(5000, i -> i);
        final Polynomial p2 = new Polynomial(5000, i -> i);
        System.out.println(p1);
        System.out.println(p2);
//        System.out.println(Multiply.multiply(p1, p2));
//        System.out.println(Karatsuba.multiply(p1, p2));

        System.out.println("Classic: ");
        new Program(Multiply::multiply, new Timer(), 10).run(p1, p2);

        System.out.println("Karatsuba: ");
        new Program(Karatsuba::multiply, new Timer(), 10).run(p1, p2);
    }
}