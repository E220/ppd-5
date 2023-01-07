package operations.multiply;

import model.Polynomial;

public class Multiply {
    public static Polynomial multiply(Polynomial p1, Polynomial p2) {
        return new Polynomial(
                p1.rank() + p2.rank(),
                rank -> {
                    int sum = 0;
                    for (int i = Math.max(0, rank - p2.rank()); i <= rank && i <= p1.rank(); i++) {
                        sum += p1.get(i) * p2.get(rank - i);
                    }
                    return sum;
                }
        );
    }
}
