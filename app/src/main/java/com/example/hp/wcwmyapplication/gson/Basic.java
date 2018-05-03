package com.example.hp.wcwmyapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 2018/4/26.
 */

public class Basic{
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}