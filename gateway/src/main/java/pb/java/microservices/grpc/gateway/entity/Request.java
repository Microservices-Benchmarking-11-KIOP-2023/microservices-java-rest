package pb.java.microservices.grpc.gateway.entity;

import lombok.Data;

import java.util.List;

@Data
public class Request {
    private List<String> hotelIds;
}
