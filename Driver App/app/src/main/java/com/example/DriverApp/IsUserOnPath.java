package com.example.DriverApp;

public class IsUserOnPath {

    public class GETLocation {
        private double latitude;
        private double longitude;

        public GETLocation(double latitude,double longitude)
        {
            this.latitude=latitude;
            this.longitude=longitude;
        }
        public GETLocation(){}
        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }
}
