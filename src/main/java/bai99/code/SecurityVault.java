package bai99.code;

public class SecurityVault {
    public String getSecretKey() {
        String apiKey = System.getenv("DATABASE_SECRET_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            return "DEFAULT_LOCAL_KEY";
        }
        return apiKey;
    }
}