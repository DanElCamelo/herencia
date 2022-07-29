public class Main {
    public static void main(String[] args) {

    Cliente cliente = new Cliente();

    //Asignacion de Atributos para el Objeto cliente

        cliente.setNombre("Daniel");
        System.out.println("Nombre: " + cliente.getNombre());

        cliente.setEdad(37);
        System.out.println("Edad: " + cliente.getEdad());

        cliente.setTelefono("0426-5122813");
        System.out.println("Telefono: " + cliente.getTelefono());

        cliente.setCredito("Aprobado");
        System.out.println("Su credito fue: " + cliente.getCredito());


    Trabajador trabajador = new Trabajador();

    //Asignacion de Atributos para el Objeto trabajador

        trabajador.setNombre("Luis");
        System.out.println("Nombre: " + trabajador.getNombre());
        trabajador.setEdad(42);
        System.out.println("Edad: " + trabajador.getEdad());
        trabajador.setTelefono("0426-5122524");
        System.out.println("Telefono: " + trabajador.getTelefono());
        trabajador.setSalario("US$ 3000");
        System.out.println("Salario Base: " + trabajador.getSalario());

    }
}

//Definicion de clase Persona (Clase Padre)
class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public Persona(){} // Creacion de Constructor

    //Accesores de Atributo(s) de la clase Persona segun propiedad(es) (nombre, edad, telefono)

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }

    }

//Definicion de clase Cliente (Clase Hija)
class Cliente extends Persona {
    private String credito;

    public Cliente() {} // Creacion de Constructor
    public void setCredito(String credito) {
        this.credito = credito;
    }
    public String getCredito() {
        return this.credito;
    }
}

//Definicion de clase Trabajador (Clase Hija)

class Trabajador extends Persona {
    private String salario;

    public Trabajador() {} // Creacion de Constructor

    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getSalario() {
        return this.salario;
    }
}