package freeflow.model;

/**
 * @author Arjan Tammer
 * @version 1.0 2/8/2018 21:25
 */
public class PlayingField {

    private int sizeX, sizeY;
    private Space [][] spaces;

    PlayingField(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        spaces = null;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

}
