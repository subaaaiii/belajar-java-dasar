public class Continue {
    static void main() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println("Perulangan Ganjil ke-"+i);
        }
    }
}
