/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author RND SOFTWARE
 */

public class JavaInputStream {
    public static void main(String[] args) throws IOException {
        /* first create an input stream
         * pass in the path to the file you want to read from
        
         * Note that the path I used is relative to my current working directory (in this case, the project folder)
         * you can use a valid path to any text file you have on your computer.
         * Also note that I have manually created this file in that path and write "HELLO WORLD" in it.
         * I am going to read the content of the file and print it.
         */
        
        InputStream inputStream = new FileInputStream("files/hello world.txt");
        
        /* create a byte array that will store the bytes read from the input stream
         * to instantiate a new byte array, the size of the array is required.
         * so I an estimate of the number of bytes that can be read from the input stream using the 'available' method 
         * then I used the estimate gotten as the size of the array.
         */
        int size = inputStream.available();
        byte[] byteArray = new byte[size];
        
        // after creating the byte array, read the bytes from the input stream and store in the array.
        inputStream.read(byteArray);
        
        /* The input stream has been used to read the content of the file and store in the array successfully.
         * The array can then be used to create a string whose value will be the content of the file.
         */
        String content = new String(byteArray);
        System.out.println(content);
    }
}
