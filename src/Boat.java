public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("The boat has raised the anchors!");
    }

    @Override
    public void stop() {
        System.out.println("The boat has dropped the anchors!");
    }
}
