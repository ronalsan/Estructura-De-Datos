public class Nodo {

    private Contacto dato;
    Nodo siguiente;

    public Contacto getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setDato(Contacto dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo(Contacto dato) {
        this.dato = dato;
    }

    
}
