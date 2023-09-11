import java.util.Random;

public class Groups {

    public String groupName() {
        Random random = new Random();
        String[] musicGroups = {"ABBA", "AC/DC", "Aerosmith", "The Animals",
                "The Band", "The Beach Boys", "The Beatles", "Big Star", "Chicago", "Daft Punk",
                "The Clash", "Cream", "Led Zeppelin", "XS Project", "Boney M", "Ace of Base", "Twisted Sister",
                "Aqua", "Backstreet Boys", "Sade", "Corona", "Vengaboys", "Mo-Do", "C. C. Catch", "A-ha", "Morandi",
                "Tom Cardy", "Guns&Roses", "Rick Astley", "Lipps Inc", "KISS", "David Bowie", "Deep Purple",
                "The Rolling Stones", "Radiohead", "Oasis", "Johann Sebastian Bach", "Frédéric Chopin",
                "Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Erik Satie", "Johannes Brahms", "Robert Schumann"};
        String name = musicGroups[random.nextInt(musicGroups.length)];
        return name;
    }
    public String rockGroupName() {
        Random random = new Random();
        String[] musicGroups = {"Guns&Roses", "KISS", "Led Zeppelin", "Deep Purple", "The Rolling Stones",
                                "Radiohead", "Oasis", "AC/DC", "Aerosmith", "Twisted Sister", "The Clash"};
        String name = musicGroups[random.nextInt(musicGroups.length)];
        return name;
    }
    public String classicGroupName() {
        Random random = new Random();
        String[] musicGroups = {"Johann Sebastian Bach", "Frédéric Chopin", "Wolfgang Amadeus Mozart", "Ludwig van Beethoven",
                                "Franz Schubert", "Erik Satie", "Johannes Brahms", "Robert Schumann"};
        String name = musicGroups[random.nextInt(musicGroups.length)];
        return name;
    }
    public String popGroupName() {
        Random random = new Random();
        String[] musicGroups = {"ABBA", "The Band", "The Beach Boys", "The Beatles", "Rick Astley", "Lipps Inc", "Boney M",
                                "Ace of Base", "Aqua", "Backstreet Boys", "Sade", "Corona", "Vengaboys", "Mo-Do", "C. C. Catch",
                                "A-ha", "Morandi"};
        String name = musicGroups[random.nextInt(musicGroups.length)];
        return name;
    }
}
