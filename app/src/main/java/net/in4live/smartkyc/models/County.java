package net.in4live.smartkyc.models;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class County extends SugarRecord{
    long id;
    String name;
    District district;

    public County(){}

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

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
    // Get all subcounties of this county
    List<Subcounty> getAllSubcounties() {
        return Subcounty.find(Subcounty.class, "county = ?", this.getId().toString());
    }
}
