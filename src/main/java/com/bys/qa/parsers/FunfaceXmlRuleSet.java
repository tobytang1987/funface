package com.bys.qa.parsers;

import com.bys.qa.bean.Suite;
import com.bys.qa.bean.Test;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.RuleSetBase;

/**
 * Created by tobytang on 12/9/15.
 */
public class FunfaceXmlRuleSet extends RuleSetBase {

    @Override
    public void addRuleInstances(Digester digester) {
        digester.addObjectCreate("suite", Suite.class);
        digester.addSetProperties("suite");
        digester.addObjectCreate("suite/test", Test.class);
        digester.addCallMethod("suite/test/path", "setPath", 0);
        digester.addCallMethod("suite/test/method", "setMethod", 0);
        digester.addCallMethod("suite/test/expect", "setExpect", 0);
        digester.addCallMethod("suite/test/result", "setResult", 0);
        digester.addSetNext("suite/test", "addTest", "Test.class");
    }
}
