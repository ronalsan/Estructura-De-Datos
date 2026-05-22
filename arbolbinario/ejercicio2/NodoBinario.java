package arbolbinario.ejercicio2;
public class NodoBinario {

    private int dato;
    private NodoBinario izquierda;
    private NodoBinario derecha;

    public NodoBinario(int dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public NodoBinario getIzquierda() {
        return izquierda;
    }

    public NodoBinario getDerecha() {
        return derecha;
    }

    public void setIzquierda(NodoBinario izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(NodoBinario derecha) {
        this.derecha = derecha;
    }
}