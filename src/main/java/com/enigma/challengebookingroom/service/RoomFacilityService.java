package com.enigma.challengebookingroom.service;

import com.enigma.challengebookingroom.dto.request.RoomFacilityRequest;
import com.enigma.challengebookingroom.dto.response.RoomFacilityResponse;
import com.enigma.challengebookingroom.entity.RoomFacility;

public interface RoomFacilityService {
    RoomFacility createAndGet(RoomFacilityRequest updateRoomFacility);
    RoomFacility getById(String id);
    RoomFacility update(RoomFacilityRequest updateRoomFacility);
    void delete(String id);

    RoomFacilityResponse createAndGetResponse(RoomFacilityRequest updateRoomFacility);
    RoomFacilityResponse getByIdResponse(String id);
    RoomFacilityResponse updateResponse(RoomFacilityRequest updateRoomFacility);
}
