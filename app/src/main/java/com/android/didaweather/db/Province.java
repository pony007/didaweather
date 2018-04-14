package com.android.didaweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MD on 2018/4/14.
 */

public class Province extends DataSupport {

    private int id;
//    省的名字
    private String provinceName;
//    省的代号
    private int provinceCode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

