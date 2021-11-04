package ru.tn.courses.afedorenko.v5.task1;

/*
    Сортировка Шелла. Дан массив n действительных чисел.
    Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента ai и аi+1.
    Если ai ≤ ai+1, то продвигаются на один элемент вперед.
    Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки.
 */

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Subtask_3 {
    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers(50);
        
        System.out.println("Initial list:" + numbers.toString());
        
        var i = 0;
        while (i < numbers.size() - 1) {
            if (numbers.get(i) <= numbers.get(i + 1)) {
                ++i;
            } else {
                Collections.swap(numbers, i, i + 1);
                if (i > 0) {
                    --i;
                }
            }
        }
        System.out.println("\nSorted list:" + numbers);
    }
    
    public static List<Integer> generateNumbers(int maxValue) {
        Random random = new Random(1);
        return Stream.iterate(1, n -> random.nextInt(100)).limit(maxValue).collect(Collectors.toList());
    }
}
