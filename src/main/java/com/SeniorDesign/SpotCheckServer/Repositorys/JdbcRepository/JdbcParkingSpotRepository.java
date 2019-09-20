package com.SeniorDesign.SpotCheckServer.Repositorys.JdbcRepository;

import com.SeniorDesign.SpotCheckServer.Models.ParkingSpot;
import com.SeniorDesign.SpotCheckServer.Repositorys.Mappers.ParkingSpotMapper;
import com.SeniorDesign.SpotCheckServer.Repositorys.ParkingSpotRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcParkingSpotRepository implements ParkingSpotRepository {

    private final String GET_PARKING_SPOT_BY_LOT_ID = "SELECT SpotId, FloorNum, LotId, OpenFlag from tSpot where LotId = ?";

    Logger log = LoggerFactory.getLogger(JdbcParkingSpotRepository.class);

    @Autowired
    private JdbcTemplate jdbctemplate;

    @Autowired
    private ParkingSpotMapper parkingLotMapper;
    @Override
    public List<ParkingSpot>  getParkingSpotsByLotId(int lotId) {
        try
        {
            List<ParkingSpot> spots =  jdbctemplate.query(GET_PARKING_SPOT_BY_LOT_ID, parkingLotMapper, lotId);
            return spots;
        }
        catch (Exception ex)
        {
            log.error("Error getting parking spots for lotId " + lotId);
            log.error(ex.getLocalizedMessage());
            return null;
        }

    }

    @Override
    public void updateParkingSpot(ParkingSpot spot)
    {

    }
}
