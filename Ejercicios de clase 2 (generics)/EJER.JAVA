import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiArray<T extends Comparable<T>> implements Collection<T> {
    private List<T> lista;

    public MiArray() {
        lista = new ArrayList<>();
    }

    public MiArray(int tamaño) {
        lista = new ArrayList<>(tamaño);
    }

    public boolean agregar(T elemento) {
        return lista.add(elemento);
    }

    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            return true;
        }
        return false;
    }

    public boolean buscar(T elemento) {
        return lista.contains(elemento);
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return lista.contains(o);
    }

    @Override
    public boolean add(T t) {
        return lista.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return lista.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return lista.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return lista.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return lista.retainAll(c);
    }

    @Override
    public void clear() {
        lista.clear();
    }
}
