public class Karatsuba {
    public static Polynomial multiply(Polynomial p1, Polynomial p2) {
        final int rank = Math.max(p1.rank(), p2.rank());

        if (rank == 0) {
            return Multiply.multiply(p1, p2);
        }

        final int upperMiddle = (rank + 1) / 2;
        final int lowerMiddle = Math.max((rank - 1) / 2, 0);

        final Polynomial x1 = Slice.slice(p1, rank, upperMiddle);
        final Polynomial x0 = Slice.slice(p1, lowerMiddle, 0);

        final Polynomial y1 = Slice.slice(p2, rank, upperMiddle);
        final Polynomial y0 = Slice.slice(p2, lowerMiddle, 0);

        final Polynomial z2 = Karatsuba.multiply(x1, y1);
        final Polynomial z0 = Karatsuba.multiply(x0, y0);
        final Polynomial z1 = Subtract.subtract(
                Karatsuba.multiply(
                        Add.add(x1, x0),
                        Add.add(y1, y0)
                ),
                Add.add(z2, z0)
        );

        return Add.add(
                ShiftUp.shift(z2, 2 * upperMiddle),
                ShiftUp.shift(z1, upperMiddle),
                z0
        );
    }
}
