package com.example.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibAboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_about_me);
        TextView dbName = (TextView)findViewById(R.id.text_db_name);
        dbName.setText(LibAndroid.getInstance().getDatabase().getDBName());
    }
}
