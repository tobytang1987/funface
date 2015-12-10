package com.bys.qa.factory;

/**
 * Created by tobytang on 12/8/15.
 */

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class HttpFactory {

    OkHttpClient client = new OkHttpClient();

    private Request.Builder builder = new Request.Builder();

    HttpFactory() {
    }

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static void main(String[] args) throws IOException {
        HttpFactory example = new HttpFactory();
        String response = example.run("10.48.18.52:3000/device");
        System.out.println(response);
    }
}
