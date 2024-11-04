public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("The car engine is started.");
    }

    @Override
    public void stop() {
        System.out.println("The car engine is stopped.");
    }
}
