package com.kd56.dao;

import com.kd56.vo.Subjects;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/15.
 */
@Repository
public interface SubjectsMapper {
//查看所有信息

    List<Map<String,Object>> queryAllSubject();

    //更新数据中投票和查看
    int updateSubject(Subjects subjects);


    //根据id查询
   Subjects querySubject(Integer id);


}
