package com.example.payoneer_task.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.payoneer_task.R;
import com.example.payoneer_task.model.Applicable;
import com.example.payoneer_task.repository.RemoteDataRepository;

import java.util.ArrayList;
import java.util.List;

public class ListResultRecyclerAdapter extends RecyclerView.Adapter<ListResultRecyclerAdapter.ViewHolder> {
    private final Context context;
    List<Applicable> applicableArrayList;
    private int mCheckedPosition = -1;
    private static final String TAG = RemoteDataRepository.class.getSimpleName();

    public ListResultRecyclerAdapter(Context context, ArrayList<Applicable> applicableArrayList) {
        this.context = context;
        this.applicableArrayList = applicableArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.base_list_items,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Applicable applicable = applicableArrayList.get(i);
        viewHolder.cardTitle.setText(applicable.getLabel());
        Glide.with(context)
                .load(applicable.getLinks().getLogo())
                .into(viewHolder.logoImage);
        viewHolder.mCheckBox.setVisibility(i==mCheckedPosition? View.VISIBLE: View.INVISIBLE);
        applicable.setSelected(i == mCheckedPosition);
        viewHolder.cardTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == mCheckedPosition) {
                    viewHolder .mCheckBox.setChecked(false);
                    mCheckedPosition = -1;
                } else {
                    mCheckedPosition = i;

                    notifyDataSetChanged();
                }

                Log.d(TAG,"mCheckedPosition : "+ mCheckedPosition);
            }
        });
    }

    public void setValues(List<Applicable> applicableList) {
        this.applicableArrayList = applicableList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return applicableArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView logoImage;
        private final TextView cardTitle;
        private  final CheckBox mCheckBox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logoImage = itemView.findViewById(R.id.id_item_logo);
            cardTitle = itemView.findViewById(R.id.id_item_name);
            mCheckBox = itemView.findViewById(R.id.id_checkbox);
        }
    }
}
