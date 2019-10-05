package com.SeniorDesign.SpotCheckServer.Controllers;

import com.SeniorDesign.SpotCheckServer.Models.ParkingLot;
import com.SeniorDesign.SpotCheckServer.Models.ParkingLots;
import com.SeniorDesign.SpotCheckServer.Services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("parkingLot")
public class ParkingLotController
{
    @Autowired
    ParkingLotService parkingLotService;
    @Autowired
    ParkingLots parkingLots;

    @RequestMapping(value = "getParkingLots", method = RequestMethod.GET)
    @ResponseBody
    public ParkingLots getParkingLots()
    {
        parkingLots = parkingLotService.getAllParkingLots();
        return parkingLots;
    }

    //This method returns the exact same data as getParkingLot but in a better format for swift to parse in our iOS app
    @RequestMapping(value = "getParkingLotsIOS", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getParkingLotsIOS()
    {
        return parkingLotService.getAllParkingLotsIOS();
    }

}

