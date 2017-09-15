package brokencoin.net.radio.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import brokencoin.net.radio.Holders.StationViewHolder;
import brokencoin.net.radio.R;
import brokencoin.net.radio.model.Station;

/**
 * Created by avroman on 9/12/17. A specifc Adapter class for the building of
 * stations.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

        Station station = stations.get(position);
        holder.updateUI(station);



    }

    @Override
    public int getItemCount() {

        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);

        return new StationViewHolder(stationCard);
    }
}
