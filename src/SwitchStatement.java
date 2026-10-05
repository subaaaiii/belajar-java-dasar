public class SwitchStatement {
    static void main() {
        String nilai = "E";

        switch (nilai){
            case "A":
                System.out.println("Selamat anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Selamat Anda lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        switch(nilai){
            case "A" -> System.out.println("Selamat anda lulus dengan baik");
            case "B", "C" -> System.out.println("Selamat anda lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda gagal");
                System.out.println("Sepertinya anda salah jurusan");
            }
        }

        String ucapan;
        ucapan = switch (nilai){
            case "A":
                yield "Selamat anda lulus dengan baik";
            case "B", "C":
                yield "Selamat anda lulus";
            case "D":
                yield "Anda Tidak lulus";
            default:
                yield "Yah";
        };
        System.out.println(ucapan);
    }
}
