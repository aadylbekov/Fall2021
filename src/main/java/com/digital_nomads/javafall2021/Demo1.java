package com.digital_nomads.javafall2021;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        try {


            FileWriter myWriter = new FileWriter ("filename.txt");
            Scanner myReader = new Scanner((Readable)myWriter);


            myWriter.write("My file is created");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
