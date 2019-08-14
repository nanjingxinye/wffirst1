package com.kd56.service;

import com.kd56.vo.Options;
import com.kd56.vo.Subjects;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/16.
 */
public interface SubjectsService {
    //查看所有信息
    List<Map<String,Object>> queryAllSubject();

    //更新数据中投票和查看
    int updateSubject(Subjects subjects);

    //根据id查询
    Options querySubject(Integer id);


}
