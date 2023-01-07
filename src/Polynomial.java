import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Polynomial {
    final List<Integer> params;

    public Polynomial(int rank, Function<Integer, Integer> defaultSupplier) {
        this.params = IntStream.range(0, rank + 1).boxed()
                .map(paramRank -> defaultSupplier.apply(rank - paramRank))
                .collect(Collectors.toList());
    }
    public Polynomial(Integer... params) {
        this.params = Arrays.asList(params);
    }

    public int get(int rank) {
        if (rank > this.rank()) {
            return 0;
        }
        return params.get(params.size() - rank - 1);
    }

    public int rank() {
        return params.size() - 1;
    }

    @Override
    public String toString() {
        return params.toString();
    }
}
