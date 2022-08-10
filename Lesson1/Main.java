package Lesson1;

public class Main {
    public static void main(String[] args) {
        Team[] homeAnimals = {new Cat("Murzik"), new Dog("Bobik"), new Hen("Nesushka"), new Rat("Rat")};
        Track track = new Track(100 );
        Water water = new Water(50);

        for (Team animal : homeAnimals) {
            System.out.println(animal + " say: " + animal.voice());
            System.out.println(" run: " + track.doIt(animal));
            System.out.println(" swim: " + water.doIt(animal));
        }
    }
}
