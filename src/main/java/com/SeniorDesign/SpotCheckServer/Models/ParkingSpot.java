package com.SeniorDesign.SpotCheckServer.Models;

import org.springframework.stereotype.Component;

@Component
public class ParkingSpot {
    private int spotId;
    private int floorNum;
    private int lotId;
    private boolean openFlag;

    public ParkingSpot() {
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public boolean isOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(boolean openFlag) {
        this.openFlag = openFlag;
    }
}