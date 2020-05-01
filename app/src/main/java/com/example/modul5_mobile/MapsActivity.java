package com.example.modul5_mobile;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Random;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng malang,spbuLdg,spbuUmm,spbuSht,spbuBendungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        final SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        malang = new LatLng(-7.932816, 112.596237);
        spbuUmm = new LatLng(-7.920292, 112.596063);
        spbuLdg = new LatLng(-7.930578, 112.604089);
        spbuSht = new LatLng(-7.936778, 112.628789);
        spbuBendungan = new LatLng(-7.955918, 112.615421);

        mMap.addMarker(new MarkerOptions().position(spbuUmm).title("SPBU UMM JOS"));
        mMap.addMarker(new MarkerOptions().position(spbuLdg).title("SPBU LANDUNGSARI"));
        mMap.addMarker(new MarkerOptions().position(spbuSht).title("SPBU SUHAT LUR"));
        mMap.addMarker(new MarkerOptions().position(spbuBendungan).title("SPBU BENDUNGAN SUTAMI"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(malang));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(12));
    }
}
