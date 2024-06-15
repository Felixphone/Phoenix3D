package phoenix3D.graphics.renderer;

public class ThreadedRenderer implements Runnable {

    private boolean running = true;
    private RenderingQueue renderingQueue;
    protected ThreadedRenderer(RenderingQueue renderingQueue) {
        this.renderingQueue = renderingQueue;
    }

    @Override
    public void run() {
        Renderable renderable;
        while (running) {
            renderable = renderingQueue.pop();
            render(renderable);
        }
    }

    private static void render(Renderable renderable) {

    }
}
