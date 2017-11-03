public class Tierheim {

    public Tierheim() {
        Katze muschi = new Katze();
        muschi.schlafen(40);
        muschi.schlafen(10);

        Katze carlo = new Katze();
        Beute b = carlo.jagen();
        b.fliehen();
    }

}
