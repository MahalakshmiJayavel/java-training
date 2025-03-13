import java.io.FileWriter;


public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("hello");
            fw.close();
        } catch (Exception e) {
            System.out.print("Sorry, invalid");
 }
}
}