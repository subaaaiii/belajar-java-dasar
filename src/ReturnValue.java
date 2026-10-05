public class ReturnValue {
    static void main() {
        var operasi = hitung(10, 11);
        System.out.println(operasi);

        var operasi2 = hitung2(100, "-", 90);
        System.out.println(operasi2);
        var operasi3 = hitung2(100, "+", 90);
        System.out.println(operasi3);
    }
    static int hitung(int value1, int value2){
        return value1 + value2;
    }
    static int hitung2(int value1, String operasi, int value2){
        switch (operasi) {
            case "+":
                return value1 + value2;

            case "-":
                return value1 - value2;

            default:
                return 0;
        }
    }
}
