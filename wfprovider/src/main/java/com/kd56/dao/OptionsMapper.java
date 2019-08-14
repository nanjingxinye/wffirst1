package com.kd56.dao;

import com.kd56.vo.Options;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/15.
 */
@Repository
public interface OptionsMapper {
    //根据sid去查询所在标题下的得票数、选项内容
    List<Map<String,Object>> queryAllOptions(Integer sid);


    //根据 Id去更新选项内容,更新得票数



    int updateOptions(Options options);


}
