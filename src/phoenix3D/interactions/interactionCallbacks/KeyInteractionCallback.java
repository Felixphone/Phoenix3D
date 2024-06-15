package phoenix3D.interactions.interactionCallbacks;

import phoenix3D.interactions.interactionEvents.keyInteractionEvents.KeyPressEvent;
import phoenix3D.interactions.interactionEvents.keyInteractionEvents.KeyReleaseEvent;

public interface KeyInteractionCallback {

    void onPress(KeyPressEvent pressEvent);
    void onRelease(KeyReleaseEvent releaseEvent);

}
