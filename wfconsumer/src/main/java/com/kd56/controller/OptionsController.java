package com.kd56.controller;

import com.kd56.service.OptionsService;
import com.kd56.vo.Options;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/15.
 */
@RestController
public class OptionsController {
    @Resource
    private OptionsService optionsService;
    @RequestMapping("/queryAllOptions")
    public List<Map<String, Object>> queryAllOptions(Integer sid) {
        return optionsService.queryAllOptions(sid);
    }
    @RequestMapping("/updateOptions")
    public int updateOptions(Options options) {
        return optionsService.updateOptions(options);
    }




}
