package arbolbinario.ejercicio2;
public class Main {
    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();

        NodoBinario raiz = new NodoBinario(192550);
        NodoBinario nodo1 = new NodoBinario(191830);
        NodoBinario nodo2 = new NodoBinario(191070);
        NodoBinario nodo3 = new NodoBinario(191820);
        NodoBinario nodo4 = new NodoBinario(191840);

        raiz.setIzquierda(nodo1);
        raiz.setDerecha(nodo2);

        nodo1.setIzquierda(nodo3);
        nodo1.setDerecha(nodo4);

        arbol.setRaiz(raiz);

        System.out.println("RECORRIDO PREORDEN");
        arbol.preorden(arbol.getRaiz());

        System.out.println("\n\nRECORRIDO INORDEN");
        arbol.inorden(arbol.getRaiz());

        System.out.println("\n\nRECORRIDO POSTORDEN");
        arbol.postorden(arbol.getRaiz());
    }
}