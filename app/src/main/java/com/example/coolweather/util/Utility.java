package com.example.coolweather.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;

public class Utility {

    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;)

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
