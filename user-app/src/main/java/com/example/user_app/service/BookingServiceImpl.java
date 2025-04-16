package com.example.user_app.service;

import com.example.user_app.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class BookingServiceImpl implements BookingService{

    private final DiscoveryClient discoveryClient;
    private final RestClient restClient;

    @Autowired
    public BookingServiceImpl(
            DiscoveryClient discoveryClient,
            RestClient.Builder restClientBuilder)
    {
        this.discoveryClient = discoveryClient;
        restClient = restClientBuilder.build();
    }

    @Override
    public void sendToServer(Booking booking) {
        ServiceInstance serviceInstance = discoveryClient.getInstances("server").getFirst();
        // Make the POST request with proper headers and body
        restClient.post()
                .uri(serviceInstance.getUri() + "/bookings")
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                .body(booking)
                .retrieve()
                .toBodilessEntity();
    }
}
