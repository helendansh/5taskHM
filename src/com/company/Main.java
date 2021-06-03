package com.company;

import java.time.LocalDate;
import java.util.*;

/**
 * Зачтено 03.06.2021
 */

public class Main {

    public static void main(String[] args) {
        Map<String,LocalDate> testmap = createMap();
        removeAllSummerPeople(testmap);
        System.out.println(testmap);
    }
    public static Map<String, LocalDate> createMap () {
        Map <String, LocalDate> map = new HashMap<>();
        map.put("Иванов", LocalDate.of(1984,7,4));
        map.put("Петров", LocalDate.of(1993,3,24));
        map.put("Смирнов", LocalDate.of(1967,11,19));
        map.put("Воробьева", LocalDate.of(1988,12,17));
        map.put("Крылова", LocalDate.of(1994,9,27));
        map.put("Быков", LocalDate.of(2001,6,18));
        map.put("Дятлов", LocalDate.of(1978,2,19));
        map.put("Волкова", LocalDate.of(1995,5,16));
        map.put("Зайцев", LocalDate.of(1981,7,22));
        map.put("Семенова", LocalDate.of(1979,8,6));
        return map;
    }
    public static void removeAllSummerPeople (Map<String, LocalDate> map) {
        map.entrySet().removeIf(i -> i.getValue().getMonthValue() > 5 && i.getValue().getMonthValue() < 9);
    }

}
