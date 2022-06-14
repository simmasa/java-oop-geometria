package jana60.Bonus2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nuovo = new Scanner(System.in);
        int counter=0;
        int areaMax=0;
        int periMax=0;
        while (counter<5) {
            counter++;
            System.out.print("Inserisci base:");
            int base =nuovo.nextInt();
            System.out.print("Inserisci altezza:");
            int altezza= nuovo.nextInt();
            if (areaMax< Rettangolo.area(base,altezza)) {
                areaMax= Rettangolo.area(base,altezza);
                periMax= Rettangolo.perimetro(base, altezza);
            }
        }
        System.out.println("I valori di area e perimetro del rettangolo più grnade sono:"+areaMax+" e "+periMax);

    }
}

