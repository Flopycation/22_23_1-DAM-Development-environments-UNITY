import java.util.Iterator;

public class MiArray<T extends Comparable<T>> implements Iterable<T> {
    private T[] lista;
    private int puntero;

    public MiArray() {
        this(50);
    }

    public MiArray(int tamaño) {
        lista = (T[]) new Comparable[tamaño];
        puntero = -1;
    }

    public void agregar(T elemento) {
        if (puntero == lista.length - 1) {
            redimensionar();
        }
        lista[++puntero] = elemento;
    }

    public T eliminar() {
        if (puntero < 0) {
            return null;
        }
        return lista[puntero--];
    }

    private void redimensionar() {
        T[] nuevaLista = (T[]) new Comparable[lista.length * 2];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        lista = nuevaLista;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorArray();
    }

    private class IteradorArray implements Iterator<T> {
        int actual = 0;

        @Override
        public boolean hasNext() {
            return actual <= puntero;
        }

        @Override
        public T next() {
            return lista[actual++];
        }
    }
}