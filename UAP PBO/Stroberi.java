class Stroberi extends Tanaman implements Perawatan {
    public Stroberi() {
        masaHidup = 60;
        berbuah = 150;
        perkembangan = 0.35;
        lamaHidup = 0;
        buah = 0;
        prosesBerbuah = 0;
    }

    @Override 
    public void berkembang() {
        lamaHidup++;
        prosesBerbuah += perkembangan;
        if (prosesBerbuah >= berbuah) {
            buah++;
            prosesBerbuah = prosesBerbuah- berbuah;
        }
    }

    @Override 
    public void treatment() {
        perkembangan += 0.05;
    }

    @Override 
    public String toString() {
        return "Stroberi - " + super.toString();
    }
}
