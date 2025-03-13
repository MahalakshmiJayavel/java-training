public class EncapsulationDemo {
    public static void main(String[] args) {
        User u = new User();
        u.setName("Mahaks");
        u.setMembership("premium");

        System.out.println(u.getName());
        System.out.println(u.getMembership());
    }
}
