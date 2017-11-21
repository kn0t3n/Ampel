
class Presenter {

    private final PassiveView view;
    private Model model;

    Presenter(PassiveView view) {
        this.view = view;
    }

    void setModel(Model model) {
        this.model = model;
    }

    void buttonWeiter() {
        model.weiter();
    }

    void displayPhase(Ampelphase phase) {
        switch (phase) {
            case ROT:
                view.rotAn();
                view.gelbAus();
                view.gruenAus();
                break;
            case ROTGELB:
                view.rotAn();
                view.gelbAn();
                view.gruenAus();
                break;
            case GRUEN:
                view.rotAus();
                view.gelbAus();
                view.gruenAn();
                break;
            case GELB:
                view.rotAus();
                view.gelbAn();
                view.gruenAus();
                break;
        }
    }

}
