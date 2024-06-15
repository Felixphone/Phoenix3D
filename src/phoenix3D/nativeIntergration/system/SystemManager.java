package phoenix3D.nativeIntergration.system;

import phoenix3D.nativeIntergration.system.dataItems.enums.SystemType;

public class SystemManager {

    private static final SystemType SYSTEM_TYPE;

    static {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Windows")) {
            SYSTEM_TYPE = SystemType.WINDOWS;
        } else if (osName.startsWith("Linux") || osName.startsWith("FreeBSD") || osName.startsWith("SunOS") || osName.startsWith("Unix")) {
            SYSTEM_TYPE = SystemType.LINUX;
        } else if (osName.startsWith("Mac OS X") || osName.startsWith("Darwin")) {
            SYSTEM_TYPE = SystemType.MACOS;
        } else {
            throw new LinkageError("Unknown platform: " + osName);
        }
    }
}
