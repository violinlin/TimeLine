package com.example.administrator.timeline.timeline;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import java.util.List;

/**
 * @author wanghuilin
 * @time 2016/6/14  11:45
 */
public class TimeLineView extends RecyclerView {

    private TimeLineAdapter adapter;
    private LinearLayoutManager manager;

    public TimeLineView(Context context) {
        this(context, null);
    }

    public TimeLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        setLayoutManager(manager);
        adapter = new TimeLineAdapter();
        this.setAdapter(adapter);
    }

    /**
     * 添加时间轴元素
     *
     * @param timeBean
     */
    public void addTimeBean(TimeBean timeBean) {
        adapter.getTimeBeanList().add(timeBean);
        adapter.notifyDataSetChanged();
    }

    /**
     * 添加时间轴元素列表
     *
     * @param list
     */
    public void addTimeBeanList(List<TimeBean> list) {
        adapter.getTimeBeanList().addAll(list);
        adapter.notifyDataSetChanged();
    }

    /**
     * 设置时间轴数据源
     *
     * @param list
     */
    public void setTimeBeanList(List<TimeBean> list) {
        adapter.setTimeBeanList(list);
        adapter.notifyDataSetChanged();
    }

    public void setOrientation(int orientation) {
        manager.setOrientation(orientation);
        setLayoutManager(manager);
    }


}

