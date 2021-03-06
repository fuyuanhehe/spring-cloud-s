package com.example.consumer.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.consumer.server.HelloRemoteHystrix;


@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
	
    @RequestMapping(value = "/hello")
     String hello(@RequestParam(value = "name") String name);
}