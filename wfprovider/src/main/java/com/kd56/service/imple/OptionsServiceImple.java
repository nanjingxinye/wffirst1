package com.kd56.service.imple;

import com.kd56.dao.OptionsMapper;
import com.kd56.service.OptionsService;
import com.kd56.vo.Options;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/15.
 */
@Service
@Transactional
public class OptionsServiceImple implements OptionsService {
    @Resource
    private OptionsMapper optionsMapper;

    @Override
    public List<Map<String, Object>> queryAllOptions(Integer sid) {
        return optionsMapper.queryAllOptions(sid);
    }

    @Override
    public int updateOptions(Options options) {
        return optionsMapper.updateOptions(options);
    }


}
