import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Polynomial<T extends Number> {
    final List<T> params;

    public Polynomial(int rank, Function<Integer, T> defaultSupplier) {
        this.params = IntStream.range(0, rank + 1).boxed()
                .map(paramRank -> defaultSupplier.apply(rank - paramRank))
                .collect(Collectors.toList());
    }
    public Polynomial(T... params) {
        this.params = Arrays.asList(params);
    }

    public T get(int rank) {
        return params.get(params.size() - rank - 1);
    }

    @Override
    public String toString() {
        return params.toString();
    }
}
