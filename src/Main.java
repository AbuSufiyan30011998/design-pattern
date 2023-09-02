public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}