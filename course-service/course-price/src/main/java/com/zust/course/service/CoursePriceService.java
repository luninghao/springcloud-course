package com.zust.course.service;

import com.zust.course.entity.CourseAndPrice;
import com.zust.course.entity.CoursePrice;

import java.util.List;

/**
 * 描述：     课程价格服务
 */
public interface CoursePriceService {

    CoursePrice getCoursePrice(Integer courseId);

    List<CourseAndPrice> getCoursesAndPrice();
}
