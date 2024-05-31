class Persik extends Tanaman implements Perawatan {
    public Persik() {
        masaHidup = 180;
        berbuah = 250;
        perkembangan = 0.15;
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
        perkembangan += 0.025;
    }

    @Override
    public String toString() {
        return "Persik - " + super.toString();
    }
}
