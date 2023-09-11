public class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        Groups rockGroup = new Groups();
        String name = rockGroup.rockGroupName();
        System.out.println("Play rock-music from " + name);
    }
}
