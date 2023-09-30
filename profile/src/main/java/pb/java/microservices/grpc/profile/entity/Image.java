package pb.java.microservices.grpc.profile.entity;


import lombok.Data;

@Data
public class Image {
    private String url;
    private Boolean isDefault;
}
