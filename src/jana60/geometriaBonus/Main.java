package jana60.geometriaBonus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rettangolo nuovo= new Rettangolo();

        Scanner valori = new Scanner(System.in);

        int areaMaggiore=0;
        int i=0;
        while (i<5) {
            i++;
            System.out.print("Inserisci la base del rettangolo n."+(i)+": ");
            nuovo.base= valori.nextInt();
            System.out.print("Inserisci l'altezza del rettangolo n."+(i)+": ");
            nuovo.altezza= valori.nextInt();

            if (nuovo.area()>areaMaggiore) {
                areaMaggiore = nuovo.area();
            }

        }


        valori.close();

        System.out.println("L'area del rettangolo maggiore è: "+ areaMaggiore);
    }
}
