package com.red.jfs_jwt.Service;


import com.red.jfs_jwt.Model.Course;

import java.util.List;

public interface CourseService
{
    List<Course> all();

    void save( Course course );

    void delete( String courseId );
}
