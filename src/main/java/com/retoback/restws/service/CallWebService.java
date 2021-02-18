package com.retoback.restws.service;

import com.retoback.restws.bo.PlaceHolder;
import com.retoback.restws.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CallWebService {

    @Autowired
    RestTemplate restTemplate;

    public PlaceHolder getPlaceHolderById(Integer placeHolderId){
        PlaceHolder placeHolder = null;
        ResponseEntity<PlaceHolder> response = restTemplate.getForEntity(Constant.ENDPOINT_PLACEHOLDER+"{id}",PlaceHolder.class,placeHolderId);
        placeHolder = response.getBody();
        System.out.println(placeHolder);
        return placeHolder;
    }

    public List<PlaceHolder> getPlaceHolderList(){
        List<PlaceHolder> placeHolderList = null;
        ResponseEntity<PlaceHolder[]> response = restTemplate.getForEntity(Constant.ENDPOINT_PLACEHOLDER, PlaceHolder[].class);
        placeHolderList = Arrays.asList(response.getBody());
        System.out.println(placeHolderList);
        return placeHolderList;
    }
    
}
