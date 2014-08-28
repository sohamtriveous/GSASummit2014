package com.triveous.DealsAPI;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.gson.Gson;
import com.triveous.DealsAPI.objects.Collection1;
import com.triveous.DealsAPI.objects.Deals;
import com.triveous.DealsAPI.objects.Results;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * An endpoint class we are exposing
 */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "DealsAPI.triveous.com", ownerName = "DealsAPI.triveous.com", packagePath = ""))
public class DealsEndpoint {
    // the 3rd party endpoint which represents the deal information
    private static final String DEALS_URL = "https://www.kimonolabs.com/api/3hp54bog?apikey=ZdSnJCoFzxb1gjUS3m9wSx97NrSPDbdQ";

    /**
     * An endpoint that gets deals from the DEALS_URL endpoint and then returns a simplified version of it in a DealBean format
     * The DealBean is then consumed from the client
     */
    @ApiMethod(name = "getDeals")
    public DealBean getDeals() {
        DealBean response = new DealBean();
        try {
            // access the external deals api from DEALS_URL
            // typically this data would be stored in your database (you find out deals and store them here) or gathered from an external source (this case)
            URL objectGet = new URL(DEALS_URL);
            URLConnection yc = objectGet.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            // parse the external deals endpoint, this is a fairly complex object which represents the data received from the external end point
            Deals deals = new Gson().fromJson(in, Deals.class);

            // if we have received some deals, then create a DealBean object which will ultimately consumed by the client
            // in this example, we take some data from the complex 'Deals' object and store it in a simpler 'Response' object which is then sent to the client
            // real world beans/objects will be far more complex, take the Deals object for example (the one that we received from the external endpoint)
            if (deals != null) {
                Results results = deals.getResults();
                if (results != null) {
                    List<Collection1> collection1 = results.getCollection1();
                    if (collection1 != null) {
                        for(Collection1 collection:collection1) {
                            response.add(collection.getTitle());
                            System.out.print(collection.getTitle());
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