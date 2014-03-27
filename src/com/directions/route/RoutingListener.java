package com.directions.route;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

public interface RoutingListener {
  public void onRoutingFailure();
  public void onRoutingStart();
  public void onRoutingSuccess(PolylineOptions mPolyOptions, LatLng start, LatLng end, int routeN);
}