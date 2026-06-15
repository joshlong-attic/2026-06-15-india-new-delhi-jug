package com.example.adoptions.dogs;


import org.springframework.modulith.events.Externalized;

//@Externalized("messageChannelName")
public record DogAdoptedEvent(int dogId) {
}
