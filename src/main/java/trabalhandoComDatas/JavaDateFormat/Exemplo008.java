package trabalhandoComDatas.JavaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com DateFormat
 */

public class Exemplo008 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // 14/03/2021 13:50

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 14 de março de 2021 13:50


        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 14 de março de 2021 13:50:54 BRT

    }
}
