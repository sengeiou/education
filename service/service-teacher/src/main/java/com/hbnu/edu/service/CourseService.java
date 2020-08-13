package com.hbnu.edu.service;

import com.hbnu.base.config.exception.MyException;
import com.hbnu.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hbnu.edu.entity.vo.CourseInfo;
import com.hbnu.edu.entity.vo.FinalCourseInfo;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author MayPrayer
 * @since 2020-08-10
 */
public interface CourseService extends IService<Course> {

    String addOneCourse(CourseInfo courseInfo);

    CourseInfo findCourseByCId(String courseid);

    Boolean UpdateCourse(CourseInfo courseInfo);

    FinalCourseInfo getAllFinalCourseInfo(String courseid);

//    void removeCourse(String courseId) throws MyException;

    void updateBuyCountById(String id);

}