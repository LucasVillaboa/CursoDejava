/**
 * Created by admin on 23/8/2022.
 */
import java.util.Scanner;
public class Tp6 {

    public static void main(String[]args){
        //Seno
        double a = Math.sin(0.5);
        System.out.println(a);
        //Coseno
        double b = Math.cos(0.5);
        System.out.println(b);
        //Tangente
        double c = Math.tan(0.5);
        System.out.println(c);
        //Arcotangente
        double d = Math.atan(1);
        System.out.println(d);
        //Exponenciación neperiana
        double e = Math.exp(1);
        System.out.println(e);
        // Logaritmo neperiano
        double f = Math.log(2.7172);
        System.out.println(f);

        //Math.PI
        double perimetro,radio;
        System.out.println("Introduce el rádio de un círculo: ");
        Scanner reader = new Scanner(System.in);
        radio = reader.nextDouble();

        perimetro = 2*Math.PI*radio;

        System.out.println("Un círculo de rádio " + radio + "tiene un perímetro de " + perimetro);


        //Math.E
        final double E = 2.7182818284590452354;
        System.out.println("e es " + Math.E);



    }
}
