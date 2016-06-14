package com.example.administrator.timeline.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.administrator.timeline.R;

/**
 * @author wanghuilin
 * @time 2016/6/14  12:01
 */
public class ItemView extends RelativeLayout{
    private ImageView itemFirstIcon;
    private ImageView itemLastIcon;
    public ItemView(Context context) {
        this(context,null);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.time_line_item_layout,this,true);
        initView();
    }

    private void initView() {
        itemFirstIcon = (ImageView) findViewById(R.id.time_line_first_icon);
        itemLastIcon= (ImageView) findViewById(R.id.time_line_last_icon);
    }

    public void setFirstItemIcon(int resourse){
        itemFirstIcon.setVisibility(VISIBLE);
        itemFirstIcon.setImageResource(resourse);
    }
    public void setLastItemIcon(int resourse){
        itemLastIcon.setVisibility(View.VISIBLE);
        itemLastIcon.setImageResource(resourse);
    }
    public void setNormalItemIcon(int resourse){
        itemFirstIcon.setImageResource(resourse);
        itemFirstIcon.setVisibility(GONE);
        itemLastIcon.setVisibility(GONE);
    }
}
