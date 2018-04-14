package com.android.didaweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MD on 2018/4/14.
 */

public class City extends DataSupport {

    private int id;
//    当前城市名字
    private String cityName;
//    当前城市代号
    private int cityCode;
//    当前城市所属的省份
    private int proviceId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }
}
