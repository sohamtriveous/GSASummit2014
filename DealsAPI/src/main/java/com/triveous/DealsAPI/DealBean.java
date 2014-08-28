package com.triveous.DealsAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * The object model for the data we are sending through endpoints
 */
public class DealBean {
    // A list of strings, each represents a deal
    private List<String> mDeals;

    /**
     * Add a deal to the dealsbean
     * @param deal
     */
    public void add(String deal) {
        if (mDeals == null) {
            mDeals = new ArrayList();
        }
        mDeals.add(deal);
    }

    /**
     * Return all the deals
     * @return all deals
     */
    public List<String> getData() {
        return mDeals;
    }

    /**
     * Helps print this class when necessary
     * @return the string that represents this class
     */
    @Override
    public String toString() {
        String result = "";
        for (String deal : mDeals) {
            result += deal + " ";
        }
        return result;
    }
}