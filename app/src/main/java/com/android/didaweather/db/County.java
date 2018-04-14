package com.android.didaweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MD on 2018/4/14.
 */

public class County extends DataSupport {

    private int id;
//    当前县的名字
    private String countyName;
//    当前县对应的天气的id
    private String weatherId;
//    当前县所属的城市
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
