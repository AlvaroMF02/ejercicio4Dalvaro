package daw.programa;

import daw.alvaro.*;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author alvaro
 */
public class Prueba {

    public static void main(String[] args) {

        //CREAR DOS OBJETOS ANIMALES
        Animal a1 = new Animal(LocalDate.of(2005, Month.APRIL, 13),
                "Keca", TipoAnimal.PERRO, 30.23, TipoEstado.COMIENDO);
        Animal a2 = new Animal(LocalDate.of(2002, Month.DECEMBER, 15),
                "Nino", TipoAnimal.GATO, 10.0, TipoEstado.DURMIENDO);

        //CREAR DOS OBJETOS PERSONAS
        Persona p1 = new Persona("Francisco", 29);
        Persona p2 = new Persona("Ana", 20);

        //IMPRIMIR ANIMALES CON TO STRING
        System.out.println(a1);
        System.out.println(a2);

        //CREAR UNA COPIA DE A1 A A3
        Animal a3 = Animal.clonar(a2);
        System.out.println(a3);

        //P1 DESPIERTA A TODOS LOS ANIMALES
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

        //P2 JUEGA CON A2 120 MIN                                                                   //NEGATIVOOOOO
        System.out.println(p2.getNombre() + " quiere jugar 120 min con " + a2.getNombre());
        p2.jugar(a2, 120);
        System.out.println(" Ahora " +a2.getNombre()+" pesa " + a2.getPeso() + "\n");

        //P1 ALIMENTA 1000 GRAMOS A A1
        System.out.println(a1.getNombre() +" pesaba " + a1.getPeso());
        p1.alimentar(a1, 1000);
        System.out.println(" Ahora pesa " + a1.getPeso() + "\n");

        //P1 JUEGA CON A1 200 MIN      EXCEPCION
        System.out.println(p1.getNombre() + " quiere jugar 200 min con " + a1.getNombre());
        p1.jugar(a1, 200);
        System.out.println( a1.getNombre() +" pesa " + a1.getPeso());
    }
}
