/**
 * Truderal.com.cn Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.james.antifraud.ruleenginetest;

import com.james.antifraud.TestBase;
import org.easyrules.api.RulesEngine;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author militang
 * @version Id: RulesEngineTest.java, v 0.1 17/9/11 下午4:38 militang Exp $$
 */
public class RulesEngineTest  {  //extends TestBase

    @Autowired
    private RulesEngine rulesEngine;

    @Test
    public void runtest() throws InterruptedException {
        //rullesEngine.fireRules();
        //rulesEngine.fireRules();

        for (int i = 0; i < 10; i++) {
            System.out.println(System.currentTimeMillis());
            Thread.sleep(10);
        }

    }

}