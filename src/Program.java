public class Program {
    public static void main(String[] args){
        MusicStyles group = new MusicStyles();
        MusicStyles popBand = new PopMusic();
        MusicStyles rockBand = new RockMusic();
        MusicStyles classicOrchestra = new ClassicMusic();

        MusicStyles[] musicBands = {group, popBand, rockBand, classicOrchestra};
        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}
