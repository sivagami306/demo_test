package com.n47.multitenancydemo.config.multitenancy;

public class TenantStorage {

    private static ThreadLocal<String> currentTenant = new ThreadLocal<>();

    public static void setCurrentTenant(String tenantId) {
        currentTenant.set(tenantId);
    }

    public static String getCurrentTenant() {
        return currentTenant.get();
    }

    public static void clear() {
        currentTenant.remove();
    }
}
