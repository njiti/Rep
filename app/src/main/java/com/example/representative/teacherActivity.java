package com.example.representative;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;

import java.util.ArrayList;

public class teacherActivity extends AppCompatActivity {

    PieChart pieChart,pieChart1,pieChart2;
    LineChart lineChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        pieChart = findViewById(R.id.PieChart);
        pieChart1 = findViewById(R.id.PieChart1);
        pieChart2 = findViewById(R.id.PieChart2);
        lineChart = findViewById(R.id.lineGraph);

    }
}