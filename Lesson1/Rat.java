package Lesson1;

public class Rat extends Team {
    private int swimlimit;

    public Rat(String name) {
        this.name = name;
        this.runlimit = 100;
        swimlimit = 80 ;

    }

    @Override
    public String voice() {
        return "Pi-pi-pi";
    }
    @Override
    public boolean swim(int length) {
        return swimlimit >= length;
    }

}
