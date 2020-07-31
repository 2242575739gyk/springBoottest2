package cn.jiyun.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
@RequestMapping("hello")
public class HellController {
    @Autowired
    private DataSource dataSource;
    @GetMapping("show")
    public String index(){


        return  "hell word";
    }
}
