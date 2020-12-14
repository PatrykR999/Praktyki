package Moneta;

import java.security.SecureRandom;

public class Moneta {

    public static boolean flip() { // przechowywanie informacji booleanem
        SecureRandom random = new SecureRandom();
        int n = random.nextInt( 2);

        if( n == 1) { // nadanie zmiennej
            System.out.println("reszka"); // Wyswietlenie wyniku reszka
        } else {
            System.out.println("orzeł"); // Wyswietlenie wyniku orzel w innym przypadku
        }
        return false;
    }
}