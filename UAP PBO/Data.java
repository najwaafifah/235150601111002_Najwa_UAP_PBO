import java.util.ArrayList;
import java.util.Scanner;

class Data {
    static ArrayList<Tanaman> tanamans = new ArrayList<>();
    static ArrayList<Integer> lokasi = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masa tanam (bulan): ");
        int bulan = in.nextInt();
        int hari = bulan * 30;

        for (int i = 0; i < 3; i++) {
            menanam();
        }

        for (int day = 0; day < hari; day++) {
            for (int i = 0; i < tanamans.size(); i++) {
                Tanaman t = tanamans.get(i);
                if (t.status().equals("Hidup")) {
                    t.berkembang();
                }
                if (lokasi.contains(i)) {
                    continue;
                }
                if (t.status().equals("Mati")) {
                    lokasi.add(i);
                    menanam();
                }
            }
            if (day % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        ((Perawatan) tanamans.get(i)).treatment();
                    }
                }
            }
        }
    }

    public static void menanam() {
        System.out.println("Mau tanam apa?");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = in.nextInt();

        Tanaman t = null;
        switch (pilihan) {
            case 1:
                t = new Tomat();
                break;
            case 2:
                t = new Stroberi();
                break;
            case 3:
                t = new Persik();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        tanamans.add(t);
        System.out.println("Berhasil menanam " + t.getClass().getSimpleName());
    }

    public static void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman ke-" + (i + 1) + ": " + tanamans.get(i).toString());
        }
    }
}
