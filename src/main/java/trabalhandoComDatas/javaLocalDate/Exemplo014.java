package trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */

public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2021-03-14T14:38:22.542981

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2021-03-16T15:38:34.542981

    }
}

