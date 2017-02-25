package net.in4live.smartkyc.models;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class Subcounty extends SugarRecord {
    long id;
    String name;
    long countyId;

    public Subcounty(){}

    @Override
    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountyId() {
        return countyId;
    }

    public void setCountyId(long countyId) {
        this.countyId = countyId;
    }
    // Get all parishes of this subcounty
    List<Parish> getAllParishes() {
        return Parish.find(Parish.class, "subcounty = ?", this.getId().toString());
    }
}
