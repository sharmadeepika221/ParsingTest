package main.java.com.ing.parsing;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author:Deepika
 * Date:26/05/2019
 * Purpose:This is the class where all functionality is happening.
 */

public class ParsingUtility {

    public int getTotalRequests(List<String> list) {
        return list.size();
    }

    public int getTotalFailedRequests(List<String> list) {
       return list.stream().
                filter(s->s.contains("KO") || s.contains("ko"))
                .collect(Collectors.toList()).size();
    }

    public double getAverageResponseTime(List<String[]> parsedList) {
        double responseTime=0;
        for(String[] array : parsedList){
            try {
                responseTime += new Double(array[8]).doubleValue() - new Double(array[5]).doubleValue();
            }catch(NumberFormatException e){
                System.out.println("Check the input file entries.");
            }
        }
        return responseTime/parsedList.size();
    }
}
