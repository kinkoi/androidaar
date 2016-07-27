package com.example.kinkoilo.aardemo;

import com.example.mylibrary.IDatabase;
import com.example.mylibrary.LibApp;

/**
 * Created by kinkoi.lo on 7/26/16.
 */
public class MyApp extends LibApp {
    @Override
    public IDatabase createDB() {
        return new IDatabase() {
            @Override
            public String getDBName() {
                return "My App DB";
            }
        };
    }
}
