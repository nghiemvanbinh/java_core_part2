package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main( String[] args ) throws Exception {
        //---------------ex1-------------------//
        Post post = new Post();
        post.setTitle("Convert Java Object to String Json");
        post.setId(100L);
        post.setDescription("Use Jackson JSON API");
        post.setContent("HTML content");
        post.setLastUpdatedAt(new Date());
        post.setPostedAt(new Date());
        //--------------ex1-a----------------------//
        Gson gson = new Gson();
        String json = gson.toJson(post);
        System.out.println("----------------------ex1--------------------");
        System.out.println(json);
        //--------------ex1-b----------------------//
        FileWriter file = new FileWriter("src/main/java/org/example/Myjson.json");
        file.write(json);
        file.close();
        //----------------ex2------------------//
        String data =" {\n" +
                "  \"id\": 123,\n" +
                "  \"name\": \"Pankaj\",\n" +
                "  \"permanent\": true,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"Albany Dr\",\n" +
                "    \"city\": \"San Jose\",\n" +
                "    \"zipcode\": 95129\n" +
                "  },\n" +
                "  \"phoneNumbers\": [\n" +
                "    123456,\n" +
                "    987654\n" +
                "  ],\n" +
                "  \"role\": \"Manager\",\n" +
                "  \"cities\": [\n" +
                "    \"Los Angeles\",\n" +
                "    \"New York\"\n" +
                "  ],\n" +
                "  \"properties\": {\n" +
                "    \"age\": \"29 years\",\n" +
                "    \"salary\": \"1000 USD\"\n" +
                "  }\n" +
                "}\n";
        try (PrintWriter out = new PrintWriter("src/main/java/org/example/employee.txt")) {
            out.println(data);
        }
        //---------------------ex2-b-------------------------//
        System.out.println("-----------------ex2-------------------");
        String dataemployee = readFileAsString("src/main/java/org/example/employee.txt");
        Employee emp = gson.fromJson(dataemployee, Employee.class);
        System.out.println(emp.toString());
        //-----------------ex3-------------------------------//
        String jsonCarStr ="[{ \"color\" : \"White\", \"type\" : \"Vinfast\" }, { \"color\" : \"Blue\", \"type\" : \"Toyota\" }]";
        ArrayList<JsonCar> myList = gson.fromJson(jsonCarStr, ArrayList.class);
        System.out.println("-------------------ex3--------------------");
        System.out.println(myList);
    }

}
