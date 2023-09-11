public class PopMusic extends MusicStyles  {
    @Override
    public void playMusic() {
        Groups popGroup = new Groups();
        String name = popGroup.popGroupName();
        System.out.println("Play pop-music from " + name);
    }
}
