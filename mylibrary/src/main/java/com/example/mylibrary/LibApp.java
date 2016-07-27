package com.example.mylibrary;

import android.app.Application;

/**
 * Created by kinkoi.lo on 7/26/16.
 */
public class LibApp extends Application implements ILibApp {
    @Override
    public IDatabase createDB() {
        return new IDatabase() {
            @Override
            public String getDBName() {
                return "Lib Database";
            }
        };
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LibAndroid.getInstance().setDatabase(createDB());
    }
}
