public class MethodVariableArgument {
    static void main() {
        sayCongrats("subairi", 75,80,70,75,80,70);
        sayCongrats("yanto", 70,80,70,75,70,70);
    }
    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value:values){
            total += value;
        }
        var finalValue = total / values.length;

        var ucapan = finalValue>=75 ? "Selamat anda lulus" : "Maaf coba lagi ";
        System.out.println(name+", " +ucapan);
    }
}
