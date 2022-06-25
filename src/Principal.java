import com.upchiapas.C2_Practica_03.Calcular;
import com.upchiapas.C2_Practica_03.Persona;

import java.util.Scanner;
public class Principal {
    static Scanner teclado=new Scanner(System.in);

    public static void main(String[] args) {
        Persona Objetopersona;
        Calcular Objetocalcular=new Calcular();
    int dia, mes, anio;
        System.out.println("Ingrese el dia de nacimiento");
        dia=teclado.nextInt();
        System.out.println("Ingrese el dia el mes de nacimiento");
        mes=teclado.nextInt();
        System.out.println("Ingrese el anio de nacimiento");
        anio=teclado.nextInt();
        Objetopersona=new Persona(dia,mes,anio);
        Objetocalcular.CalcularNumero(Objetopersona);
    }
}
