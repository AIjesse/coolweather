package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWsh carWsh;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class CarWsh {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
