package trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1563127311564

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Mar 14 11:27:56 BRT 2021

    }
}

