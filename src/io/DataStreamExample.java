package io;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        try{
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/io/data.dat"));
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/io/data.dat"));

            dataOutputStream.writeInt(4542);
            dataOutputStream.writeDouble(109.123);
            dataOutputStream.writeUTF("My name is Marufur Rahman Remon");

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());

            dataOutputStream.close();
            dataInputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
