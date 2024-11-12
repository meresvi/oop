package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsHomework {
    //TODO: write method that will count text file lines and print it (put it in separate method)
// (you can use ChatGPT to generate this part)
// Trasnform FileNotFoundException into RuntimeException
// Catch this exception in main method call this method once for existing file
// second time for non-existing file
// print "YAY!" after file reading is done

    public static void main(String[] args) {
        String filePath = "C:/Users/svme/Downloads/demo.txt";
        int lineCount = countLines(filePath);
        printLineCount(lineCount);
    }

    // Method to count lines in a text file
    public static int countLines(String filePath) {
        int lineCount = 0;
        try {FileReader f = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(f);
            while (reader.readLine() != null) {
                lineCount++;
            }}
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lineCount;
            }




    // Method to print the line count
    public static void printLineCount(int lineCount) {
        System.out.println("The file has " + lineCount + " lines.");
    }

}
