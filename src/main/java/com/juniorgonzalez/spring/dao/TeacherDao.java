package com.juniorgonzalez.spring.dao;

import com.juniorgonzalez.spring.model.Teacher;

import java.util.List;

public interface TeacherDao {

    void saveTeacher(Teacher teacher);

    void deleteTeacherById(Long idTeacher);

    void updateTeacher(Teacher teacher);

    List<Teacher> findAllTeachers();

    Teacher findById(Long idTeacher);

    Teacher findByName(String name);

}
