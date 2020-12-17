package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DayOne dayOne = new DayOne();
        dayOne.readFile();
        dayOne.oneStarChallenge();
        dayOne.twoStarsChallenge();

    }
}
