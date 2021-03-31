package cn.guizhou001.hr.controller;

import cn.guizhou001.hr.model.Hello;
import cn.guizhou001.hr.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author: fengli
 * @date: 2021/3/31 9:57 下午
 */
/*

 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping("/save")
    public Object save(Hello hello) {
        int count = helloService.add(hello);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 200);
        resultMap.put("msg", "添加成功");
        resultMap.put("data", count);
        return resultMap;
    }

    @GetMapping("findAll")
    public List<Hello> getAll(){
        return helloService.getAll();
    }
}
