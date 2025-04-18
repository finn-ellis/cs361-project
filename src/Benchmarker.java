package src;

import java.util.function.Function;

import src.algorithms.*;

public class Benchmarker {
    private static void benchmark(Function<int[], int[]> sortingAlgorithm) {
        // TODO: benchmark the algorithm according to project instructions
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int[] sorted = sortingAlgorithm.apply(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
    }

    private static void writeTestInputs() {
        //Run GenerateData with your own directory in the OUTPUT_DIR final variable.
    }

    public static void main(String[] args) {
        System.out.println("3 Merge Sort:");
        benchmark(MergeSort3::sort);
        System.out.println("Random Quick Sort:");
        benchmark(RandomQuickSort::sort);
    }
}
