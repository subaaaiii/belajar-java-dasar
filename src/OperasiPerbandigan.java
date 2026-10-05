public class OperasiPerbandigan {
    static void main() {
        var absen = 70;
        var nilaiAkhir = 80;

        Boolean lulusAbsen= absen  >= 75;
        Boolean lulusNilai= nilaiAkhir  >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
