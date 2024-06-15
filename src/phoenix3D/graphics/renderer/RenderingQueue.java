package phoenix3D.graphics.renderer;

import java.util.PriorityQueue;

public class RenderingQueue {

    private PriorityQueue<Renderable> renderingQueue = new PriorityQueue<Renderable>();

    public void push(Renderable renderable) {
        renderingQueue.add(renderable);
    }

    public Renderable pop() {
        return renderingQueue.poll();
    }

    public Renderable peek() {
        return renderingQueue.peek();
    }

    public boolean contains(Renderable renderable) {
        return renderingQueue.contains(renderable);
    }

}
