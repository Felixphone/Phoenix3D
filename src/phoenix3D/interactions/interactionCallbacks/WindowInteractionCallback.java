package phoenix3D.interactions.interactionCallbacks;

import phoenix3D.interactions.interactionEvents.windowInteractionEvents.*;

public interface WindowInteractionCallback {

    void onMove(WindowMoveEvent moveEvent);
    void onResize(WindowResizeEvent resizeEvent);
    void onFocus(WindowFocusEvent focusEvent);
    void onUnfocus(WindowUnfocusEvent unfocusEvent);
    void onMinimise(WindowMinimiseRequestEvent minimiseEvent);
    void onFullscreen(WindowFullscreenRequestEvent fullscreenEvent);
    void onUnfullscreen(WindowUnfullscreenRequestEvent unfullscreenEvent);
    void onClose(WindowCloseRequestEvent closeEvent);

}
