package com.company;

public class Main {

    public static void main(String[] args) {
        /*DayOne dayOne = new DayOne();
        dayOne.readFile();
        dayOne.oneStarChallenge();
        dayOne.twoStarsChallenge();
*/
        DayTwo dayTwo = new DayTwo();
        dayTwo.readFromFile();
        System.out.println("Ilosc poprawnych haseł (1 gwiazdka): " + dayTwo.validPasswordsOldInterpretation());
        System.out.println("Ilosc poprawnych haseł (2 gwiazdki): " + dayTwo.validPasswordsNewInterpretation());
    }
}
