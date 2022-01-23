package com.eep.serviceimpl;

import com.eep.entity.Course;
import com.eep.repository.CourseJpaRepository;
import com.eep.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {

    @Autowired
    @Qualifier("courseJpaRepository")
    private CourseJpaRepository courseJpaRepository;


    @Override
    public List<Course> listAllCourses() {
        return courseJpaRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseJpaRepository.save(course);
    }

    @Override
    public int removeCourse(int id) {
        courseJpaRepository.deleteById(id);
        return 0;
    }

    @Override
    public Course updateCourse(Course course) {
        courseJpaRepository.save(course);
        return null;
    }
}
