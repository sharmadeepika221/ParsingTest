package main.java.com.ing.parsing;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author:Deepika
 * Date:26/05/2019
 * Purpose:This class will read and parse the log file
 */
public class RequestParser {

   static List<String> readFile(String fileName){
        List<String> list= new ArrayList<String>();
        try(Stream<String> stream = Files.lines(Paths.get(fileName))){
            list = stream
                    .filter(line -> line.startsWith("REQUEST") || line.startsWith("request"))
                    .collect(Collectors.toList());
        }catch(Exception e){

        }
        return list;
    }

    static List<String[]> parseRequestedList(List<String> list){
        List<String[]> listOfStrings= new ArrayList<String[]>(list.size());
        for(String str : list){
            listOfStrings.add(str.split("\\s"));
        }
        return listOfStrings;
}
}
