package com.triveous.DealsAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * The object model for the data we are sending through endpoints
 */
public class DealBean {

    private List<String> mDeals;

    public void add(String deal) {
        if (mDeals == null) {
            mDeals = new ArrayList();
        }
        mDeals.add(deal);
    }

    public List<String> getData() {
        return mDeals;
    }

    public void setData(List deals) {
        mDeals = deals;
    }

    @Override
    public String toString() {
        String result = "";
        for (String deal : mDeals) {
            result += deal + " ";
        }
        return result;
    }
}