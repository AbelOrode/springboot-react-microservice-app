package com.sha.springbootmicroservice1course.service;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    //Save/Create a Course
    @Override
    public Course saveCourse(Course course){
        course.setCreatedAt(LocalDateTime.now());
        return courseRepository.save(course);
    }

    //Delete a course by Id
    @Override
    public void deleteCourse (Long courseId){
        courseRepository.deleteById(courseId);
    }


    //Get all courses
    @Override
    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }
}
