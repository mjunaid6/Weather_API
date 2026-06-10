package com.cfs.Weather_API.dto;

public class RootClass {
    private Location location;
    private Current current;

    public RootClass(Location location, Current current) {
        this.location = location;
        this.current = current;
    }

    public RootClass() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
