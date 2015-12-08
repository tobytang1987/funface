package com.bys.qa.utils;


import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Created by tobytang on 12/8/15.
 */
public class JsonUtils {

    private JsonElement jsonElement;

    private String filePath;

    public JsonUtils(String filePath) {
        this.filePath = filePath;
    }

    public JsonElement getValue(String key) {
        JsonParser jsonParser = new JsonParser();
        try {
            jsonElement = jsonParser.parse(new JsonReader(new InputStreamReader(new FileInputStream(new File(filePath)))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jsonElement.getAsJsonObject().get(key);
    }

}
