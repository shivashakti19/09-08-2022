package com.example.practice9sep

class CourseModel(private var course_name: String, private var imgid: Int) {

    fun getCourse_name(): String {
        return course_name
    }

    fun setCourse_name(course_name: String) {
        this.course_name = course_name
    }

    fun getImgid(): Int {
        return imgid
    }

    fun setImgid(imgid: Int) {
        this.imgid = imgid
    }
}
