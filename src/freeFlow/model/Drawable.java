package freeFlow.model;

public abstract class Drawable {

    int x, y;
    boolean isSelected;

    public abstract void draw();
    public abstract String drawConsole();

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public boolean getSelected() {
        return isSelected;
    }

}
