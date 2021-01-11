public class Main {
    public static void main(String[] args) {
        Videoplayer videoplayer1 = new Videoplayer();
        Videoplayer videoplayer2 = new Videoplayer();

        videoplayer1.powerOn();
        videoplayer1.play();
        videoplayer1.rewind(50);
    }
}