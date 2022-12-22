package com.java.team;

import java.io.*;
import java.util.Scanner;

public class FileWriter2 {

    private File file;
    private FileWriter fileWriter;

    public FileWriter2() throws IOException {
        this.file = new File("");
        this.fileWriter = new FileWriter(this.file);
    }

    /**
     * Constructs a com.java.team.FileWriter object given a File object.
     *
     * @param file a File object to write to
     * @throws IOException if the file exists but is a directory rather than a regular file,
     *                     does not exist but cannot be created, or cannot be opened for any other reason
     **/
    public FileWriter2(File file) throws IOException {

        file = new File("C:\\javademos\\FilesNewFiles\\sadeceHazirDosya.txt");
        this.file = file;
        if (!this.file.exists()) {
            this.fileWriter = new FileWriter(this.file);
            System.out.println("File created");
        } else {
            System.out.println("The file is already created!!!");
        }
    }

    /**
     * Constructs a com.java.team.FileWriter object given a File object. If the second argument is true,
     * then bytes will be written to the end of the file rather than the beginning.
     *
     * @param file   a File object to write to
     * @param append if true, then bytes will be written to the end of the file rather than the beginning
     * @throws IOException if the file exists but is a directory rather than a regular file,
     *                     does not exist but cannot be created, or cannot be opened for any other reason
     **/
    public FileWriter2(File file, boolean append) throws IOException {

        this.file =new File("C:\\javademos\\FilesNewFiles\\hazirDosyaBoolean.txt");
        if (!this.file.exists()) {
            System.out.println("File is created");
        } else {
            System.out.println("The file is already created!!!");
        }
        if (append == true) {
            System.out.println("Appendable file!!");
            this.fileWriter = new FileWriter(this.file, true);
        } else if (append = false) {
            System.out.println("Not Appendable file!!");
            this.fileWriter = new FileWriter(this.file, false);
        }

    }

    /**
     * Constructs a com.java.team.FileWriter object given a file name with a boolean indicating
     * whether or not to append the data written.
     *
     * @param fileName - String The system-dependent filename.
     * @param append   if true, then bytes will be written to the end of the file rather than the beginning
     * @throws IOException if the file exists but is a directory rather than a regular file,
     *                     does not exist but cannot be created, or cannot be opened for any other reason
     **/
    public FileWriter2(String fileName, boolean append) throws IOException {

        this.file = new File(fileName);
        if (!this.file.exists()) {
            System.out.println("File is created");

        } else {
            System.out.println("The file is already created!!!");
        }
        if (append == true) {
            System.out.println("Appendable file!!");
            fileWriter = new FileWriter(this.file, true);
        } else if (append = false) {
            System.out.println("Not Appendable file!!");
            fileWriter = new FileWriter(this.file, false);
        }

    }

    /**
     * Method writes given text to in constructor defined file.
     *
     * @param text text to write
     **/
    public boolean fileWriterWrite(String text) throws IOException {

        this.fileWriter.write(text);
        return true;

    }

    /**
     * Closes the stream, flushing it first. Once the stream has been closed, further write() or flush()
     * invocations will cause an IOException to be thrown. Closing a previously closed stream has no effect.
     *
     * @throws IOException If an I/O error occurs
     */
    public void fileWriterclose() throws IOException {
        fileWriter.close();
    }
}
