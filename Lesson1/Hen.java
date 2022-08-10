package Lesson1;

public class Hen extends Team {
    private int swimlimit;

    public Hen(String name) {
        this.name = name;
        this.runlimit = 150;
        swimlimit = 0;

    }

    @Override
    public String voice() {
        return "kukareku";
    }
    @Override
    public boolean swim(int length) {
        return swimlimit >= length;
    }

}
