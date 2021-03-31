package cn.guizhou001.hr.service;

import cn.guizhou001.hr.model.Hello;

import java.util.List;

/**
 * @Description:
 * @author: fengli
 * @date: 2021/3/31 10:21 下午
 */
public interface HelloService {

    int add(Hello hello);

    List<Hello> getAll();
}
