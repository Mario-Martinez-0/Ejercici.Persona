public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nombre = "Jose";
        cliente.edad = 32;
        cliente.telefono = "3128652346";
        cliente.credito = 1990;

        System.out.println("Estos son los datos del Cliente");
        System.out.println("Nombre " + cliente.nombre);
        System.out.println("Edad " + cliente.edad);
        System.out.println("Telefono " + cliente.telefono);
        System.out.println("Credito " + cliente.credito);
        System.out.println("");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Carlos";
        trabajador.edad = 36;
        trabajador.telefono = "3148653283";
        trabajador.saldo = 2000;

        System.out.println("Estos son lso datos del Trabajador");
        System.out.println("Nombre " + trabajador.nombre);
        System.out.println("Edad " + trabajador.edad);
        System.out.println("Telefono " + trabajador.telefono);
        System.out.println("Saldo " + trabajador.saldo);
    }

}
class Persona{
    String nombre;
    int edad;
    String telefono;

}
class Cliente extends Persona{
    float credito;
}

class Trabajador extends  Persona{
    float saldo;
}