package net.in4live.smartkyc.models;

import com.orm.SugarRecord;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class Farmer extends SugarRecord {
    long id;
    String firstName;
    String lastName;
    String nationality;
    String date;
    String gender;
    String maritalStatus;
    String nativeLanguage;
    String preferrredLanguage;
    String created_at;

    public Farmer(){}

    @Override
    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getPreferrredLanguage() {
        return preferrredLanguage;
    }

    public void setPreferrredLanguage(String preferrredLanguage) {
        this.preferrredLanguage = preferrredLanguage;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
