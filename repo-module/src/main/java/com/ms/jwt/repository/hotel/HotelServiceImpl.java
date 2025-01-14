package com.ms.jwt.repository.hotel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.ms.jwt.modelshotel.Hotel;



@Repository
public interface HotelServiceImpl extends JpaRepository<Hotel, Long> {
	
	//Hotel save(Hotel hotel);

	List<Hotel> findByDestinationId(Long destinationId);

	List<Hotel> findByDestinationIdAndRating(Long destinationId, String rating);

}
