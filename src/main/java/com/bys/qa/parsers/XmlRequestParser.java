package com.bys.qa.parsers;

import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

/**
 * Created by tobytang on 12/8/15.
 */
public class XmlRequestParser {

    private Digester digester;
    private final static String TESTSUITE = "src/main/resources/signin.xml";

    public XmlRequestParser(Digester digester) {
        this.digester = digester;
    }

    public <T> T parse() throws IOException, SAXException {
        return digester.parse(new File(TESTSUITE));
    }

//    public static void main(String[] args){
//        Digester digester = new Digester();
//        digester.addRuleSet(new FunfaceRuleSet());
//        XmlRequestParser xmlRequestParser = new XmlRequestParser(digester);
//        Suite suite = null;
//        try {
//            suite = xmlRequestParser.parse();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        }
//        System.out.println(suite.getHost());
//        System.out.println(suite.getTests().get(0).getPath());
//        System.out.println(suite.getTests().get(1).getPath());
//    }
}
