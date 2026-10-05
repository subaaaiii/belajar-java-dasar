public class Array {
    static void main() {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0]= "Eko";
        stringArray[1]= "kurniawan";
        stringArray[2]= "khannedy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[1] = "budi";

        System.out.println(stringArray[1]);

        String[] stringArray2 = new String[4];

        String[] namaNama = {
                "eko", "kurniawan", "khannedy"
        };

        namaNama[2] =  null;

        int[] arrayInt = new int[]{
                1,2,3,4,5,6
        };

        long[] arrayLong = {
                10L, 20L, 100L
        };

        arrayLong[2] = 30L;

        String[][] members ={
                {"eko", "kurniawan"},
                {"budi", "nugraha"},
                {"joko"}
        };
        System.out.println(members[0][1]); //kurniawan
        System.out.println(members[2][0]); //joko

    }
}
