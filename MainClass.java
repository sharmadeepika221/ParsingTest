package main.java.com.ing.parsing;

import java.util.List;

/**
 * Author:Deepika
 * Date:26/05/2019
 * Purpose:This is the main entry point for this java application.
 */
public class MainClass {

    static List<String> list;
    static List<String[]>parsedList;

    static{
        list = RequestParser.readFile("resources/log.txt");
        parsedList =RequestParser.parseRequestedList(list);
    }

        public static void main(String[] args){
            ParsingUtility utility = new ParsingUtility();
            System.out.println("Total no of requests:"+ utility.getTotalRequests(list));
            System.out.println("Total no of failed requests:" + utility.getTotalFailedRequests(list));
            System.out.println("Average Response Time in milliseconds:" + utility.getAverageResponseTime(parsedList));
        }
}
