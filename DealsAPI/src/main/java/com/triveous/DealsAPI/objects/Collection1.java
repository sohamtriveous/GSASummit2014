
package com.triveous.DealsAPI.objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.triveous.DealsAPI.objects.Category;

@Generated("org.jsonschema2pojo")
public class Collection1 {

    @Expose
    private String title;
    @Expose
    private Category category;
    @Expose
    private String code;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
