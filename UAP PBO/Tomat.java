class Tomat extends Tanaman implements Perawatan  {
    public Tomat() {
        masaHidup = 100;
        berbuah = 100;
        perkembangan = 0.25;
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
            prosesBerbuah = prosesBerbuah - berbuah;
        }
    }

    @Override
    public void treatment() {
        perkembangan += 0.05;
    }

    @Override 
    public String toString() {
        return "Tomat - " + super.toString();
    }


}
