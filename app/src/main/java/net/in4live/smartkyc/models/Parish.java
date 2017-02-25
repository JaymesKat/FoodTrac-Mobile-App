package net.in4live.smartkyc.models;

import com.orm.SugarRecord;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class Parish extends SugarRecord {
    int id;
    String name;
    long subcountyId;

    public Parish(){}
}
