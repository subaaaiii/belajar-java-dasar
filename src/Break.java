public class Break {
    static void main() {
        var counter =1;
        while(true){
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if(counter==10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");

    }
}
