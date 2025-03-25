package models;

public class GamingStation {
    private String stationId;
    private String name;
    private String status;
    private String location;
    private double hourlyRate;
    private String lastMaintenance;

    public GamingStation(String stationId, String name, String status, String location, double hourlyRate, String lastMaintenance) {
        this.stationId = stationId;
        this.name = name;
        this.status = status;
        this.location = location;
        this.hourlyRate = hourlyRate;
        this.lastMaintenance = lastMaintenance;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(String lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }

    @Override
    public String toString() {
        return "GamingStation{" +
                "stationId='" + stationId + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", lastMaintenance='" + lastMaintenance + '\'' +
                '}';
    }
}
