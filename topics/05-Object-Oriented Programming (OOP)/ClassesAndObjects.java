

public class ClassesAndObjects {
    int year = 2023;
    String brand = "Tesla";

    public static void main(String[] args) {
        ClassesAndObjects obj1 = new ClassesAndObjects();
        ClassesAndObjects obj2 = new ClassesAndObjects();

        System.out.println("Car Brand: " + obj1.brand); 
        System.out.println("Manufacturing Year: " + obj2.year); 
    }
}
