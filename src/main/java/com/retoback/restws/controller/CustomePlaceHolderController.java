package com.retoback.restws.controller;

import com.retoback.restws.bo.CustomPlaceHolder;
import com.retoback.restws.bo.PlaceHolder;
import com.retoback.restws.service.CallWebService;
import com.retoback.restws.util.Transform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomePlaceHolderController {

    private CallWebService callWebService;
    private Transform transform;

    @Autowired
    public void setCallWebService(CallWebService callWebService){
        this.callWebService = callWebService;
    }

    @Autowired
    public void setTransform(Transform transform){
        this.transform = transform;
    }

    @GetMapping("/customplaceholder")
    public List<CustomPlaceHolder> getCustomPlaceHolder(){
        List<PlaceHolder> placeHolderList = callWebService.getPlaceHolderList();
        List<CustomPlaceHolder> customPlaceHolderList = transform.convertToCustomList(placeHolderList);
        return customPlaceHolderList;
    }

    @GetMapping("/customplaceholder/{id}")
    public CustomPlaceHolder getCustomPlaceHolderById(@PathVariable("id") Integer id){
        PlaceHolder placeHolder = callWebService.getPlaceHolderById(id);
        CustomPlaceHolder customPlaceHolder = transform.convertToCustom(placeHolder);
        return customPlaceHolder;
    }

}
