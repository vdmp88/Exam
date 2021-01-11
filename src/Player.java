public abstract class Player implements Technics {
    abstract public void play();
    abstract public void pause();

    @Override
    public void powerOff() {
        System.out.printf("power off \n");
    }

    @Override
    public void powerOn() {
        System.out.printf("power on \n");
    }
}
