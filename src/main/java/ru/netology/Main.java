package ru.netology;

public class Main {
    public static void main(String[] args) {
        int minNumber = 700;
        int maxNumber = 2000;
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumber) {
                if (i * i <= maxNumber) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(counter);
    }
}
