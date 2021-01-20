package edu.miu.cs.cs401.project.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.miu.cs.cs401.project.domain.Address;
import edu.miu.cs.cs401.project.domain.Agent;
import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Crew;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.FlightInstance;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Pilot;
import edu.miu.cs.cs401.project.domain.Reservation;

public class ReservationSystemRepositoryImpl implements ReservationSystemRepository {
	
	// Added class variables by Orgil
	private List <Airport> airports = new ArrayList<>();
	private Map<Integer, Passenger> passengers = new HashMap<>();
	private Map<String, Airline> airlines= new HashMap<>();
    private List <FlightInstance> allFlight = new ArrayList<>();

    private Map<Integer, Pilot> pilots= new HashMap<>();
	private Map<Integer, Crew> crews= new HashMap<>();
	private Map<Integer, Agent> agents= new HashMap<>();
	
	// added constructor by Orgil
	// setupAirports() setupPassengers() setupAgents() will work on 
	// instantiation of ReservationSystemRepositoryImpl class
	public ReservationSystemRepositoryImpl() throws Exception {
		super();
		setupAirports();
		setupPassengers();
		setupAgents();
	}
	
	private void setupAirports() {
		

		
	}

	@Override
	public List<Airport> findAllAirports() {
		return airports.values();
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		for(Airport airport : findAllAirports()) {
			if(airport.getCode().equalsIgnoreCase(airportCode)) {
				return airport;
			}
		}
		return null;
	}

	@Override
	public List<Airport> findAirportsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airline> findAirlinesByAirportCode(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> findFlightsFromTo(String departure, String arrival) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findReservationsByPassengerId(Integer passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> findPassengersByAgentCode(String agentCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
