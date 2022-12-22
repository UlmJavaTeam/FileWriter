package com.java.team;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\javademos\\FilesNewFiles\\denemeler2-File.txt");
        File file1=new File("C:\\javademos\\FilesNewFiles\\fileWriterDosyasiFile.txt");
        FileWriter fileWriter = new FileWriter("C:\\javademos\\FilesNewFiles\\denemeler2.txt", false);
        FileWriter fileWriter1 = new FileWriter(file, false);

        fileWriter.write("write metodu calisti");
        fileWriter.append("\nappend metodu calisti");
        fileWriter.close();

        fileWriter1.write("file ile yazıyoruz");
        fileWriter1.write("\nikinci write kodu");
        fileWriter1.append("\nekleme kodu");
        fileWriter1.close();

        FileWriter2 fileWriter2=new FileWriter2("C:\\javademos\\FilesNewFiles\\doyaAdiTrue.txt",true);
        fileWriter2.fileWriterWrite("Dosya ismiyle birlikte yazılabilir \n");
        fileWriter2.fileWriterclose();

        FileWriter2 fileWriter3=new FileWriter2(file1,true);
        fileWriter3.fileWriterWrite("Hazır dosya ile yazılabilir \n");
        fileWriter3.fileWriterclose();
    }
}
