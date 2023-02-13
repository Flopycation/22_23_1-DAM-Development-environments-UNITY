public class App {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        System.out.println(myArray);
        System.out.println("Removed: " + myArray.remove());
        System.out.println(myArray);
        myArray.sort(Integer::compareTo);
        System.out.println("Sorted: " + myArray);
    }
}
