package daw.alvaro;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public class Animal {

    //ATRIBUTOS
    private LocalDate fecha;
    private String nombre;
    private TipoAnimal tipo;
    private double peso;
    private TipoEstado estado;

    //CONSTRUCTORES
    public Animal(LocalDate fecha, String nombre, TipoAnimal tipo, double gramos, TipoEstado estado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = gramos;
        this.estado = estado;
    }

    public Animal() {
    }

    //GETTER Y SETTER
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public double getGramos() {
        return peso;
    }

    public void setGramos(double gramos) {
        this.peso = gramos;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    //DAR DE COMER
    public void comer(double cantidadGramos) {
        this.peso = this.peso + Math.abs(cantidadGramos);
    }

    //PONER A DORMIR
    public void dormir() {
        this.estado = this.estado.DURMIENDO;
    }

    //DESPERTAR AL BICHO
    public void despertar() {
        this.estado = this.estado.DESPIERTO;
    }

    //DESCANSAR
    public void descansar() {
        this.estado = this.estado.REPOSO;
    }

    //TIEMPO DE JUEGO DEL ANIMAL
    //FALTA EL ILLEGAL ARGUMENT
    public void jugar(int cantidadMinutos) {

        cantidadMinutos = Math.abs(cantidadMinutos);

        if (cantidadMinutos < 30) {

            this.peso -= 10;

        } else if (cantidadMinutos >= 30) {

            //CUANTAS VECES HA ESTADO 30 MIN
            double rondas = cantidadMinutos / 30;
            //POR CADA 30 MIN SE MULTIPLICA LOS 20G Y SE RESTA AL PESO
            this.peso -= (rondas * 20);

        } else if (cantidadMinutos > 180) {
            //EXCEPCION
        }
    }
    
    //CLONAR MASCOTA
    //CONTROLAR NUL POINTER
    public static Animal clonar (Animal pet){
        Animal copia = new Animal();
        
        copia.setEstado(pet.getEstado());
        copia.setFecha(pet.getFecha());
        copia.setGramos(pet.getGramos());
        copia.setNombre(pet.getNombre());
        copia.setTipo(pet.getTipo());
        
        return copia;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "## Animal ##" + "\nFecha Nacimiento: " + fecha + "\nNombre: " + nombre
                + "\nTipo: " + tipo + "\nPeso: " + peso + "\nEstado: " + estado;
    }

}
