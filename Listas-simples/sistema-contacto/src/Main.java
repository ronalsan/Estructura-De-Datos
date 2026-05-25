public class Main {
    public static void main(String[] args) {
        ListaContactos lista = new ListaContactos();

        lista.insertarFinal(new Contacto("Ana", "3150000", "ana@email.com"));
        lista.insertarFinal(new Contacto("Luis", "3160000", "luis@email.com"));
        lista.insertarFinal(new Contacto("Carlos", "3170000", "carlos@email.com"));

        System.out.println("lista actual");
        lista.listar();
        System.out.println("Buscar");
        System.out.println(lista.buscar("ana"));

        System.out.println("eliminar");
        System.out.println(lista.eliminar("luis"));

        System.out.println("lista final");
        lista.listar();
        

    }
}