package phoenix3D.graphics.window;

import phoenix3D.interactions.interactionCallbacks.WindowInteractionCallback;
import phoenix3D.nativeIntergration.nativeObjects.NativeWindow;
import phoenix3D.graphics.window.objects.Monitor;
import phoenix3D.graphics.window.objects.WindowIcon;

import java.util.HashSet;
import java.util.Set;

public class Window {

    private int width;
    private int height;
    private int x;
    private int y;
    private String title;
    private WindowIcon icon;
    private boolean fullscreen;
    private Monitor monitor;

    private long nativeWindowPointer;
    private NativeWindow nativeWindow = new NativeWindow();

    public void test() {
        nativeWindow.hideWindow(nativeWindowPointer);
    }

    public void test2() {
        nativeWindow.showWindow(nativeWindowPointer);
    }

    public void test3() {
        nativeWindow.disableWindow(nativeWindowPointer);
    }

    public void test4() {
        nativeWindow.enableWindow(nativeWindowPointer);
    }

    private Set<WindowInteractionCallback> callbacks = new HashSet<>();

    public Window(int width, int height, int x, int y, String title, WindowIcon icon, boolean fullscreen, Monitor monitor) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.title = title;
        this.icon = icon;
        this.fullscreen = fullscreen;
        this.monitor = monitor;

        //TODO: make org.Phoenix3D.window appear
    }

    public void open() {

        class OpenableWindow implements Runnable {
            @Override
            public void run() {
                if(!nativeWindow.nativeLinkAssertion()) {
                    return;
                }
                nativeWindowPointer = nativeWindow.createWindow(width, height, x, y, title);
                nativeWindow.openWindow(nativeWindowPointer);
            }
        }

        Thread windowSustainingThread = new Thread(new OpenableWindow());
        windowSustainingThread.start();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WindowIcon getIcon() {
        return icon;
    }

    public void setIcon(WindowIcon icon) {
        this.icon = icon;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void registerCallback(WindowInteractionCallback callback) {
        if(callbacks.contains(callback)) {return;}
        callbacks.add(callback);
    }

    public void freeCallback(WindowInteractionCallback callback) {
        if(!callbacks.contains(callback)) {return;}
        callbacks.remove(callback);
    }

    public void freeAllCallbacks() {
        callbacks.clear();
    }
}
