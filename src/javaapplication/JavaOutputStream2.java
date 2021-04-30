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
public class JavaOutputStream2 {
    // Two files named 'append file' and 'override file' have been created with the same content.
    // The content is 'This file already has content.'
    // This code will demonstrate how to add content to an existing file or to override an existing file.
    public static void main(String[] args){
        try{
            OutputStream outputStream = new FileOutputStream("files/override file.txt");
            OutputStream outputStream1 = new FileOutputStream("files/append file.txt", true);
            
            String msg = "\nThis is a new line";
            byte[] array = msg.getBytes();
            outputStream.write(array); // This will override the content of 'override file.txt'.
            outputStream1.write(array); // This will append the message to the content of 'append file.txt'.
            
        } catch (IOException e){
            
        }
        
    }
}
