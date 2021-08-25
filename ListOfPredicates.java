package EXERCISE;

import java.util.*;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int current = i;
            numbers.add(++current);
        }
        int[] divisibleNum = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(divisibleNum).max().getAsInt();
        Predicate<Integer> isTrue = number -> number % max != 0;

        for (int k = 0; k < numbers.size(); k++) {
            isTrue.test(numbers.get(k));
            numbers.removeIf(isTrue);
        }

        numbers.stream().forEach(a -> System.out.print(a + " "));


    }
}
