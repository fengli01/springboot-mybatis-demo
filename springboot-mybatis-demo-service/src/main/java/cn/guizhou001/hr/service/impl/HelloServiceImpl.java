package cn.guizhou001.hr.service.impl;

import cn.guizhou001.hr.mapper.HelloMapper;
import cn.guizhou001.hr.model.Hello;
import cn.guizhou001.hr.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: fengli
 * @date: 2021/3/31 10:33 下午
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private HelloMapper helloMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    @Override
    public int add(Hello hello) {
        return helloMapper.insert(hello);
    }

    @Override
    public List<Hello> getAll() {
        return helloMapper.getAll();
    }
}
