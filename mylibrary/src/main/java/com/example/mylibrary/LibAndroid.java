package com.example.mylibrary;

/**
 * Created by kinkoi.lo on 7/26/16.
 */
public class LibAndroid {

    private static LibAndroid mInstance;

    private IDatabase mDatabase;

    private LibAndroid() {
    }

    public static synchronized LibAndroid getInstance() {
        if(mInstance == null) {
            mInstance = new LibAndroid();
        }
        return mInstance;
    }

    public IDatabase getDatabase() {
        return mDatabase;
    }

    public void setDatabase(IDatabase database) {
        this.mDatabase = database;
    }
}
