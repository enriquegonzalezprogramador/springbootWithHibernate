package com.juniorgonzalez.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="teacher")
public class Teacher implements Serializable {

    @Id
    @Column(name = "id_teacher")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeacher;

    @Column(name="name")
    private String name;

    @Column(name="avatar")
    private String avatar;

    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teacher")
    private Set<TeacherSocialMedia> teacherSocialMedias;

    public Teacher(String name, String avatar, Set<Course> courses, Set<TeacherSocialMedia> teacherSocialMedias) {
        this.name = name;
        this.avatar = avatar;
        this.courses = courses;
        this.teacherSocialMedias = teacherSocialMedias;
    }

    public Teacher() {

    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<TeacherSocialMedia> getTeacherSocialMedias() {
        return teacherSocialMedias;
    }

    public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
        this.teacherSocialMedias = teacherSocialMedias;
    }
}
