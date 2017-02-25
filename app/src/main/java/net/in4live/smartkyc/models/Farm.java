package net.in4live.smartkyc.models;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class Farm {
    int id;
    String owcRegistrationStatus;
    String farmType;
    String farmCategory;
    String acreage;
    String produce;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwcRegistrationStatus() {
        return owcRegistrationStatus;
    }

    public void setOwcRegistrationStatus(String owcRegistrationStatus) {
        this.owcRegistrationStatus = owcRegistrationStatus;
    }

    public String getFarmType() {
        return farmType;
    }

    public void setFarmType(String farmType) {
        this.farmType = farmType;
    }

    public String getFarmCategory() {
        return farmCategory;
    }

    public void setFarmCategory(String farmCategory) {
        this.farmCategory = farmCategory;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }
}
