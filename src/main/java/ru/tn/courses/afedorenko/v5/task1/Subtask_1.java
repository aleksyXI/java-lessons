package ru.tn.courses.afedorenko.v5.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Дана последовательность натуральных чисел a1, a2, ..., an.
    Создать массив из четных чисел этой последовательности.
    Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Subtask_1 {
    public static void main(String[] args) {
        List<Integer> processedList = findEvenNumbers(generateEvenNumbers(10));
        System.out.println(processedList);
    }
    
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        numbers.removeIf((i) -> (i & 1) == 1);
        return numbers;
    }
    
    public static List<Integer> generateEvenNumbers(int maxValue) {
        return Stream.iterate(1, n -> n + 1).limit(maxValue).collect(Collectors.toList());
    }
}
