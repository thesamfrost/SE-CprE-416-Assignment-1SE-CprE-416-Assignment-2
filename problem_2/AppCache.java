import java.util.HashMap;
import java.util.Map;

public class AppCache {
    private Map<EnhancementId, ConfigurationData> cache;
    private static AppCache instance;

    // Private constructor prevents instantiation from other classes.
    private AppCache() {
        cache = new HashMap<>();
    }

    // Synchronized getInstance to ensure thread safety.
    public static synchronized AppCache getInstance() {
        if (instance == null) {
            instance = new AppCache();
        }
        return instance;
    }

    // Method to set or update cached data.
    public void set(EnhancementId enhancementId, ConfigurationData configurationData) {
        cache.put(enhancementId, configurationData);
    }

    // Method to retrieve cached data.
    public ConfigurationData get(EnhancementId enhancementId) {
        return cache.get(enhancementId);
    }
}
