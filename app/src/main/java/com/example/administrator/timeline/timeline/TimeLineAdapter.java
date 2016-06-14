package com.example.administrator.timeline.timeline;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.timeline.R;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wanghuilin
 * @time 2016/6/14  14:25
 */
class TimeLineAdapter extends RecyclerView.Adapter<TimeLineAdapter.TimeLineVH> {


    private List<TimeBean> list;


    public void setTimeBeanList(List<TimeBean> list) {
        this.list = list;
    }

    public List<TimeBean> getTimeBeanList() {
        if (list == null) {
            list = new LinkedList<>();
        }
        return list;
    }

    @Override
    public TimeLineVH onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemView itemView = new ItemView(parent.getContext());
        return new TimeLineVH(itemView);
    }

    @Override
    public void onBindViewHolder(TimeLineVH holder, int position) {
        ItemView itemView = (ItemView) holder.itemView;

        if (position==0){
            itemView.setFirstItemIcon(R.drawable.ic_ok);
        }else if (position==getItemCount()-1){
            itemView.setLastItemIcon(R.drawable.ic_ok);
        }else {
            itemView.setNormalItemIcon(R.drawable.item_normal_bg);
        }


    }

    @Override
    public int getItemCount() {
        return getTimeBeanList().size();
    }

     class TimeLineVH extends RecyclerView.ViewHolder {

        public TimeLineVH(View itemView) {
            super(itemView);
        }
    }
}
