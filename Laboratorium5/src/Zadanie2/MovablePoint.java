package Zadanie2;

public class MovablePoint  implements Movable{
    int x,y;

    public MovablePoint(){
        x = 4;
        y = 7;
    }

    @Override
    public String toString() {
        return "Punkt znajduje się na współżędnych x: " + x + " oraz y: " + y;
    }

    @Override
    public void moveUp() {
        y = y + 1;
    }

    @Override
    public void moveDown() {
        y = y - 1;
    }

    @Override
    public void moveLeft() {
        x = x - 1;
    }

    @Override
    public void moveRight() {
        x = x + 1;
    }
}
