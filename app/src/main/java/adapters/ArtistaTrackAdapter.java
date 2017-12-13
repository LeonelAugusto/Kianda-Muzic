package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import corp.leomor.kiandamuzic.R;
import models.ArtistTrackList;

/**
 * Created by Leonel Morgado on 11/12/2017.
 */

public class ArtistaTrackAdapter extends RecyclerView.Adapter<ArtistaTrackAdapter.ViewHolder> {

    private Context context;
    private ArtistTrackList trackList;

    public ArtistaTrackAdapter (Context context, ArtistTrackList trackList){

        this.context = context;
        this.trackList = trackList;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mTrackCover;
        public TextView mTrackName;
        public TextView mArtistName;
        public ImageView mArtistVerfiedBadge;
        public ImageView mTrackDetails;

        public ViewHolder(View itemView) {
            super(itemView);
            //Criamos os itens do nosso list_item layout
            mTrackCover = itemView.findViewById(R.id.trackCover);
            mTrackDetails = itemView.findViewById(R.id.trackDetails);
            mTrackName = itemView.findViewById(R.id.trackName);
            mArtistVerfiedBadge = itemView.findViewById(R.id.verifiedAccount);
            mArtistName = itemView.findViewById(R.id.artistName);

        }
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.list_item, parent);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mArtistName.setText(trackList.getArtistTracks().get(position).getArtist().getName() );
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
