package io;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/io/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/io/output.txt"));

            String line;
            while((line= reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
