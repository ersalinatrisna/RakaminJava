package FirstProgram;

//buat mengambil function dari beda package
import FirstProgram.firstprogram;
public class function {
    public static void main(String[] args){
        int x = 2;
        int y = 2;
        int z = 10;

        firstprogram.ersa("lina");
        firstprogram.ersa("trisna");
        firstprogram.ersa("wati");
        tambah(x,y);
        tambah(y, z);
        tambah(z, x);
    }

    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil "+a+" dan "+b+" adalah = " +hasilTambah);
        return hasilTambah;
    }
}
