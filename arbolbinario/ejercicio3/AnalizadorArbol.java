package arbolbinario.ejercicio3;
public class AnalizadorArbol {

    // CONTAR NODOS
    public int contarNodos(NodoBinario nodo) {

        // Caso base
        if (nodo == null) {
            return 0;
        }

        // Caso recursivo
        return 1 + contarNodos(nodo.getIzquierda())
                 + contarNodos(nodo.getDerecha());
    }

    // ALTURA DEL ÁRBOL
    public int altura(NodoBinario nodo) {

        // Caso base
        if (nodo == null) {
            return -1;
        }

        int izquierda = altura(nodo.getIzquierda());
        int derecha = altura(nodo.getDerecha());

        return 1 + Math.max(izquierda, derecha);
    }
}