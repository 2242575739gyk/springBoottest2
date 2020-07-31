package cn.jiyun.ssm.service;

import cn.jiyun.ssm.mapper.UserMapper;
import cn.jiyun.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findByUserId(Integer id){
    return  userMapper.selectByPrimaryKey(id);
    }
    @Transactional
    public  void deleteById(Integer id){
        userMapper.deleteByPrimaryKey(id);
    }
}
