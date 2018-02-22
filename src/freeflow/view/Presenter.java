package freeflow.view;

import freeflow.model.Game;

/**
 * @author Arjan Tammer
 * @version 1.0 2/8/2018 21:12
 */
public class Presenter {

    private Game model;
    private ConsoleView view;

    public Presenter(Game model, ConsoleView view) {
        this.model = model;
        this.view = view;
        start();
    }

    private void start() {
        model.setUserName(view.inputUserName());
        model.startGame();
        view.drawGrid(model.getLevel().getPlayingField());
        validateGridLocation(view.inputGridLocation());
    }

    private boolean validateGridLocation(String location) {

        int x = location.charAt(0);
        int y = location.charAt(1);
        // TODO validate input
        model.getLevel().getDrawable(x, y).setSelected(true);
        return true;
    }

}
