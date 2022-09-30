import java.sql.SQLOutput;
import java.util.Scanner;

public class MAYORAL {
    public static void main(String[] args) {

        Scanner MAYORAL = new Scanner(System.in);
        //declaramos variables
        double a, b, c, MAYOR, MEDIO, MENOR;
        // seguimos con el codigo:

        System.out.println("ingresa el primer número: --> ");
        a = MAYORAL.nextDouble();

        System.out.println("ingresa el segundo número --> ");
        b = MAYORAL.nextDouble();

        System.out.println("ingresa el tercer número --> ");
        c = MAYORAL.nextDouble();

        if (a > b && a > c) {
            MAYOR = +a;
        } else if (+b > +a && +b > +c) {
            MAYOR = +b;
        } else {
            MAYOR = +c;
        }

        if (+a < +b && +a < +c) {
            MENOR = +a;
        } else if (+b < +a && +b < +c) {
            MENOR = +b;
        } else {
            MENOR = +c;
        }

        MEDIO= (+a + +b + +c) - (+MAYOR + +MENOR);
        System.out.println("");
            System.out.println("el oreden ascendente de los numero es: --> ");
        System.out.println(+MENOR);
        System.out.println(+MEDIO);
        System.out.println(+MAYOR);

        }
    }