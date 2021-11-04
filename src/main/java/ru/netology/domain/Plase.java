package ru.netology.domain;

public class Plase {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checkins;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        if (latitude >= -90 || latitude <= 90) {
            this.latitude = latitude;
        }
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        if (longitude >= -90 || longitude <= 90) {
            this.longitude = longitude;
        }
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCheckins() {
        return checkins;
    }

    public void setCheckins(int checkins) {
        if (checkins > 0) {
            this.checkins = checkins;
        }
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        if (country > 0) {
            this.country = country;
        }
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        if (city > 0) {
            this.city = city;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
