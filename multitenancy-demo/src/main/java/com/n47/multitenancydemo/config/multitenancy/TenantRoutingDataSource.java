package com.n47.multitenancydemo.config.multitenancy;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class TenantRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return TenantStorage.getCurrentTenant();
    }

}