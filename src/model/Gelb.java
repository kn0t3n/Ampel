package model;

public class Gelb implements Zustand {

    private Model model;

    public Gelb(Model model) {
        this.model = model;
        this.model.setPhase(Ampelphase.GELB);
    }

    @Override
    public void weiter() {
        model.setZustand(new Rot(model));
    }
}
