package Lesson1;

public class Cat extends Team {
    private int swimlimit;


    public Cat(String name) {
        this.name = name;
        this.runlimit = 100;
        swimlimit = 20;

    }

    @Override
    public String voice() {
        return "meow";
    }

    @Override
    public boolean swim(int length) {
        return swimlimit >= length;
    }

}
