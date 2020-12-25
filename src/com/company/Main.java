package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*DayOne dayOne = new DayOne();
        dayOne.readFile();
        dayOne.oneStarChallenge();
        dayOne.twoStarsChallenge();
*/
        DayTwo dayTwo = new DayTwo();
        dayTwo.readFromFile();
        System.out.println("Ilosc poprawnych haseł: " + dayTwo.checkCorrectPasswords());
    }
}
