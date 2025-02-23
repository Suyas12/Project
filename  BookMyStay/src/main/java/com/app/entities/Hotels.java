package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;
    private String owner_name;
    private String hotel_name;
    
	@ManyToOne
	@JoinColumn(name = "location_id", referencedColumnName = "locationId")
	private Locations locations;
	
	@ManyToOne
	@JoinColumn(name = "room_id", referencedColumnName = "roomId")
	private Room room;

    public Hotels() {}

	public Hotels(String owner_name, String hotel_name, Locations locations, Room room) {
		this.owner_name = owner_name;
		this.hotel_name = hotel_name;
		this.locations = locations;
		this.room = room;
	}
    
	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Hotels [hotelId=" + hotelId + ", owner_name=" + owner_name + ", hotel_name=" + hotel_name
				+ ", locations=" + locations + ", room=" + room + "]";
	}

	

    
}

