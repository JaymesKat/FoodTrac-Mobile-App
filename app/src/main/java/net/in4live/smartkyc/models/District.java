package net.in4live.smartkyc.models;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class District extends SugarRecord {
    long id;
    String name;
    String region;

    public District(){}

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Get all counties of this district
    List<County> getCounties() {
        return County.find(County.class, "district = ?", this.getId().toString());
    }
}
