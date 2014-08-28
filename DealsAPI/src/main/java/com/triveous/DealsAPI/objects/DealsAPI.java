
package com.triveous.DealsAPI.objects;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "count",
    "frequency",
    "version",
    "newdata",
    "lastrunstatus",
    "thisversionrun",
    "lastsuccess",
    "nextrun",
    "results"
})
public class DealsAPI {

    @JsonProperty("name")
    private String name;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("newdata")
    private Boolean newdata;
    @JsonProperty("lastrunstatus")
    private String lastrunstatus;
    @JsonProperty("thisversionrun")
    private String thisversionrun;
    @JsonProperty("lastsuccess")
    private String lastsuccess;
    @JsonProperty("nextrun")
    private String nextrun;
    @JsonProperty("results")
    private Results results;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("newdata")
    public Boolean getNewdata() {
        return newdata;
    }

    @JsonProperty("newdata")
    public void setNewdata(Boolean newdata) {
        this.newdata = newdata;
    }

    @JsonProperty("lastrunstatus")
    public String getLastrunstatus() {
        return lastrunstatus;
    }

    @JsonProperty("lastrunstatus")
    public void setLastrunstatus(String lastrunstatus) {
        this.lastrunstatus = lastrunstatus;
    }

    @JsonProperty("thisversionrun")
    public String getThisversionrun() {
        return thisversionrun;
    }

    @JsonProperty("thisversionrun")
    public void setThisversionrun(String thisversionrun) {
        this.thisversionrun = thisversionrun;
    }

    @JsonProperty("lastsuccess")
    public String getLastsuccess() {
        return lastsuccess;
    }

    @JsonProperty("lastsuccess")
    public void setLastsuccess(String lastsuccess) {
        this.lastsuccess = lastsuccess;
    }

    @JsonProperty("nextrun")
    public String getNextrun() {
        return nextrun;
    }

    @JsonProperty("nextrun")
    public void setNextrun(String nextrun) {
        this.nextrun = nextrun;
    }

    @JsonProperty("results")
    public Results getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Results results) {
        this.results = results;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
