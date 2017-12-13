package com.bigsea.sns.web.controller.Info;
import com.bigsea.sns.model.Info.Info;
import com.bigsea.sns.service.Info.InfoService;
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
 * Created by lxyer on 2017/12/13.
 */
@Controller
@RequestMapping("/info/")
public class InfoController {

    @Autowired
    InfoService infoService;

    @RequestMapping("add")
    @ResponseBody
    public String add(Info info) {
        infoService.save(info);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    infoService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(Info info) {
	    infoService.update(info);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        Info info = infoService.findById(id);
        return info.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Info> list = infoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
