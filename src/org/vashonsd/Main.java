package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {
        System.out.println("From playlist to stage:");

        Performer artist1 = new Performer("Pink Floyd", "Rock");
        artist1.addHit("Wish you were here");
        artist1.addHit("Money");
        artist1.addHit("Comfortably Numb");
        System.out.println(artist1);

        Performer artist2 = new Performer("Smashing Pumpkins", "Alt Rock");
        artist2.addHit("1979");
        artist2.addHit("Today");
        artist2.addHit("Rhinoceros");
        System.out.println(artist2);
    }
}
