public class App {
    public static void main(String[] args) {
        MiArray<Integer> miArray = new MiArray<>();
        miArray.agregar(1);
        miArray.agregar(2);
        miArray.agregar(3);

        System.out.println("Elemento eliminado: " + miArray.eliminar());

        for (Integer elemento : miArray) {
            System.out.println(elemento);
        }
    }
}