import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkListas {
    private static final int N = 100_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        llenar(arrayList);
        llenar(linkedList);

        medirInsercionFinal("ArrayList", new ArrayList<>());
        medirInsercionFinal("LinkedList", new LinkedList<>());
    }

    private static void llenar(List<Integer> lista) {
        for (int i = 0; i < N; i++) {
            lista.add(i);
        }
    }

    private static void medirInsercionFinal(String nombre, List<Integer> lista) {

        long inicio = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            lista.add(i);
        }

        long fin = System.nanoTime();

        System.out.printf("%s: %.3f ms%n", nombre, (fin - inicio) / 1_000_000.0);
    }
}