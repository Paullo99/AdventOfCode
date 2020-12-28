package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayThree {
    private final ArrayList<String> inputLines = new ArrayList<>();

    public void readFromFile(){
        try{
            System.out.println("Podaj nazwę pliku .txt: ");
            Scanner inputFilenameScanner = new Scanner(System.in);
            String filename = inputFilenameScanner.nextLine();
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                inputLines.add(fileScanner.nextLine());
            }
            fileScanner.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int countTreesOneStar(){
        int counter = 0;
        for(int i=0, j=0; i<inputLines.size();i++, j+=3)
        {
            if(inputLines.get(i).charAt(j%31)=='#')
                counter++;

        }
        return counter;
    }

    public long countTreesTwoStars(){
        long counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0;

        //Right 1, down 1.
        for(int i=0, j=0; i<inputLines.size(); i++, j++)
            if(inputLines.get(i).charAt(j%31)=='#')
                counter1++;

        //Right 3, down 1.
        for(int i=0, j=0; i<inputLines.size(); i++, j+=3)
            if(inputLines.get(i).charAt(j%31)=='#')
                counter2++;

        //Right 5, down 1.
        for(int i=0, j=0; i<inputLines.size(); i++, j+=5)
            if(inputLines.get(i).charAt(j%31)=='#')
                counter3++;

        //Right 7, down 1
        for(int i=0, j=0; i<inputLines.size(); i++, j+=7)
            if(inputLines.get(i).charAt(j%31)=='#')
                counter4++;

        //Right 1, down 2.
        for(int i=0, j=0; i<inputLines.size(); i+=2, j++)
            if(inputLines.get(i).charAt(j%31)=='#')
                counter5++;

        long result = counter1 * counter2 * counter3 * counter4 * counter5;

        return result;
    }
}

