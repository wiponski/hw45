package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kz.attractor.java.lesson44.BookData;
import kz.attractor.java.lesson44.CustomerData;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
    static Gson gson =new Gson();
    public static List readBooks(){
        Path path = Paths.get("./src/kz/attractor/java/lesson44/books.json");
        String json;
        try {
            json = Files.readString(path);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return gson.fromJson(json,List.class);
    }
    public static List readCustomers(){
        Path path = Paths.get("./src/kz/attractor/java/lesson44/customers.json");
        String json;
        try {
            json = Files.readString(path);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return gson.fromJson(json,List.class);
    }

    public static void writeFile(BookData[] books){

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json = gson1.toJson(books);
        System.out.println("\n toJson(): ");
        System.out.println(json);

    }
}
