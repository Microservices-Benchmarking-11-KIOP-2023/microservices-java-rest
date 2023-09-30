package pb.java.microservices.grpc.gateway.entity;

import lombok.Data;

@Data
public class Image {
    private String url;
    private Boolean isDefault;
}
