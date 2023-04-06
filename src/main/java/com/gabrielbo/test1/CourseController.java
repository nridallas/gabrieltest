package com.gabrielbo.test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

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
}
