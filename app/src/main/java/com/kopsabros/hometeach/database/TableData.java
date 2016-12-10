package com.kopsabros.hometeach.database;

import android.provider.BaseColumns;

/**
 * Created by Aghbac on 12/10/16.
 */
public class TableData {
    // no accidental initialization
    public TableData() {
    }

    public static abstract class AppointmentInfo implements BaseColumns {
        // table name
        public static final String TABLE_NAME = "appointment";

        // name of different columns
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_FAMILY_ID = "familyid";
        public static final String COLUMN_NAME_WAS_COMPLETED = "wasCompleted";
        public static final String COLUMN_NAME_APPOINTMENT_DATE = "appointmentDate";
        public static final String COLUMN_NAME_DATE_SET = "dateSet";
        public static final String COLUMN_NAME_DATE_COMPLETED = "dateCompleted";

    }

    public static abstract class FamilyInfo implements BaseColumns {
        // table name
        public static final String TABLE_NAME = "family";

        // name of different columns
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_PHONE = "phone";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_ADDRESS = "address";
    }

    public static abstract class PersonInfo implements BaseColumns {
        // table name
        public static final String TABLE_NAME = "person";

        // name of different columns
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_FAMILY_ID = "familyid";
        public static final String COLUMN_NAME_PHONE_NUMBER = "phone";
        public static final String COLUMN_NAME_EMAIL_ADDRESS = "email";
        public static final String COLUMN_NAME_AGE = "age";
        public static final String COLUMN_NAME_BIRTHDAY = "birthday";
    }
}

