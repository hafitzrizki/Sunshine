package belajar.app.sunshine.Controllers.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import belajar.app.sunshine.ItemObject;
import belajar.app.sunshine.R;

/**
 * Created by isfaaghyth on 12/11/16.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder> {

    Context context;
    List<ItemObject.ListWeather> itemObjects;

    public ListAdapter(Context context, List<ItemObject.ListWeather> itemObjects) {
        this.context = context;
        this.itemObjects = itemObjects;
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_sunshine_item, null);
        return new ListHolder(view);
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        holder.txtDay.setText(itemObjects.get(position).getJudul());
    }

    @Override
    public int getItemCount() {
        return itemObjects.size();
    }

    class ListHolder extends RecyclerView.ViewHolder {

        TextView txtDay;

        public ListHolder(View itemView) {
            super(itemView);
            txtDay = (TextView) itemView.findViewById(R.id.txt_day);
        }
    }

}
