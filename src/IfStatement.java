public class IfStatement {
    static void main() {
        int nilai = 70;
        int absen = 80;

        if (nilai >=75 && absen >= 75){
            System.out.println("Selamat, anda lulus");
        }else{
            System.out.println("Maaf coba lagi tahun depan");
        }

        if(nilai >= 100 && nilai <=90 ){
            System.out.println("Nilai anda A");
        }else if(nilai < 90 && nilai >=80 ){
            System.out.println("Nilai anda B");
        }else if(nilai < 80 && nilai >=70 ){
            System.out.println("Nilai anda C");
        }else{
            System.out.println("Nilai anda D");
        }
    }
}
