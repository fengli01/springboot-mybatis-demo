package cn.guizhou001.hr.mapper;

import cn.guizhou001.hr.model.Hello;

import java.util.List;

/**
 * @Description:
 * @author: fengli
 * @date: 2021/3/31 11:00 下午
 */

public interface HelloMapper {

    int insert(Hello hello);

    List<Hello> getAll();
}
