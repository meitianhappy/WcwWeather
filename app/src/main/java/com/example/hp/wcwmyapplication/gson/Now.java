package com.example.hp.wcwmyapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 2018/4/26.
 */

public class Now{
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
