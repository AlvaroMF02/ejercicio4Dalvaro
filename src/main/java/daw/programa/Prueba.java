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
        /*
        - p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
        - p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.
        */
        
        //CREAR DOS OBJETOS ANIMALES
        Animal a1 = new Animal(LocalDate.of(2005, Month.APRIL, 13), 
                "Luka", TipoAnimal.PERRO, 30.23, TipoEstado.COMIENDO);
        Animal a2 = new Animal(LocalDate.of(2002, Month.DECEMBER, 15), 
                "Nino", TipoAnimal.GATO, 21.23, TipoEstado.DURMIENDO);
       
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
        
        //P2 JUEGA CON A2 120 MIN           SALE NEGATIVO
        p2.jugar(a2, 120);
        System.out.println(a2.getPeso());
        
        
    }
}
