public abstract class Beute {

    public abstract String getTyp();

    public void fliehen() {
        if(Math.random() > 0.4)
            System.out.println(getTyp() + " flieht!");
        else
            System.out.println(getTyp() + " flieht nicht.");
    }
}
