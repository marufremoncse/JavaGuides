package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("src/io/input.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("src/io/output.txt");

            int byteData;
            while((byteData = fileInputStream.read())!=-1){
                fileOutputStream.write(byteData);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
