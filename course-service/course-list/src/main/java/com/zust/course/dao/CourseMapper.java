package com.zust.course.dao;

import java.util.List;
import com.zust.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 描述：     课程的Mapper类
 */
@Mapper
@Repository
public interface CourseMapper {

    @Select("SELECT * FROM course WHERE valid = 1")
    List<Course> findValidCourses();
}