package Lesson1;
//
public class Track {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean doIt(Members animal) {
        return animal.run(length);
    }
}
