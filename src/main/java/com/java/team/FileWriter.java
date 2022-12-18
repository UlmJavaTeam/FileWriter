package com.java.team;

import java.io.File;
import java.io.IOException;

public class FileWriter {

    /**
     * Constructs a com.java.team.FileWriter object given a File object.
     * @param file a File object to write to
     * @throws IOException if the file exists but is a directory rather than a regular file,
     *                     does not exist but cannot be created, or cannot be opened for any other reason
     **/
    public FileWriter(File file) throws IOException {

    }

    /**
     * Constructs a com.java.team.FileWriter object given a File object. If the second argument is true,
     * then bytes will be written to the end of the file rather than the beginning.
     * @param file a File object to write to
     * @param append if true, then bytes will be written to the end of the file rather than the beginning
     * @throws IOException if the file exists but is a directory rather than a regular file,
     *                     does not exist but cannot be created, or cannot be opened for any other reason
     **/
    public FileWriter(File file, boolean append) throws IOException {

    }

    /**
     * Constructs a com.java.team.FileWriter object given a file name with a boolean indicating
     * whether or not to append the data written.
     * @param fileName - String The system-dependent filename.
     * @param append if true, then bytes will be written to the end of the file rather than the beginning
     * @throws IOException if the file exists but is a directory rather than a regular file,
     *                     does not exist but cannot be created, or cannot be opened for any other reason
     **/
    public FileWriter(String fileName, boolean append) throws IOException {

    }

    /**
     * Method writes given text to in constructor defined file.
     * @param text text to write
     **/
    public boolean write (String text) {
        return false;
    }

    /**
     * Closes the stream, flushing it first. Once the stream has been closed, further write() or flush()
     * invocations will cause an IOException to be thrown. Closing a previously closed stream has no effect.
     *
     * @throws IOException If an I/O error occurs
     * */
    public void close() throws IOException {

    }
}
