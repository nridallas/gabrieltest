package com.gabrielbo.test1.controller;

import com.gabrielbo.test1.entity.CourseEntity;
import com.gabrielbo.test1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @RequestMapping("/courselist")
    public List<Course> retrieveALLCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course (2, "Learn DevOps", "in28minutes")
        );
    }
    @RequestMapping("/mycourse")
    public String getCourse(){
        return "My Course";
    }

    @RequestMapping("/listofnames")
    public List<CourseEntity> getByName(@RequestParam(value = "name", defaultValue = "name") String name)
    {
        return courseRepository.findByName(name);
    }
    @RequestMapping("/listofauthor")
    public List<CourseEntity> getByAuthor(@RequestParam(value = "author", defaultValue = "author") String author)
    {
        return courseRepository.findByAuthor(author.toLowerCase());
    }

    @PostMapping("/course")
    public void createCourse(@RequestBody CourseEntity newCourseEntity)
    {
        CourseEntity courseEntity = courseRepository.save(newCourseEntity);
    }

    @GetMapping("/course/all")
    public List<CourseEntity> getAllCourses()
    {
        return courseRepository.findAll();
    }

    @PutMapping("/course")
    public CourseEntity updateCourse(@RequestBody CourseEntity newCourseEntity)
    {
        return courseRepository.save(newCourseEntity);
    }

    @DeleteMapping("/course")
    public void deleteCourse(@RequestBody CourseEntity existingCourseEntity)
    {
        courseRepository.delete(existingCourseEntity);
    }

    @DeleteMapping("/course/deleteid")
    public void deleteById(@RequestParam(value = "id", defaultValue = "id") int id)
    {
        courseRepository.deleteById(id);
    }
}
