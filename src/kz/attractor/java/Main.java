package kz.attractor.java;

import com.company.FileService;
import kz.attractor.java.lesson44.Lesson44Server;
import kz.attractor.java.lesson44.LibraryDataModel;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        LocalDate ld ;
//        ld = LocalDate.now();
//        System.out.println(ld);

        com.company.FileService fs = new FileService();
        System.out.println(fs.readBooks());


        try {
            new Lesson44Server("localhost", 9889).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
