package ru.tn.courses.afedorenko.v5.task1;

/*
        Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см,
        а каждый пасмурный день опускается вниз на 1 см, В начале наблюдения улитка
        находится в A см от земли на B-метровом дереве. Имеется 30-элементный массив,
        содержащий сведения о том, был ли соответствующий день наблюдения пасмурным или солнечным.
        Написать программу, определяющую местоположение улитки к концу 30-го дня наблюдения.
 */

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Subtask_2 {
    
    private static final Integer days = 30;
    
    private static final Integer A = 7;
    
    private static final Integer B = 100;
    
    public static void main(String[] args) {
        var snailPos = A;
        
        System.out.println("Snail started");
        
        List<Boolean> weather = getRandWeather(days);
        var sunnyDays = weather.stream().filter(Boolean::booleanValue).count();
        var grayDays = days - sunnyDays;
        snailPos += (int) (sunnyDays * 2 - grayDays);
        
        System.out.printf("Total:\t%dcm\t(%d/%dcm)%n", snailPos - A, snailPos, B);
    }
    
    public static List<Boolean> getRandWeather(Integer days) {
        Random random = new Random();
        return Stream.iterate(true, n -> random.nextBoolean()).limit(days).collect(Collectors.toList());
    }
}
