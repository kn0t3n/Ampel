package model;

public class RotGelb implements Zustand {

    private Model model;

    public RotGelb(Model model) {
        this.model = model;
        this.model.setPhase(Ampelphase.ROTGELB);
    }

    @Override
    public void weiter() {
        model.setZustand(new Gruen(model));
    }
}
