package com.example.kkavalireddy.introsliderexample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kkavalireddy on 12/11/2017.
 */

public class PrefManager {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context _context;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "My Preferences";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context _context) {
        this._context = _context;
         preferences = _context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
         editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime)
    {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch()
    {
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
