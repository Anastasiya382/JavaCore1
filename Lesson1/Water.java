package Lesson1;
//
public class Water {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    public boolean doIt(Team animal) {
        if (animal instanceof Swim)
            return ((Swim) animal).swim(length);
        else
            return false;
    }
}
