/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the
 * confidential and proprietary information of Sumpay.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Sumpay.com .
 */
package xis.samples.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import xis.samples.spi.HelloInterface;

/**
 * 类HelloFactory.java的实现描述：TODO 类实现描述
 * @author wangbo 2018年1月12日 下午1:30:12
 * @date 2018年1月12日 下午1:30:12
 * @version V1.0
 */
public class HelloFactory {
    public static HelloInterface hello() {
        ServiceLoader<HelloInterface> service = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface helloInterface : service) {
            return helloInterface;
        }
        return null;
    }
    public static List<HelloInterface> hellos() {
        ServiceLoader<HelloInterface> service = ServiceLoader.load(HelloInterface.class);
        List<HelloInterface> list = new ArrayList<HelloInterface>();
        for (HelloInterface helloInterface : service) {
            list.add(helloInterface);
        }
        return list;
    }
}
