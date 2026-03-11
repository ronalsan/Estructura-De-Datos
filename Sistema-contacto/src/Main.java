<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaContactos lista = new ListaContactos();

        lista.insertarFinal(new Contacto("joel", "310258651", "hotmail@gmail.com"));
        lista.insertarFinal(new Contacto("david", "311258652", "hot@gmail.com"));
        lista.insertarFinal(new Contacto("andres", "321255853", "hotcat@gmail.com"));
        lista.insertarFinal(new Contacto("antonia", "321278654", "hotdog@gmail.com"));

        System.out.println("lista actual \n");

        lista.listar();

        System.out.println("\n buscar antonia : ");
        System.out.println(lista.buscar("antonia"));

        System.out.println("\n eliminar a andres : ");
        System.out.println(lista.eliminar("andres"));


        System.out.println("\n Lista actual : ");

        lista.listar();

=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
>>>>>>> 03c8cb23ca5af8096b8cd8c76213f1d5ec6c2f5d
    }
}