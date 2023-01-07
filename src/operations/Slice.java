package operations;

import model.Polynomial;

public class Slice {
    public static Polynomial slice(Polynomial p, int highest, int lowest) {
        return new Polynomial(
                highest - lowest,
                rank -> p.get(rank + lowest)
        );
    }
}
