package com.stmapps.gmaps01;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        String myCityName, myCitySnippet;
        LatLng myCityGPS;
        MarkerOptions markeropts;

        myCityName = "New York City";
        myCityGPS = new LatLng(40.7127837, -74.00594130000002);
        myCitySnippet = "The Big Apple, the city that never sleeps, blah, blah, blah, ...";
        markeropts = new MarkerOptions();
        //mMap.addMarker(new MarkerOptions().position(myCityGPS).title("Marker in " + myCityName).snippet("This is New York City, the big apple, blah, blah, blah...").icon(BitmapDescriptorFactory.fromResource(R.drawable.)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(myCityGPS));
        markeropts.position(myCityGPS);
        markeropts.title(myCityName);
        markeropts.snippet(myCitySnippet);
        //markeropts.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        markeropts.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        markeropts.draggable(true);
        mMap.addMarker(markeropts);

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(myCityGPS));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myCityGPS, 7));


    }
}
