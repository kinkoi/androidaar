package com.example.mylibrary;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by kinkoi.lo on 7/27/16.
 */
public class LibBackGroundService extends Service {

    private static final String TAG = LibBackGroundService.class.getSimpleName();

    public LibBackGroundService() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "LibBackGroundService created");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
