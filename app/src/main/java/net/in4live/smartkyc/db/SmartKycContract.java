package net.in4live.smartkyc.db;

import android.provider.BaseColumns;

/**
 * Created by Jaymo on 04/07/2016.
 */
public class SmartKycContract {
    public SmartKycContract(){}

    /*Inner class that defines the table contents*/
     /* Inner class that defines the table contents */
    public static abstract class FarmerEntry implements BaseColumns {
        public static final String TABLE_NAME = "Farmer";
        public static final String COLUMN_NAME_ENTRY_ID = "farmerid";
        public static final String COLUMN_NAME_REGISTRATION_ID = "registrationid";
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";
        public static final String COLUMN_NAME_LAST_NAME = "last_name";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_NATIONALITY = "nationality";
        public static final String COLUMN_NAME_MARITAL_STATUS = "marital_status";
        public static final String COLUMN_NAME_FAMILY_SIZE = "family_size";
        public static final String COLUMN_NAME_NATIVE_LANGUAGE = "native_language";
        public static final String COLUMN_NAME_PREFERRED_LANGUAGE = "preferred_Language";
        public static final String COLUMN_NAME_MOBILE_NUMBER = "mobile_number";
    }

    public static abstract class AddressEntry implements BaseColumns{
        public static final String TABLE_NAME = "Address";
        public static final String COLUMN_NAME_ENTRY_ID = "addressid";
        public static final String COLUMN_NAME_MOBILE_NUMBER = "mobile_number";
        public static final String COLUMN_NAME_PREFERRED_MOBILE_NUMBER = "preferred_mobile_number";
        public static final String COLUMN_NAME_BOX_NUMBER = "box_number";
        public static final String COLUMN_NAME_STREET = "street";
        public static final String COLUMN_NAME_BUSINESS_ADDRESS = "business_address";
    }

    public static abstract class FarmEntry implements BaseColumns{
        public static final String TABLE_NAME = "Farm";
        public static final String COLUMN_NAME_ENTRY_ID = "farm_entry_id";
        public static final String COLUMN_NAME_REGISTERED_OWC = "owc_registration_status";
        public static final String COLUMN_NAME_FARM_TYPE = "farm_type";
        public static final String COLUMN_NAME_FARM_CATEGORY = "category";
        public static final String COLUMN_NAME_ACREAGE = "farm_type";
        public static final String COLUMN_NAME_PRODUCE = "farm_produce";
    }

    public static abstract class DistrictEntry implements BaseColumns{
        public static final String TABLE_NAME = "District";
        public static final String COLUMN_NAME_ENTRY_ID = "districtid";
        public static final String COLUMN_NAME_DISTRICT_NAME = "district_name";
        public static final String COLUMN_NAME_REGION = "region";
    }

    public static abstract class County implements BaseColumns {
        public static final String TABLE_NAME = "County";
        public static final String COLUMN_NAME_ENTRY_ID = "countyid";
        public static final String COLUMN_NAME_DISTRICT_ID = "district_id";
        public static final String COLUMN_NAME_COUNTY_NAME = "county_name";
    }

    public static abstract class Subcounty implements BaseColumns {
        public static final String TABLE_NAME = "Subcounty";
        public static final String COLUMN_NAME_ENTRY_ID = "subcountyid";
        public static final String COLUMN_NAME_SUBCOUNTY_NAME = "subcounty_name";
        public static final String COLUMN_NAME_COUNTY_ID = "county_id";
        public static final String COLUMN_NAME_DISTRICT_ID = "district_id";
    }

    public static abstract class Parish implements BaseColumns {
        public static final String TABLE_NAME = "Parish";
        public static final String COLUMN_NAME_ENTRY_ID = "parishid";
        public static final String COLUMN_NAME_PARISH_NAME = "parish_name";
        public static final String COLUMN_NAME_SUBCOUNTY_ID = "subcounty_id";
        public static final String COLUMN_NAME_COUNTY_ID = "county_id";
        public static final String COLUMN_NAME_DISTRICT_ID = "district_id";
    }

    public static abstract class Village implements BaseColumns {
        public static final String TABLE_NAME = "Village";
        public static final String COLUMN_NAME_ENTRY_ID = "villageid";
        public static final String COLUMN_NAME_VILLAGE_NAME = "village_name";
        public static final String COLUMN_NAME_PARISH_ID = "parish_id";
        public static final String COLUMN_NAME_SUBCOUNTY_ID = "subcounty_id";
        public static final String COLUMN_NAME_COUNTY_ID = "county_id";
        public static final String COLUMN_NAME_DISTRICT_ID = "district_id";
        public static final String COLUMN_NAME_LATITUDE = "latitude";
        public static final String COLUMN_NAME_LONGITUDE = "longitude";
    }

}
