package Lesson1;
//
public class Main {
    public static void main(String[] args) {
        Members[] homeAnimals = {new Cat("Murzik"), new Dog("Bobik")};
        Track track = new Track(80);
        Water water = new Water(10);

        for (Members animal : homeAnimals) {
            System.out.println(animal + " say: " + animal.voice());
            System.out.println(" run: " + track.doIt(animal));
            System.out.println(" swim: " + water.doIt(animal));
        }
    }
}
