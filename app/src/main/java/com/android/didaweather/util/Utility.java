package com.android.didaweather.util;

import android.text.TextUtils;

import com.android.didaweather.db.City;
import com.android.didaweather.db.County;
import com.android.didaweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by MD on 2018/4/15.
 */

public class Utility {

    /**
     * 解析和处理服务器返回的省级的数据
     */
    public static boolean handleProvinceResponse(String response){

        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray = new JSONArray(response);
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject provinceObject = jsonArray.getJSONObject(i);
                    // 获取到省份的实例
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    /**
     * 解析和处理服务器返回的市级数据
     */

    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray = new JSONArray(response);
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject cityObject = jsonArray.getJSONObject(i);
                    // 获取到城市的实例
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    // 设置所属的省份
                    city.setProviceId(provinceId);
                    city.save();
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级的数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray = new JSONArray(response);
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject countyObject = jsonArray.getJSONObject(i);
                    // 获取到县的实例
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    // 所属的城市
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return false;
    }

}
