package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.exception.ExpenseManagerException;

/**
 * Created by kumaar on 11/20/2016.
 */

public class PersistentExpenseManger extends ExpenseManager {
    Context context;
    DbHandler  dbHandler ;

    public PersistentExpenseManger(Context context){
        this.context = context;


    }
    @Override
    public void setup() throws ExpenseManagerException {
        dbHandler = new DbHandler(context);
    }
}
