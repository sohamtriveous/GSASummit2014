
package com.triveous.DealsAPI.objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.triveous.DealsAPI.objects.Results;

@Generated("org.jsonschema2pojo")
public class Deals {

    @Expose
    private String name;
    @Expose
    private Integer count;
    @Expose
    private String frequency;
    @Expose
    private Integer version;
    @Expose
    private Boolean newdata;
    @Expose
    private String lastrunstatus;
    @Expose
    private String thisversionrun;
    @Expose
    private String lastsuccess;
    @Expose
    private String nextrun;
    @Expose
    private Results results;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getNewdata() {
        return newdata;
    }

    public void setNewdata(Boolean newdata) {
        this.newdata = newdata;
    }

    public String getLastrunstatus() {
        return lastrunstatus;
    }

    public void setLastrunstatus(String lastrunstatus) {
        this.lastrunstatus = lastrunstatus;
    }

    public String getThisversionrun() {
        return thisversionrun;
    }

    public void setThisversionrun(String thisversionrun) {
        this.thisversionrun = thisversionrun;
    }

    public String getLastsuccess() {
        return lastsuccess;
    }

    public void setLastsuccess(String lastsuccess) {
        this.lastsuccess = lastsuccess;
    }

    public String getNextrun() {
        return nextrun;
    }

    public void setNextrun(String nextrun) {
        this.nextrun = nextrun;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

}
