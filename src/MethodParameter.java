public class MethodParameter {
    static void main() {
        sayHello("Eko", "Kurniawan");
        sayHello("Eko", "Setiawan");
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " "+lastName);
    }
}
