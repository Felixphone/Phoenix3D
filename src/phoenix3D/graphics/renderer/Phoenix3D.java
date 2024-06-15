package phoenix3D.graphics.renderer;

public final class Phoenix3D {

    public static RenderingQueue renderingQueue = new RenderingQueue();
    private static ThreadedRenderer threadedRenderer = new ThreadedRenderer(renderingQueue);
    private static Thread renderingThread = new Thread(threadedRenderer);

    public static void start(){
       renderingThread.run();
    }
}
