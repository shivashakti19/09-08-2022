package com.example.practice9sep

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var coursesGV: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coursesGV = findViewById(R.id.idGVcourses)
        val courseModelArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()

        courseModelArrayList.add(CourseModel("DSA", R.drawable.img))
        courseModelArrayList.add(CourseModel("JAVA", R.drawable.img))
        courseModelArrayList.add(CourseModel("C++", R.drawable.img))
        courseModelArrayList.add(CourseModel("Python", R.drawable.img))
        courseModelArrayList.add(CourseModel("Javascript", R.drawable.img))
        courseModelArrayList.add(CourseModel("DSA", R.drawable.img))

        val adapter = CourseGVAdapter(this, courseModelArrayList)
        coursesGV.adapter = adapter
    }
}