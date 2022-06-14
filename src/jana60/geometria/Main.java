package jana60.geometria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rettangolo nuovo= new Rettangolo();

        Scanner valori = new Scanner(System.in);

        System.out.print("Inserisci la base del rettangolo: ");
        nuovo.base= valori.nextInt();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        nuovo.altezza= valori.nextInt();

        valori.close();

        System.out.println("L'area del rettangolo è: " +nuovo.area()+" e il perimetro è: "+nuovo.perimetro());
    }
}
