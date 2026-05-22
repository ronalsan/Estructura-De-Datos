package arbolbinario.ejercicio2;
public class ArbolBinario {

    private NodoBinario raiz;

    public NodoBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoBinario raiz) {
        this.raiz = raiz;
    }

    // PREORDEN
    public void preorden(NodoBinario nodo) {

        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            preorden(nodo.getIzquierda());
            preorden(nodo.getDerecha());
        }
    }

    // INORDEN
    public void inorden(NodoBinario nodo) {

        if (nodo != null) {
            inorden(nodo.getIzquierda());
            System.out.print(nodo.getDato() + " ");
            inorden(nodo.getDerecha());
        }
    }

    // POSTORDEN
    public void postorden(NodoBinario nodo) {

        if (nodo != null) {
            postorden(nodo.getIzquierda());
            postorden(nodo.getDerecha());
            System.out.print(nodo.getDato() + " ");
        }
    }
}