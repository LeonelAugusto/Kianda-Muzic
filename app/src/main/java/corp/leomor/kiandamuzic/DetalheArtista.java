package corp.leomor.kiandamuzic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import adapters.ArtistaTrackAdapter;
import models.Album;
import models.ArtistTrackList;
import models.Artista;
import models.Track;

public class DetalheArtista extends AppCompatActivity {


    RecyclerView listaDeMusicas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDeMusicas = findViewById(R.id.lista_de_musica);
//        setTitle("");
        Artista Eli_Soares = new Artista(1, "Vocal Livre", "descripton", "Gospel", R.drawable.ic_music_note_black_18dp, false);
        Track track = new Track();
        Album alb = new Album(1, "Bela Historia", Eli_Soares.getId(), "2016", "1500,00");
        track.setAlbum(alb);
        track.setArtist(Eli_Soares);
        track.setTrackCover(R.drawable.images);
        track.setId(1);
        track.setaName("Vocal Livre");

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);
        ArtistTrackList ESTrackList = new ArtistTrackList(1, Eli_Soares.getId(), tracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDeMusicas.setLayoutManager(linearLayoutManager);
        ArtistaTrackAdapter adapter = new ArtistaTrackAdapter(this, ESTrackList);
        listaDeMusicas.setAdapter(adapter);
    }

/*
    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
        public void onClick (View view){
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    })
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
