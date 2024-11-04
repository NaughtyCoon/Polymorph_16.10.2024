public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("The bicycle starts to ride.");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle stopped riding.");
    }
}
