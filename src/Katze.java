public class Katze {

    public void schlafen(int dauer) {
        System.out.println("Die Katze schläft " + dauer + " Minuten.");
    }

    public Beute jagen() {

        Beute beute;
        if(Math.random() > 0.3)
            beute = new Vogel();
        else
            beute = new Maus();

        System.out.println("Die Katze jagt " + beute.getTyp());

        return beute;
    }
}
