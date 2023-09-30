package pb.java.microservices.grpc.gateway.entity;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    private List<Hotel> hotels;
}
