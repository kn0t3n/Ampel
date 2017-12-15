package model;

public class Gruen implements Zustand {

    private Model model;

    public Gruen(Model model) {
        this.model = model;
        this.model.setPhase(Ampelphase.GRUEN);
    }

    @Override
    public void weiter() {
        model.setZustand(new Gelb(model));
    }
}
