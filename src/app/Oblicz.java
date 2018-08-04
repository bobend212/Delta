package app;

import java.text.DecimalFormat;

public class Oblicz extends App {

    private int a, b, c;

    public Oblicz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String obliczanie() {

        String rozwiazanie = "";

        int sum = (b * b) - 4 * a * c;

        if (sum > 0) {
            double sumw1 = Math.sqrt(sum);

            double w1 = (-b - sumw1) / (2 * a);
            double w2 = (-b + sumw1) / (2 * a);

            DecimalFormat dformatter = new DecimalFormat("0.0"); 
            String formatt = dformatter.format(w1);
            String formatt2 = dformatter.format(w2);

            rozwiazanie = sum + " // FUNKCJA POSIADA 2 MIEJSCA ZEROWE // " + formatt + " & " + formatt2;
        }
        else if (sum == 0) {
            
           double w3 = -b/2*a;
           
           rozwiazanie = sum + " // FUNKCJA POSIADA 1 MIEJSCE ZEROWE // " + w3;
        }
        else if (sum < 0) {
            rozwiazanie = sum + " // FUNKCJA NIE POSIADA MIEJSC ZEROWYCH";
        }
        
        return rozwiazanie;
    }
}
