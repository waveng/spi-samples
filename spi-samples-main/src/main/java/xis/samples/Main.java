/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package xis.samples;

import java.util.List;

import xis.samples.factory.HelloFactory;
import xis.samples.spi.HelloInterface;

/**
 * 类Main.java的实现描述：TODO 类实现描述
 * @author wangbo 2018年1月12日 下午1:11:46
 * @date 2018年1月12日 下午1:11:46
 * @version V1.0
 */
public class Main {
    public static void main(String[] args) {
        List<HelloInterface> list = HelloFactory.hellos();
        for (HelloInterface helloInterface : list) {
            System.out.println(helloInterface.getClass());
            System.out.println( helloInterface.sayHi("12"));
        }
    }
}
