package com.java.team;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\javademos\\FilesNewFiles\\test.txt");
        File file1=new File("C:\\javademos\\FilesNewFiles\\test1.txt");
        FileWriter fileWriter = new FileWriter("C:\\javademos\\FilesNewFiles\\fileNameandBoolean.txt", false);
        FileWriter fileWriter1 = new FileWriter(file, false);

        fileWriter.write("write method is working");
        fileWriter.append("\nappend method is working");
        fileWriter.close();

        fileWriter1.write("write method is working");
        fileWriter1.write("\nsecond write method is working");
        fileWriter1.append("\nappendable ");
        fileWriter1.close();

        FileWriter2 fileWriter2=new FileWriter2("C:\\javademos\\FilesNewFiles\\doyaAdiTrue.txt",true);
        fileWriter2.fileWriterWrite("we are writing with file name \n");
        fileWriter2.fileWriterclose();

        FileWriter2 fileWriter3=new FileWriter2(file1,true);
        fileWriter3.fileWriterWrite("with the name of file \n");
        fileWriter3.fileWriterclose();
    }
}
