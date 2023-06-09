package Zadanie2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint A = new MovablePoint();
        System.out.println(A.toString());
        A.moveUp();
        A.moveRight();
        System.out.println(A.toString());
        A.moveDown();
        A.moveDown();
        A.moveLeft();
        System.out.println(A.toString());
    }
}
