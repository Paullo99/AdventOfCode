package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayTwo {
    private final ArrayList<String> inputLines = new ArrayList<>();
    private final ArrayList<Integer> minRangeArrayList = new ArrayList<>();
    private final ArrayList<Integer> maxRangeArrayList = new ArrayList<>();
    private final ArrayList<Character> letterArrayList = new ArrayList<>();
    private final ArrayList<String> passwordArraylist = new ArrayList<>();

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

           divideInputLines();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void divideInputLines(){
        for (String inputLine : inputLines) {
            int index = inputLine.indexOf("-");
            String beginRange = inputLine.substring(0, index);
            minRangeArrayList.add(Integer.parseInt(beginRange));
            int endIndex = inputLine.indexOf(" ");
            String endRange = inputLine.substring(index+1, endIndex);
            maxRangeArrayList.add(Integer.parseInt(endRange));
            Character check = inputLine.charAt(++endIndex);
            letterArrayList.add(check);
            int indexOfPassword = inputLine.indexOf(": ");
            String password = inputLine.substring(indexOfPassword + 2);
            passwordArraylist.add(password);
        }
    }

    public int validPasswordsOldInterpretation(){
        int correctPasswords = 0;
        for(int i=0; i<inputLines.size(); i++){
            int counter =0;
            for(int j=0; j<passwordArraylist.get(i).length(); j++){
                if(passwordArraylist.get(i).charAt(j)==letterArrayList.get(i))
                    counter++;
            }
            if(counter<=maxRangeArrayList.get(i) && counter>=minRangeArrayList.get(i))
                correctPasswords++;
        }
        return correctPasswords;
    }

    public int validPasswordsNewInterpretation(){
        int correctPasswords = 0;
        for(int i=0; i<inputLines.size(); i++){

            if(passwordArraylist.get(i).charAt(minRangeArrayList.get(i)-1)==letterArrayList.get(i))
                if(passwordArraylist.get(i).charAt(maxRangeArrayList.get(i)-1)!=letterArrayList.get(i))
                    correctPasswords++;

            if(passwordArraylist.get(i).charAt(maxRangeArrayList.get(i)-1)==letterArrayList.get(i))
                if(passwordArraylist.get(i).charAt(minRangeArrayList.get(i)-1)!=letterArrayList.get(i))
                    correctPasswords++;
        }
        return correctPasswords;
    }
}
