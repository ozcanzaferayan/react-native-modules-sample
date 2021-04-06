package com.zaferayan.nativemodules.mycustompackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.zaferayan.nativemodules.ui.NativeActivity;

public class MyCustomModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext context;

    MyCustomModule  (ReactApplicationContext context) {
        super(context);
        this.context = context;
    }

    @NonNull
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
        // Or
        // return "MyCustomModule";
    }

    @ReactMethod
    public void openNativeScreen(String message) {
        Intent intent = new Intent(context, NativeActivity.class);
        intent.putExtra(NativeActivity.MESSAGE, message);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }


}