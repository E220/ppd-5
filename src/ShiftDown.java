public class ShiftDown {
    public static Polynomial shift(Polynomial p, int decrease) {
        return new Polynomial(
                p.rank() - decrease,
                rank -> p.get(rank + decrease)
        );
    }
}
