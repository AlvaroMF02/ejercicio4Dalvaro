package daw.alvaro;

/**
 *
 * @author alvaro
 */
public class Persona {

    //ATRIBUTOS
    private String nombre;
    private int edad;

    //CONSTRUCTORES
    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //GETTER SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //LLAMAR AL ANIMAL
    public void llamar(Animal pet) {
        pet.despertar();
    }

    //ALIMENTAR AL ANIMAL
    public void alimentar(Animal pet, double cantidad) {
        pet.comer(cantidad);
    }

    //JUGAR CON EL ANIMAL
    public void jugar(Animal pet, int cantidadMin) {
        //CONTROLAR LA EXCEPCION
        try {
            pet.jugar(cantidadMin);
        } catch (IllegalArgumentException iae) {
        }

    }

    @Override
    public String toString() {
        return "## Persona ##" + "\nNombre:" + nombre + "\nEdad:" + edad + "\n";
    }

}
