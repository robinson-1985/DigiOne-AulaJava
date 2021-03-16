package trabalhandoComDatas.javaLocalDate;

import java.time.LocalTime;

/**
 * Exemplo de como manioular LocalTime
 */

public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 14:33:59.069784

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 15:33:59.069784

    }
}
