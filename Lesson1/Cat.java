package Lesson1;
//
public class Cat extends Members {
    private int swimlimit;


    public Cat(String name) {
        this.name = name;
        this.runlimit = 100;
        swimlimit = 100;

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
