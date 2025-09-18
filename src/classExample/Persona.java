package classExample;

public class Persona {

    // Atributos
    public String nombre;
    private int edad;

    public static int contadorPersonas = 0;

    //constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }

    //get
    public int getEdad() {
        return this.edad;
    }

    //set
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // public function with no return
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public static void mostrarContador() {
        System.out.println("Personas creadas: " + contadorPersonas);
    }
}

