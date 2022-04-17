package com.juniorgonzalez.spring.dao;

import com.juniorgonzalez.spring.model.Course;

import java.util.List;

public interface CourseDao {

    void saveCourse(Course Course);

    void deleteCourseById(Long idCurso);

    void updateCourse(Course course);

    List<Course> findAllCourses();

    Course findById(Long idCourse);

    Course findByName(String name);

    List<Course> findByIdTeacher(Long idTeacher);
}
