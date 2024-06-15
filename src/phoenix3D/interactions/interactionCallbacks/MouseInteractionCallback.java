package phoenix3D.interactions.interactionCallbacks;

import phoenix3D.interactions.interactionEvents.mouseInteractionEvents.MouseClickEvent;
import phoenix3D.interactions.interactionEvents.mouseInteractionEvents.MouseMoveEvent;
import phoenix3D.interactions.interactionEvents.mouseInteractionEvents.MouseScrollEvent;

public interface MouseInteractionCallback {

    void onMove(MouseMoveEvent moveEvent);
    void onClick(MouseClickEvent clickEvent);
    void onScroll(MouseScrollEvent scrollEvent);

}
