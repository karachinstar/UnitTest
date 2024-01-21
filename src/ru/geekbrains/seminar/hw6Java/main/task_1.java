package ru.geekbrains.seminar.hw6Java.main;

import java.util.Arrays;

public class task_1 {
    public static float[] arr1 = new float[(int) Math.round(Math.random() * 10)];
    public static float[] arr2 = new float[(int) Math.round(Math.random() * 10)];

    public static float avg1;
    public static float avg2;
    //List<Object> arr2 = new ArrayList<>();
    public static void main(String[] args) {

        fillArr(arr1);
        fillArr(arr2);
        avg1 = avgArr(arr1, avg1);
        avg2 = avgArr(arr2, avg2);
        System.out.println("Список №1 - " + Arrays.toString(arr1) + " - среднее значение = " + avg1);
        System.out.println("Список №2 - " + Arrays.toString(arr2) + " - среднее значение = " + avg2);
        System.out.println(compareAverage(avg1, avg2));
    }

    private static void fillArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.round(Math.random() * 10));
        }
    }

    private static float avgArr(float[] arr, float avg){
        for (float v : arr) {
            avg = avg + v;
        }
        avg /= arr.length;
        return avg;
    }

    private static String compareAverage(float avg1, float avg2){
        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg1 < avg2) {
            return "Второй список имеет большее среднее значение";
        }else if(avg1 == avg2){
            return "Среднее значение двух списков равны";
        }else{
            return "Данные одного из списков не корректны";
        }
    }
}
