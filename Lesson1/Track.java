package Lesson1;

public class Track {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean doIt(Team animal) {
        return animal.run(length);
    }
}
