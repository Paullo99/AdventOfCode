package com.company;

public class Main {

    public static void main(String[] args) {
        /*DayOne dayOne = new DayOne();
        dayOne.readFile();
        dayOne.oneStarChallenge();
        dayOne.twoStarsChallenge();

        DayTwo dayTwo = new DayTwo();
        dayTwo.readFromFile();
        System.out.println("Ilosc poprawnych haseł (1 gwiazdka): " + dayTwo.validPasswordsOldInterpretation());
        System.out.println("Ilosc poprawnych haseł (2 gwiazdki): " + dayTwo.validPasswordsNewInterpretation());

         */

        DayThree dayThree = new DayThree();
        dayThree.readFromFile();
        System.out.println("Liczba spotkanych drzew to (*): " + dayThree.countTreesOneStar());
        System.out.println("Liczba spotkanych drzew to (**): " + dayThree.countTreesTwoStars());

    }
}
