package com.zhao.copyone.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zhao.copyone.R;
import com.zhao.copyone.model.bean.ContentListBean;
import com.zhao.copyone.model.bean.DayInfo;
import com.zhao.copyone.ui.reading.EssayDetailActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * Created by 39424 on 2017/3/12.
 */

public class OneItemAdapter extends RecyclerView.Adapter  {

    private Context context;
    private List<ContentListBean> contents;
    private int viewType = 0;

    public OneItemAdapter(Context context, List<ContentListBean> contents){
        this.context = context;
        this.contents = contents;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OneItemHolder(LayoutInflater.from(context).inflate(R.layout.item_one,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        OneItemHolder oneItemHolder = (OneItemHolder) holder;
        Log.d("onBindViewHolder","size:" + contents.size());
        ContentListBean bean = contents.get(position);
        if(bean!=null&&oneItemHolder!=null)
        {
            Log.d("onBindViewHolder","bean:" + bean.getTitle());
            if(bean.getCategory()==0 || bean.getCategory()==3){
//                Glide.with(context).load(bean.getImg_url()).placeholder(R.drawable.ic_menu_send).into(oneItemHolder.image);
                oneItemHolder.image.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_menu_send ));
            }else{
                oneItemHolder.title.setText(bean.getTitle());
                oneItemHolder.catagray.setText("- Test -");
                oneItemHolder.author.setText(bean.getAuthor().getUser_name());
                oneItemHolder.desc.setText(bean.getForward());
                Glide.with(context).load(bean.getImg_url()).placeholder(R.drawable.ic_menu_send).into(oneItemHolder.image);
                oneItemHolder.date.setText(bean.getPost_date());
                oneItemHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (bean.getCategory()){
                            case 1:
                                Intent intent = new Intent(context, EssayDetailActivity.class);
                                intent.putExtra("ItemId",bean.getItem_id());
                                context.startActivity(intent);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public void setContents(List<ContentListBean> list){
        contents = list;
    }

    public List<ContentListBean> getContents() {
        return contents;
    }

    class OneItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.linearLayout)
        LinearLayout linearLayout;
        @BindView(R.id.catagray)
        TextView catagray;
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.author)
        TextView author;
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.desc)
        TextView desc;
        @BindView(R.id.date)
        TextView date;

        public OneItemHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
