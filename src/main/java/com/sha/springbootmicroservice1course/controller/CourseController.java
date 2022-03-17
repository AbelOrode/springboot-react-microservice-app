package com.sha.springbootmicroservice1course.controller;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //Create Course Endpoint
    @PostMapping // http://api/course
    public ResponseEntity<?> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    //Delete a Single Course Endpoint
    @DeleteMapping("{courseId}") //http://api/course{courseId}
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId){
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    //Get all courses
    @GetMapping //http://api/course
    public ResponseEntity<?> getAllCourses(){
        return ResponseEntity.ok(courseService.findAllCourses());
    }
}
