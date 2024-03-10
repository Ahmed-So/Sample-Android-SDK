package com.example.sample_sdk;

import android.content.Context;
import android.widget.Toast;

public class SDK {

    public static void start(Context context){
        Toast.makeText(context, BuildConfig.MESSAGE, Toast.LENGTH_SHORT).show();
    }
}
