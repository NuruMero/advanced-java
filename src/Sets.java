import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del Set");
        conjunto.forEach(System.out::println);

        // Retirar elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos elementos del set");
        conjunto.forEach(System.out::println);
    }
}
