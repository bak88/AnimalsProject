public class Program {

    public static void main(String[] args) {

        try(Counter counter = new Counter()) {
            counter.add();
            System.out.println("Count: " + counter.getCount());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
