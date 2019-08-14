package com.kd56.controller;

import com.kd56.service.SubjectsService;
import com.kd56.vo.Options;
import com.kd56.vo.Subjects;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/16.
 */
@RestController
public class SubjectsController {
    @Resource
    private SubjectsService subjectsService;
    @RequestMapping("/queryAllSubject")
    public List<Map<String, Object>> queryAllSubject() {
        return subjectsService.queryAllSubject();
    }

    @RequestMapping("/updateSubject")
    public int updateSubject(Subjects subjects) {
        return subjectsService.updateSubject(subjects);
    }

    @RequestMapping("/querySubject")
    public Options querySubject(Integer id) {
        return subjectsService.querySubject(id);
    }


}
