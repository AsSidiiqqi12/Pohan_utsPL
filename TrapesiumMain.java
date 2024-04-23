import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrapesiumMain {
    public static void main(String[] args) {
        String namaFile = "C:\\Semester 2\\Kuliah Semester 2\\src\\OOP\\trapezoid.csv";
        List<Trapesium> tr = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(namaFile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null){
                String[] urut = line.split(",");
                Trapesium trp = new Trapesium();
                trp.sisiA = Double.parseDouble(urut[0]);
                trp.sisiB = Double.parseDouble(urut[1]);
                trp.tinggi = Double.parseDouble(urut[2]);
                tr.add(trp);

            }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        for (Trapesium trr : tr ){
            double luas = trr.Luas();
            double kel = trr.keliling();
            System.out.println("Luas Trapesium: " + luas + "\n" + "Keliling Trapesium: " + kel) ;

        }
        System.out.println("=====================================================================");
        // kondisi kedua jika ada yang ditambahkan dan cek luas di atas 5000
        int jumlah = 0;
        for (Trapesium trp : tr){
            double luas = trp.Luas();
            // tambahkan kondisi sesuai soal
            if (luas > 5000){
                System.out.println("Luas Trapesium: " + luas);
                jumlah++;
            }
        }
        System.out.println("Jumlah Trapesium yang luasnya diatas 5000 adalah: " + jumlah);

    }
}

