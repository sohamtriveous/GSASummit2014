package com.triveous.DealsAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.triveous.DealsAPI.objects.Collection1;
import com.triveous.DealsAPI.objects.DealsAPI;
import com.triveous.DealsAPI.objects.Results;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "DealsAPI.triveous.com", ownerName = "DealsAPI.triveous.com", packagePath = ""))
public class DealsEndpoint {
    private static final String DEALS_URL = "https://www.kimonolabs.com/api/3hp54bog?apikey=ZdSnJCoFzxb1gjUS3m9wSx97NrSPDbdQ";

    /**
     * A simple endpoint method that returns the names of the deals
     */
    @ApiMethod(name = "getDeals")
    public DealBean getDeals() {
        DealBean response = new DealBean();
        try {
            ObjectMapper mapper = new ObjectMapper();
            DealsAPI dealsAPI = mapper.readValue(new URL(DEALS_URL), DealsAPI.class);

            if (dealsAPI != null) {
                Results results = dealsAPI.getResults();
                if (results != null) {
                    List<Collection1> collection1 = results.getCollection1();
                    if (collection1 != null) {
                        for(Collection1 collection:collection1) {
                            response.add(collection.getTitle());
                        }
                    }
                }
            }
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}