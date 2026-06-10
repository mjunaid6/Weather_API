package com.cfs.Weather_API.dto;

public class Current {
    private int lastUpdatedEpoch;
    private String lastUpdated;
    private int tempC;
    private double tempF;
    private int isDay;
    private Condition condition;
    private double windMph;
    private int windKph;
    private int windDegree;
    private String windDir;
    private int pressureMb;
    private double pressureIn;
    private double precipMm;
    private int precipIn;
    private int humidity;
    private int cloud;
    private double feelslikeC;
    private double feelslikeF;
    private double windchillC;
    private double windchillF;
    private double heatindexC;
    private double heatindexF;
    private double dewpointC;
    private double dewpointF;
    private int visKm;
    private int visMiles;
    private double uv;
    private double gustMph;
    private double gustKph;
    private int willItRain;
    private int chanceOfRain;
    private int willItSnow;
    private int chanceOfSnow;
    private double shortRad;
    private double diffRad;
    private int dni;
    private double gti;

    public Current(int lastUpdatedEpoch, String lastUpdated, int tempC, double tempF, int isDay, Condition condition, double windMph, int windKph, int windDegree, String windDir, int pressureMb, double pressureIn, double precipMm, int precipIn, int humidity, int cloud, double feelslikeC, double feelslikeF, double windchillC, double windchillF, double heatindexC, double heatindexF, double dewpointC, double dewpointF, int visKm, int visMiles, double uv, double gustMph, double gustKph, int willItRain, int chanceOfRain, int willItSnow, int chanceOfSnow, double shortRad, double diffRad, int dni, double gti) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
        this.lastUpdated = lastUpdated;
        this.tempC = tempC;
        this.tempF = tempF;
        this.isDay = isDay;
        this.condition = condition;
        this.windMph = windMph;
        this.windKph = windKph;
        this.windDegree = windDegree;
        this.windDir = windDir;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.precipMm = precipMm;
        this.precipIn = precipIn;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslikeC = feelslikeC;
        this.feelslikeF = feelslikeF;
        this.windchillC = windchillC;
        this.windchillF = windchillF;
        this.heatindexC = heatindexC;
        this.heatindexF = heatindexF;
        this.dewpointC = dewpointC;
        this.dewpointF = dewpointF;
        this.visKm = visKm;
        this.visMiles = visMiles;
        this.uv = uv;
        this.gustMph = gustMph;
        this.gustKph = gustKph;
        this.willItRain = willItRain;
        this.chanceOfRain = chanceOfRain;
        this.willItSnow = willItSnow;
        this.chanceOfSnow = chanceOfSnow;
        this.shortRad = shortRad;
        this.diffRad = diffRad;
        this.dni = dni;
        this.gti = gti;
    }

    public Current() {
    }

    public int getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public int getWindKph() {
        return windKph;
    }

    public void setWindKph(int windKph) {
        this.windKph = windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public int getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(int pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public int getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(int precipIn) {
        this.precipIn = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    public double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    public double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public int getVisKm() {
        return visKm;
    }

    public void setVisKm(int visKm) {
        this.visKm = visKm;
    }

    public int getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(int visMiles) {
        this.visMiles = visMiles;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getGustMph() {
        return gustMph;
    }

    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    public double getGustKph() {
        return gustKph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    public int getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    public int getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(int chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public int getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    public int getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(int chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public double getShortRad() {
        return shortRad;
    }

    public void setShortRad(double shortRad) {
        this.shortRad = shortRad;
    }

    public double getDiffRad() {
        return diffRad;
    }

    public void setDiffRad(double diffRad) {
        this.diffRad = diffRad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getGti() {
        return gti;
    }

    public void setGti(double gti) {
        this.gti = gti;
    }


}