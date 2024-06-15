package phoenix3D.nativeIntergration.nativeObjects;

public class NativeWindowManager {
    static {
        System.loadLibrary("Phoenix3D_NativeWindowLib");
    }

    public native boolean nativeLinkAssertion();
    public native long createWindow(int width, int height, int x, int y, String title);

    public native void open(long window);
    public native void close(long window);

    public native void setWidth(long window, int width);
    public native void setHeight(long window, int height);
    public native void setX(long window, int x);
    public native void setY(long window, int y);
    public native void setTitle(long window, String title);

    public native void setVisible(long window, boolean visible);
    //public native void show(long window);
    //public native void hide(long window);

    /**
     * Hides the window and activates another window. <br>
     * @param window the window to be hidden (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>WS_HIDE</b> <br>
     *     Flag value: <b>0</b>
     */
    public native void hide(long window);

    /**
     * Activates and displays a window. If the window is minimized, maximized, or arranged, the system restores it to its original size and position. An application should specify this flag when displaying the window for the first time. <br>
     * @param window the window to be shown (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWNORMAL / SW_NORMAL</b> <br>
     *     Flag value: <b>1</b>
     */
    public native void showAtOriginal(long window);

    /**
     * Minimizes the specified window and activates the next top-level window in the Z order. <br>
     * @param window the window to be shown (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_MINIMIZE</b> <br>
     *     Flag value: <b>6</b>
     */
    public native void minimise(long window);

    /**
     * Activates the window and displays it as a minimized window. Similar to {@link #minimise(long)}, except the window remains activated <br>
     * @param window the window to be minimised (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWMINIMIZED</b> <br>
     *     Flag value: <b>2</b>
     */
    public native void activeMinimise(long window);

    /**
     * Displays the window as a minimized window. This functions similar to {@link #minimise(long)} <br>
     * @param window the window to be minimised (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWMINNOACTIVE</b> <br>
     *     Flag value: <b>7</b>
     */
    public native void showInactiveMinimised(long window);

    /**
     * Activates the window and displays it as a maximized window. <br>
     * @param window the window to be maximised (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWMAXIMIZED / SW_MAXIMIZE</b> <br>
     *     Flag value: <b>3</b>
     */
    public native void showMaximise(long window);

    /**
     * Displays a window in its most recent size and position. This is similar to {@link #showAtOriginal(long)}, except that the window is not activated. <br>
     * @param window the window to be displayed (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWNOACTIVATE</b> <br>
     *     Flag value: <b>4</b>
     */
    public native void showRecentNoActivate(long window);

    /**
     * Activates the window and displays it in its current size and position. <br>
     * @param window the window to be displayed (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOW</b> <br>
     *     Flag value: <b>5</b>
     */
    public native void show(long window);

    /**
     * Displays the window in its current size and position. This value is similar to {@link #show(long)}, except that the window is not activated. <br>
     * @param window the window to be shown (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWNA</b> <br>
     *     Flag value: <b>8</b>
     */
    public native void showInactive(long window);

    /**
     * Activates and displays the window. If the window is minimized, maximized, or arranged, the system restores it to its original size and position. An application should specify this flag when restoring a minimized window. <br>
     * @param window the window to be restored (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_RESTORE</b> <br>
     *     Flag value: <b>9</b>
     */
    public native void restore(long window);

    /**
     * Sets the show state based on the SW_ value specified in the STARTUPINFO structure passed to the CreateProcess function (in windows) by the program that started the application. <br>
     * @param window the window to be shown (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_SHOWDEFAULT</b> <br>
     *     Flag value: <b>10</b>
     */
    public native void showDefault(long window);

    /**
     * Minimizes a window, even if the thread that owns the window is not responding. This should only be used when minimizing windows from a different thread. <br>
     * @param window the window to be minimised (handle pointer)
     *
     * @implNote <br>
     *     Flag name: <b>SW_FORCEMINIMIZE</b> <br>
     *     Flag value: <b>11</b>
     */
    public native void forceMinimise(long window);
}
