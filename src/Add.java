public class Add {
    public static Polynomial add(Polynomial p1, Polynomial p2) {
        return new Polynomial(
                Math.max(p1.rank(), p2.rank()),
                rank -> p1.get(rank) + p2.get(rank)
        );
    }
}