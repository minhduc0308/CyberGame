package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Management.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_GAMING_STATION = "GamingStation";

    // Các cột của bảng GamingStation
    public static final String COLUMN_STATION_ID = "stationId";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_STATUS = "status";
    public static final String COLUMN_LOCATION = "location";
    public static final String COLUMN_HOURLY_RATE = "hourlyRate";
    public static final String COLUMN_LAST_MAINTENANCE = "lastMaintenance";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Tạo bảng nếu cần (chỉ ví dụ)
        String createGamingStationTable = "CREATE TABLE " + TABLE_GAMING_STATION + " (" +
                COLUMN_STATION_ID + " TEXT PRIMARY KEY, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_STATUS + " TEXT, " +
                COLUMN_LOCATION + " TEXT, " +
                COLUMN_HOURLY_RATE + " REAL, " +
                COLUMN_LAST_MAINTENANCE + " TEXT" +
                ")";
        db.execSQL(createGamingStationTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Xử lý nâng cấp database nếu cần
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GAMING_STATION);
        onCreate(db);
    }
}
