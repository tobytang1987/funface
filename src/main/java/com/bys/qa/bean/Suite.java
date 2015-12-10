package com.bys.qa.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobytang on 12/9/15.
 */
public class Suite {

    private List<Test> tests = new ArrayList<Test>();

    private String host;
    private String port;
    private String scheme;

    public List<Test> getTests() {
        return tests;
    }

    public void addTest(Test test) {
        this.tests.add(test);
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}
