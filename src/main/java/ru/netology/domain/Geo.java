package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;

    private Plase plase;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Plase getPlase() {
        return plase;
    }

    public void setPlase(Plase plase) {
        this.plase = plase;
    }
}
