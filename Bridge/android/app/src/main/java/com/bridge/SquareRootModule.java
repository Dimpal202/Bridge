package com.bridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class SquareRootModule extends ReactContextBaseJavaModule {

    public SquareRootModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "SquareRoot";
    }

    @ReactMethod
    public void calculate(double number, Promise promise) {
        try {
            double result = Math.sqrt(number);
            promise.resolve(result);
        } catch (Exception e) {
            promise.reject("ERROR", e.getMessage());
        }
    }
}