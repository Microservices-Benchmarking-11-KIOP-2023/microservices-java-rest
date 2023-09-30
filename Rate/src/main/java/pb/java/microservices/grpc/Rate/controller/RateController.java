package pb.java.microservices.grpc.Rate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pb.java.microservices.grpc.Rate.entity.RatePlan;
import pb.java.microservices.grpc.Rate.entity.RequestDto;
import pb.java.microservices.grpc.Rate.service.RateService;

import java.util.List;

@RestController
public class RateController {

    @Autowired
    private RateService rateService;

    @PostMapping("getRates")
    public List<RatePlan> getRates(@RequestBody RequestDto request) {
        return rateService.getRates(request.getHotelIds(), request.getInDate(), request.getOutDate());
    }
}

