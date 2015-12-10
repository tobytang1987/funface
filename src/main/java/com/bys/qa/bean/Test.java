package com.bys.qa.bean;

/**
 * Created by tobytang on 12/9/15.
 */
public class Test {

    private String path;
    private String method;
    private String result;
    private String expect;


    public String getPath() {
        return path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }
}
