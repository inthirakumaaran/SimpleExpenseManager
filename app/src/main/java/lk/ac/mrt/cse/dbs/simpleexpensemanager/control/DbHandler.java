package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kumaar on 11/20/2016.
 */

public class DbHandler extends SQLiteOpenHelper {
    Context context;

    public DbHandler(Context context) {
        super(context, "140235L_DB", null, 1);
        context = context;
//        SQLiteDatabase db = this.getWritableDatabase(context);
  }


    public void opendb(SQLiteDatabase db){
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE ACCOUNT ( ACNO TEXT PRIMARY KEY , BANKNAME TEXT,ACHNAME TEXT,AMOUNT DOUBLE)");
        sqLiteDatabase.execSQL("CREATE TABLE TRANSACTION (ID INTEGER PRIMARY KEY, ACNO TEXT , DATE TEXT,EXPENSETYPE TEXT,AMOUNT DOUBLE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
