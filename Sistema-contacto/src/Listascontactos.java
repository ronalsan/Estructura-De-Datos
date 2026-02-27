public class Listascontactos {
    public void insertarFinal(Contacto contacto){
        Nodo nuevo = new Nodo(contacto);

        if (cabeza == null){
            cabeza = nuevo;
        }
        else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente;
            }
            actual.getSiguiente = nuevo;
        }
    }
    public contacto buscar (String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual)
        }

}
