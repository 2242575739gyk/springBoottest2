package cn.jiyun.ssm.controller;

import cn.jiyun.ssm.pojo.User;
import cn.jiyun.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    @ResponseBody
    public  User FindByUserId(@PathVariable("id") int id){
       User u= userService.findByUserId(id);
       return  u;
    }
}
