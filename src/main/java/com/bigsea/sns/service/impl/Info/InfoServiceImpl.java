package com.bigsea.sns.service.impl.Info;

import com.bigsea.sns.dao.mapper.Info.InfoMapper;
import com.bigsea.sns.model.Info.Info;
import com.bigsea.sns.service.Info.InfoService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by lxyer on 2017/12/13.
 */
@Service
public class InfoServiceImpl extends AbstractService<Info> implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

}
