package com.android.didaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MD on 2018/4/20.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }
}
