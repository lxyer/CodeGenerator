package com.bigsea.sns.service.impl.User;

import com.bigsea.sns.dao.mapper.User.UserMapper;
import com.bigsea.sns.model.User.User;
import com.bigsea.sns.service.User.UserService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by lxyer on 2017/12/13.
 */
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

}
