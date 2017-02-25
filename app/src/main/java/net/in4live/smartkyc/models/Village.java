package net.in4live.smartkyc.models;

import com.orm.SugarRecord;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class Village extends SugarRecord {
    long id;
    String name;
    long parishId;
    long latitude;
    long longitude;

    public Village(){}

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

    public long getParishId() {
        return parishId;
    }

    public void setParishId(long parishId) {
        this.parishId = parishId;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

}
