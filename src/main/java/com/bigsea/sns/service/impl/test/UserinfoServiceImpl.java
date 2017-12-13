package com.bigsea.sns.service.impl.test;

import com.bigsea.sns.dao.mapper.test.UserinfoMapper;
import com.bigsea.sns.model.test.Userinfo;
import com.bigsea.sns.service.test.UserinfoService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by zhh on 2017/12/13.
 */
@Service
public class UserinfoServiceImpl extends AbstractService<Userinfo> implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

}
