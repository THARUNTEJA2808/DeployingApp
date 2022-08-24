package com.microsoft.azure.cosmos.sample.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://myusecase.documents.azure.com:443/";
    private static final String MASTER_KEY = "fYQTOHwii9cP5b1VIWpUUUKB8jmZRNdq2ZGKsJOhFj1Z9Ua9aTqmGcfHONogq0ZnbYdB6Gss2Ep5BmBUaAsI4g==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}