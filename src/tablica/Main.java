package tablica;

public class Main {
    public static void main(String[] args){

        int[]tab= {1, 732, 2556, 123124214, 5, 43, 9, 21};
        int n;
        n = tab[0];

        for(int i = 0; i < tab.length; i++){
            if (n < tab[i]){
                n = tab[i];
            }
        }
     System.out.println(n);
    }

}
