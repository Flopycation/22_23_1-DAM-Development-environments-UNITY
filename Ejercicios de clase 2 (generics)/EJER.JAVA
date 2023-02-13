import java.util.Arrays;
import java.util.Comparator;

public class MyArray<T> implements Comparable<MyArray<T>>, Iterable<T> {
    private T[] array;
    private int pointer;

    public MyArray() {
        this.array = (T[]) new Object[50];
        this.pointer = 0;
    }

    public void add(T value) {
        if (pointer == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[pointer++] = value;
    }

    public T remove() {
        if (pointer == 0) {
            return null;
        }
        return array[--pointer];
    }

    @Override
    public int compareTo(MyArray<T> o) {
        return Integer.compare(pointer, o.pointer);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < pointer;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }

    public void sort(Comparator<T> comparator) {
        Arrays.sort(array, 0, pointer, comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pointer; i++) {
            sb.append(array[i]);
            if (i < pointer - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
