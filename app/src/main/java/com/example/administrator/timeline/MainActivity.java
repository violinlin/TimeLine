package com.example.administrator.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.administrator.timeline.timeline.TimeBean;
import com.example.administrator.timeline.timeline.TimeLineView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TimeLineView timeLineView;
    List<TimeBean>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeLineView= (TimeLineView) findViewById(R.id.time_line_view);
        list=new LinkedList<>();
        for (int i=0;i<10;i++){
            list.add(new TimeBean());
        }
        timeLineView.setTimeBeanList(list);
//        timeLineView.setOrientation(LinearLayoutManager.HORIZONTAL);
    }
}
