package bai98.code;

public class AppReleaseMarker {
    public String getVersionStatus(double coverageRatio) {
        if (coverageRatio >= 0.80) {
            return "PRODUCTION_READY";
        }
        return "DEVELOPMENT";
    }
}
