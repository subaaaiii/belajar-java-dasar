public class TipeDataBukanPrimitif {
    static void main() {
//        tipe data bukan primitif default value nya null
        Integer iniIteger = 100;
        Long iniLong = 10000L;

//        Byte iniByte ;
//        System.out.println(iniByte); tidak bisa karena harus diinisialisasi
        Byte iniByte2 = null;
        System.out.println(iniByte2);

        int iniInt = 1000;
        Integer CVInt = iniInt;

        short iniShort = CVInt.shortValue();
        long iniLong2 = CVInt.longValue();
        float iniFloat = CVInt.floatValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);


    }
}
