// Create an enhancement ID and configuration data.
EnhancementId enhId = new EnhancementId("feature1");
ConfigurationData configData = new ConfigurationData("configuration details");

// Retrieve the global AppCache instance.
AppCache cache = AppCache.getInstance();

// Add or update data in the cache.
cache.set(enhId, configData);

// Retrieve and use cached data.
ConfigurationData retrievedData = cache.get(enhId);
System.out.println("Retrieved configuration: " + retrievedData);
