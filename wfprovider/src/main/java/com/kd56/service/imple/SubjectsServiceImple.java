package com.kd56.service.imple;

import com.kd56.dao.SubjectsMapper;
import com.kd56.service.SubjectsService;
import com.kd56.vo.Options;
import com.kd56.vo.Subjects;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2019/7/16.
 */
@Service
@Transactional
public class SubjectsServiceImple implements SubjectsService {
    @Resource
    private SubjectsMapper subjectsMapper;
    @Override
    public List<Map<String, Object>> queryAllSubject() {
        return subjectsMapper.queryAllSubject();
    }

    @Override
    public int updateSubject(Subjects subjects) {
        int id =subjects.getId();

        return subjectsMapper.updateSubject(subjects);
    }

    @Override
    public Options querySubject(Integer id) {
        return subjectsMapper.querySubject(id);
    }
}
