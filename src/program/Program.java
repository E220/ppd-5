package program;

import model.Polynomial;

import java.util.function.BiFunction;

public class Program {

    public interface MultiplyFunction extends BiFunction<Polynomial, Polynomial, Polynomial> {}
    private final MultiplyFunction method;

    private final Timer timer;
    private final int runs;

    public Program(MultiplyFunction method, Timer timer, int runs) {
        this.method = method;
        this.timer = timer;
        this.runs = runs;
    }

    public void run(Polynomial p1, Polynomial p2) {
        double avg = 0;
        for (int run = 0; run < runs; run++) {
            timer.start();
            method.apply(p1, p2);
            avg += timer.measure();
        }
        timer.print(avg / runs);
    }
}
