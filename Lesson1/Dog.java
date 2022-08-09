package Lesson1;

public class Dog extends Members{
    private int swimlimit;

    public Dog(String name) {
        this.name = name;
        this.runlimit = 200;
        swimlimit = 200;

    }

    @Override
    public String voice() {
        return "bark";
    }
    @Override
    public boolean swim(int length) {
        return swimlimit >= length;
    }

}
