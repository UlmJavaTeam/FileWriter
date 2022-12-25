package com.java.team;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter myFile = new FileWriter("c:\\temp\\test.txt");


        myFile.write("Hello world");
        myFile.write("                            ");
        myFile.writeNewLine();
        myFile.write("Hello world");
        myFile.close();
    }
}
