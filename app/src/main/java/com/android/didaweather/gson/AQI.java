package com.android.didaweather.gson;

/**
 * Created by MD on 2018/4/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
