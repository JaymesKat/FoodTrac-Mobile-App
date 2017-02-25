package net.in4live.smartkyc.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "smartKYC";

    // Table Names
    private static final String TABLE_FARMER = "farmer";
    private static final String TABLE_FARM = "farm";
    private static final String TABLE_FARMER_ADDRESS = "farmer_address";
    private static final String TABLE_DISTRICT= "district";
    private static final String TABLE_COUNTY = "county";
    private static final String TABLE_SUBCOUNTY = "subcounty";
    private static final String TABLE_PARISH = "parish";
    private static final String TABLE_VILLAGE = "village";

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    // Farmer Table - column names
    private static final String KEY_FNAME = "first_name";
    private static final String KEY_LNAME = "last_name";
    private static final  String KEY_NATIONALITY = "nationality";
    private static final String KEY_DATE = "date";
    private static final String KEY_GENDER = "gender";
    private static final String KEY_MSTATUS = "marital_status";
    private static final String KEY_N_LANGUAGE = "native_language";
    private static final String KEY_P_LANGUAGE = "preferred_language";

    // FarmerAddress Table - column names
    private static final String KEY_TAG_NAME = "tag_name";

    // NOTE_TAGS Table - column names
    private static final String KEY_TODO_ID = "todo_id";
    private static final String KEY_TAG_ID = "tag_id";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
