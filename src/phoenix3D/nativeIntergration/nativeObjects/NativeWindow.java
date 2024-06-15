package phoenix3D.nativeIntergration.nativeObjects;

public class NativeWindow {
    static {
        System.loadLibrary("Phoenix3D_NativeWindowLib");
    }

    public native boolean nativeLinkAssertion();

    /**
     * Creates a new window using native c++ libraries. This does not open the window, it merely creates and returns a handle pointer which can be used to reference the instantiated window through other functions.
     * @param width the initial width of the window
     * @param height the initial height of the window
     * @param x the initial x position (pixel count) of the upper left-hand corner of window
     * @param y the initial y position (pixel count) of the upper left-hand corner of window
     * @param title the initial text to be displayed as the window's title
     * @return HWND window handle (long). This is used to reference the instantiated window through other functions.
     */
    public native long createWindow(int width, int height, int x, int y, String title); //TODO: make null values for width, height, x, and y use CW_USEDEFAULT

    /**
     * Opens and displays the window
     * @param window the window to be opened (handle pointer)
     */
    public native void openWindow(long window);

    /**
     * Closes and terminates a window.
     * @param window the window to be closed (handle pointer)
     * @implNote After the window is closed, the handle pointer should be voided as it will no longer point to a valid address. Using this address after closure may result in unwanted results.
     */
    public native void closeWindow(long window);

    /**
     * Sets the window's width, height, and x and y coordinates.
     * @param window the window to be transformed (handle pointer)
     * @param width the new width of the window
     * @param height the new height of the window
     * @param x the new x position (pixel count) of the upper left-hand corner of window
     * @param y the new y position (pixel count) of the upper left-hand corner of window
     * @param repaint Indicates whether the window is to be repainted. <br>If this parameter is <b>TRUE</b>, the window receives a message. If the parameter is <b>FALSE</b>, no repainting of any kind occurs. <br>This applies to the client area, the nonclient area (including the title bar and scroll bars), and any part of the parent window uncovered as a result of moving a child window.
     */
    public native void transformWindow(long window, int width, int height, int x, int y, boolean repaint);

    /**
     * Changes the text of the specified window's title bar (if it has one). <br>
     * @param window the window of which, who's title should be changed (handle pointer)
     * @param title the text the title should be set to
     */
    public native void setWindowTitle(long window, String title);

    public native int getWindowWidth(long window); //getClientRect

    public native int getWindowHeight(long window);

    public native int getWindowX(long window);

    public native int getWindowY(long window);

    public native void bringWindowToTop(long window);


    public native void minimiseWindow(long window);//closeWindow & openIcon & setWindowPlacement

    public native boolean isWindowMinimised(long window); //IsIconic

    public native void maximiseWindow(long window);

    public native boolean isWindowMaximised(long window); //IsZoomed

    public native void restoreWindow(long window);


    public native void showWindow(long window);

    public native void hideWindow(long window);

    public native boolean isWindowVisible(long window);

    public native void showOwnedPopups(long window);

    public native void hideOwnedPopups(long window);


    public native void setActiveWindow(long window);

    public native long getActiveWindow();

    public native void enableWindow(long window);

    public native void disableWindow(long window);

    public native boolean isWindowEnabled(long window);
}