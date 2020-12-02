package FormaAleatoria10Digitos;
public class Pila {
    Nodo cima;
    int tam;

    public Pila() {
        this.cima = null;
        this.tam = 0;
    }

    public boolean EstaVacia() {
        return cima == null;
    }

    public void Agregar(int d) {
        Nodo nuevo = new Nodo(d);
        nuevo.sig = cima;
        cima = nuevo;
        tam++;
    }

    public int Quitar() {
        int aux = cima.dato;
        cima = cima.sig;
        tam--;
        return aux;
    }

    public int Cima() {
        return cima.dato;
    }

    public int Tamanio() {
        return tam;
    }

    public void MostrarPila() {
        Nodo aux = cima;
        while (aux != null) {
            System.out.println("[" + aux.dato + "]");
            aux = aux.sig;
        }
        System.out.println("");
    }

    public void NumerosRandom() {
        for (int i = 0; i < 10; i++) {
            int ram = ((int) Math.random() * 500 + 50);
            Agregar(ram);
        }
    }
}
