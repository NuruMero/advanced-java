public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5, 10, 30, 45};

        // foreach (individual : array)
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
    }
}
