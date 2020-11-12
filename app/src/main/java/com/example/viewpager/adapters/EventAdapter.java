package com.example.viewpager.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager.R;
import com.example.viewpager.models.Event;

import java.util.List;
//extends recycler view
public class EventAdapter extends RecyclerView.Adapter<EventViewHolder> {

    private List<Event> events;

    public EventAdapter(List<Event> events) {
        this.events = events;
    }

    @NonNull
    @Override
    //view holder exentds view holder
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EventViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.event_layout,
                        parent,
                        false)
        );
    }
//assigns location for data in each event.  event is extracted using the position. holder is view holder
    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = this.events.get(position);
        holder.getEventImage().setImageResource(event.getEventImgId());
        holder.getDateText().setText(event.getEventDate());
        holder.getTitleText().setText(event.getEventTitle());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}

class EventViewHolder extends RecyclerView.ViewHolder {

    private TextView titleText;
    private TextView dateText;
    private ImageView eventImage;

    public EventViewHolder(@NonNull View itemView) {
        super(itemView);
        titleText = itemView.findViewById(R.id.event_title);
        dateText = itemView.findViewById(R.id.event_date);
        eventImage = itemView.findViewById(R.id.event_img);
    }

    public TextView getTitleText() {
        return titleText;
    }

    public TextView getDateText() {
        return dateText;
    }

    public ImageView getEventImage() {
        return eventImage;
    }
}


