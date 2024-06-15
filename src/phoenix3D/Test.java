package phoenix3D;

import phoenix3D.graphics.window.Window;
import phoenix3D.nativeIntergration.nativeObjects.NativeWindow;

public class Test {



    public static void main(String[] args) {
        Window window = new Window(1000, 500, 100, 100, "Test", null, false, null);
        window.open();
    }
}
