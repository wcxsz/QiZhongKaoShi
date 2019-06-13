package com.example.qizhongkaoshi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qizhongkaoshi.R;
import com.example.qizhongkaoshi.bean.DataDb;

import java.util.ArrayList;

public class RlvAdapter extends RecyclerView.Adapter {
    private ArrayList<DataDb> list;
    private Context context;

    public RlvAdapter(ArrayList<DataDb> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void setDataDbs(ArrayList<DataDb> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder Holder = null;
        if (i == 1){
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_item1, viewGroup, false);
            Holder = new MyHolder1(inflate);
        }else if (i == 2){
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_item2, viewGroup, false);
            Holder = new MyHolder2(inflate);
        }else if (i == 3){
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_item3, viewGroup, false);
            Holder = new MyHolder3(inflate);
        }else if (i == 4){
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_item4, viewGroup, false);
            Holder = new MyHolder4(inflate);
        }
        return Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 1){
            MyHolder1 myHolder1 = (MyHolder1) viewHolder;
            myHolder1.tv_item1.setText(list.get(i).getTitle());
            Glide.with(context).load(list.get(i).getImg()).into(myHolder1.iv_item1);
        }else if (itemViewType == 2){
            MyHolder2 myHolder2 = (MyHolder2) viewHolder;
            myHolder2.tv_item2.setText(list.get(i).getTitle());
            Glide.with(context).load(list.get(i).getImg()).into(myHolder2.iv1_item2);
            Glide.with(context).load(list.get(i).getImg()).into(myHolder2.iv2_item2);
        }else if (itemViewType == 3){
            MyHolder3 myHolder3 = (MyHolder3) viewHolder;
            myHolder3.tv_item3.setText(list.get(i).getTitle());
            Glide.with(context).load(list.get(i).getImg()).into(myHolder3.iv_item3);
        }else if (itemViewType == 4){
            MyHolder4 myHolder4 = (MyHolder4) viewHolder;
            myHolder4.tv_item4.setText(list.get(i).getTitle());
            Glide.with(context).load(list.get(i).getImg()).into(myHolder4.iv_item4);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position%4 == 0){
            return 1;
        }else if(position %4 == 1){
            return 2;
        }else if (position %4 ==2){
            return 3;
        }else{
            return 4;
        }
    }
    public class MyHolder1 extends RecyclerView.ViewHolder{

        private final TextView tv_item1;
        private final ImageView iv_item1;

        public MyHolder1(@NonNull View itemView) {
            super(itemView);
            tv_item1 = itemView.findViewById(R.id.tv_item1);
            iv_item1 = itemView.findViewById(R.id.iv_item1);
        }
    }
    public class MyHolder2 extends RecyclerView.ViewHolder{

        private final TextView tv_item2;
        private final ImageView iv1_item2;
        private final ImageView iv2_item2;

        public MyHolder2(@NonNull View itemView) {
            super(itemView);
            tv_item2 = itemView.findViewById(R.id.tv_item2);
            iv1_item2 = itemView.findViewById(R.id.iv1_item2);
            iv2_item2 = itemView.findViewById(R.id.iv2_item2);
        }
    }
    public class MyHolder3 extends RecyclerView.ViewHolder{

        private final TextView tv_item3;
        private final ImageView iv_item3;

        public MyHolder3(@NonNull View itemView) {
            super(itemView);
            tv_item3 = itemView.findViewById(R.id.tv_item3);
            iv_item3 = itemView.findViewById(R.id.iv_item3);
        }
    }
    public class MyHolder4 extends RecyclerView.ViewHolder{

        private final TextView tv_item4;
        private final ImageView iv_item4;

        public MyHolder4(@NonNull View itemView) {
            super(itemView);
            tv_item4 = itemView.findViewById(R.id.tv_item4);
            iv_item4 = itemView.findViewById(R.id.iv_item4);
        }
    }


}
