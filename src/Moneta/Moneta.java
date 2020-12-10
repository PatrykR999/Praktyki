package Moneta;

import java.security.SecureRandom;

public class Moneta {

    public static int flip() {
        SecureRandom random = new SecureRandom();
        int n = random.nextInt( 2);

        if( n == 1) {
            System.out.println("reszka");
        } else {
            System.out.println("orzeł");
        }
    }
}