package operations;

import model.Polynomial;

public class ShiftUp {
    public static Polynomial shift(Polynomial p, int increase) {
        return new Polynomial(
                p.rank() + increase,
                rank -> {
                    if (rank - increase < 0) {
                        return 0;
                    } else {
                        return p.get(rank - increase);
                    }
                }
        );
    }
}
