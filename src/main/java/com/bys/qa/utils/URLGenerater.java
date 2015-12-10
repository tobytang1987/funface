package com.bys.qa.utils;

import com.bys.qa.bean.Suite;

/**
 * Created by tobytang on 12/9/15.
 */
public class URLGenerater {

    private Suite suite;

    public URLGenerater(Suite suite) {
        this.suite = suite;
    }

    public String generateBaseURL() {
        return suite.getScheme() + "://" + suite.getHost() + ":" + suite.getPort() + "/";
    }

}
