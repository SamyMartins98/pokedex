package com.pokedex.reactiveweb.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonEvent {
	
	private Long eventId;
	private String eventType;
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonEvent other = (PokemonEvent) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "PokemonEvent [eventId=" + eventId + ", eventType=" + eventType + "]";
	}

	public PokemonEvent(Long eventId, String eventType) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
	}
	
	

}
