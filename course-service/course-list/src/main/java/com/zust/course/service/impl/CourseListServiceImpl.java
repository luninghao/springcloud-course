package com.zust.course.service.impl;

import java.util.List;
import com.zust.course.dao.CourseMapper;
import com.zust.course.entity.Course;
import com.zust.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：     课程服务实现类
 */
@Service
public class CourseListServiceImpl implements CourseListService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        return courseMapper.findValidCourses();
    }
}
