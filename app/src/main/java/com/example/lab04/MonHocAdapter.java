package com.example.lab04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonHocAdapter extends BaseAdapter {
    static class ViewHolder {
        ImageView imgView;
        TextView txtMonHoc;
        TextView txtTenGV;
    }
    public List<MonHoc>listData;

    public MonHocAdapter(List<MonHoc> listMonHoc){
        this.listData = listMonHoc;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, null);
            holder = new ViewHolder();
            holder.imgView = (ImageView) convertView.findViewById(R.id.imgMonHoc);
            holder.txtMonHoc = (TextView) convertView.findViewById(R.id.txtHocPhan);
            holder.txtTenGV = (TextView) convertView.findViewById(R.id.txtGiaoVien);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        MonHoc temp = this.listData.get(position);
        holder.txtMonHoc.setText(temp.MaHP+"-"+ temp.TenHP);
        holder.txtTenGV.setText(temp.TenGV);

        int imageId = parent.getContext().getResources().getIdentifier(temp.TenHinh, "mipmap", parent.getContext().getPackageName());
        if(imageId != 0)
            holder.imgView.setImageResource(imageId);
        return convertView;
    }
}

