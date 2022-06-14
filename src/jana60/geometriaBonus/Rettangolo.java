package jana60.geometriaBonus;

public class Rettangolo {

    int base;
    int altezza;

     int area() {
        int area = base*altezza;
        return area;
    }

    int perimetro() {
         int perimetro = (base+altezza)*2;
         return perimetro;
    }

}
