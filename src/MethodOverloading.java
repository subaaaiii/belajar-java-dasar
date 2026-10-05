public class MethodOverloading {
    static void main() {
        sayHello();
        sayHello("subairi");
        sayHello("eko", "kurniawan");
    }
    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firstName){
        System.out.println("Hello, "+firstName);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello, "+firstName+" "+lastName);
    }
}
