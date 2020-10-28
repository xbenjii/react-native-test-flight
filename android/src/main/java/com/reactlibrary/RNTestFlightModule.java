package com.reactlibrary;

import java.util.Map;
import java.util.HashMap;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.annotations.ReactProp;

import android.widget.Toast;

public class RNTestFlightModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNTestFlightModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  public boolean isTestFlight = false;

  @ReactProp(name = "isTestFlight")
  public void setIsTestFlight(Boolean isTestFlight) {
    this.isTestFlight = isTestFlight;
  }

  @Override
  public String getName() {
    return "RNTestFlight";
  }

  @Override
    public Map<String, Object> getConstants() {
      final Map<String, Object> constants = new HashMap<>();
      return constants;
    }
}
