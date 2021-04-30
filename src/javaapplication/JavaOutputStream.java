/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author RND SOFTWARE
 */
public class JavaOutputStream {
    public static void main(String[] args) {
        /* create an output stream using a try-with context.
         * a try-with context will create the stream and automatically close it ones the try-with block is run.
         * pass in the path to the file you want to write to.
         * Note that the path I used is relative to my current working directory (in this case, the project folder)
         * you can use a valid path to any text file you have on your computer.
         * I am going to write to the file.
         */
        
        
        try {
            // create a string. (The value of the string is what you want to write to the file).
            String msg = "I am just practising with java io packages";
            
            try (OutputStream outputStream = new FileOutputStream("files/text2.txt")) {
                // if the file doesn't exist, it will create a new file
                // if the file exist, it will override the old file

                // get a byte array from the string
                byte[] array = msg.getBytes();
                
                // write to the bytes from the array into the output stream 
                outputStream.write(array);
                
                // successfully written to the file.
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
