package test.com.ing.parsing;

import main.java.com.ing.parsing.ParsingUtility;

import java.util.ArrayList;
import java.util.List;

public class ParsingUtilityTest {

    List<String> list = new ArrayList<String>();
    ParsingUtility utility = new ParsingUtility();
    List<String[]> parsedList = new ArrayList<>();

    void GetMockdata(){
        list.add("REQUEST 201 api/books   1557826337404   1557826337517   OK");
        list.add("REQUEST 203 api/health   1557835529850   1557835532324   KO  connection refused");
    }

    void getTotalRequestsTest(){
        utility.getTotalRequests(list);
    }

    void getTotalFailedRequestsTest(){
        utility.getTotalFailedRequests(list);
    }

    void getAverageResponseTimeTest(){
        utility.getAverageResponseTime(parsedList);
    }
}
