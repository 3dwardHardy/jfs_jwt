package com.red.jfs_jwt.Controller;

import com.red.jfs_jwt.Model.Course;
import com.red.jfs_jwt.Service.CourseService;
import org.hibernate.service.spi.InjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @CrossOrigin
    @GetMapping("/api/courses")
    public List<Course> all() {

        return this.courseService.all();
    }
    @PostMapping("/api/courses")
    public void save(@RequestBody Course course) {
        this.courseService.save(course);
    }
    @DeleteMapping("/api/courses")
    public void delete(@PathVariable("courseId") String courseId) {
        this.courseService.delete(courseId);
    }
}
