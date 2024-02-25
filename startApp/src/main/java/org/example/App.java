package org.example;

import org.example.searadar.mr231.station.Mr231StationType;
import org.example.searadar.mr231_3.convert.Mr2313Converter;  // Changed class name to follow UpperCamelCase
import ru.oogis.searadar.api.message.SearadarStationMessage;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Контрольный пример для МР-231
        String mr231Ttm = "$RATTM,66,28.71,341.1,T,57.6,024.5,T,0.4,4.1,N,b,L,,457362,А*42";

        // Проверка работы конвертера
        Mr231StationType mr231 = new Mr231StationType();
        Mr231Converter converter = mr231.createConverter();
        List<SearadarStationMessage> searadarMessages = converter.convert(mr231Ttm);
        System.out.println("Контрольный пример для МР-231:");
        searadarMessages.forEach(System.out::println);

        // Контрольный пример для МР-231-3
        String mr2313Ttm = "$1RA2TTM3,01,10.5,180.0,T,20.0,090.0,T,15.0,120.0,N,b,L,,123456,A*78";

        // Проверка работы конвертера МР-231-3
        Mr2313Converter converter3 = new Mr2313Converter();  // Changed class name to follow UpperCamelCase
        List<SearadarStationMessage> searadarMessages3 = converter3.convert(mr2313Ttm);
        System.out.println("Контрольный пример для МР-231-3:");
        searadarMessages3.forEach(System.out::println);
    }
}
