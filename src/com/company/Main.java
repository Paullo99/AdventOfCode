package com.company;

public class Main {

    public static void main(String[] args) {
        DayOne dayOne = new DayOne();
        DayTwo dayTwo = new DayTwo();
        DayThree dayThree = new DayThree();

        dayOne.readFile("day_one.txt");
        System.out.println("\n----- Zagadka dzień 1 -----");
        dayOne.oneStarChallenge();
        dayOne.twoStarsChallenge();

        dayTwo.readFromFile("day_two.txt");
        System.out.println("\n----- Zagadka dzień 2 -----");
        System.out.println("Ilosc poprawnych haseł (*): " + dayTwo.validPasswordsOldInterpretation());
        System.out.println("Ilosc poprawnych haseł (**): " + dayTwo.validPasswordsNewInterpretation());

        dayThree.readFromFile("day_three.txt");
        System.out.println("\n----- Zagadka dzień 3 -----");
        System.out.println("Liczba spotkanych drzew to (*): " + dayThree.countTreesOneStar());
        System.out.println("Iloczyn liczby spotkanych drzew to (**): " + dayThree.countTreesTwoStars());

    }
}
