
package com.triveous.DealsAPI.objects;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.triveous.DealsAPI.objects.Collection1;

@Generated("org.jsonschema2pojo")
public class Results {

    @Expose
    private List<Collection1> collection1 = new ArrayList<Collection1>();

    public List<Collection1> getCollection1() {
        return collection1;
    }

    public void setCollection1(List<Collection1> collection1) {
        this.collection1 = collection1;
    }

}
