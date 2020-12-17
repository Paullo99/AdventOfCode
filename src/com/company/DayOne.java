package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayOne {

    private Scanner scanner;
    private final ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public void readFile(){
        try{
            System.out.println("Podaj nazwę pliku .txt: ");
            Scanner inputFilenameScanner = new Scanner(System.in);
            String filename = inputFilenameScanner.nextLine();
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            int i = 0;
            while (fileScanner.hasNext()) {
                arrayList.add(i, fileScanner.nextInt());
                i++;
            }
            fileScanner.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void oneStarChallenge() {
        for (int j = 0; j < arrayList.size(); j++) {
            for (Integer integer : arrayList) {
                if (arrayList.get(j) + integer == 2020) {
                    System.out.println("Wynik mnożenia (2 liczby) to: " + (arrayList.get(j) * integer));
                    return;
                }

            }
        }
    }

        public void twoStarsChallenge () {
            for (int j = 0; j < arrayList.size(); j++) {
                for (int k = 0; k < arrayList.size(); k++) {
                    for (Integer integer : arrayList) {
                        if (arrayList.get(j) + arrayList.get(k) + integer == 2020) {
                            System.out.println("Wynik mnożenia (3 liczby) to: " + (arrayList.get(j) * arrayList.get(k) * integer));
                            return;
                        }
                    }

                }
            }
        }
    }
