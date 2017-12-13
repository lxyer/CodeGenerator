package com.bigsea.sns.web.controller.test;
import com.bigsea.sns.model.test.Userinfo;
import com.bigsea.sns.service.test.UserinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * Created by zhh on 2017/12/13.
 */
@Controller
@RequestMapping("/userinfo/")
public class UserinfoController {

    @Autowired
    UserinfoService userinfoService;

    @RequestMapping("add")
    @ResponseBody
    public String add(Userinfo userinfo) {
        userinfoService.save(userinfo);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    userinfoService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(Userinfo userinfo) {
	    userinfoService.update(userinfo);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        Userinfo userinfo = userinfoService.findById(id);
        return userinfo.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Userinfo> list = userinfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
