public class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        Groups classicGroup = new Groups();
        String name = classicGroup.classicGroupName();
        System.out.println("Play classic music from " + name);
    }
}
