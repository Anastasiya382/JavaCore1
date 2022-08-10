package Lesson1;

public abstract class Team{
    public String name;

    public int runlimit;

    public abstract String voice();

    public boolean run(int length) {
        return runlimit >= length;
    }

    public String toString() {
        return this.getClass().getName() + " " + name;
    }

    public abstract boolean swim(int length);
}
