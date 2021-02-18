package com.retoback.restws.util;

import com.retoback.restws.bo.CustomPlaceHolder;
import com.retoback.restws.bo.PlaceHolder;

import java.util.ArrayList;
import java.util.List;

public class Transform {

    public Transform(){
    }

    public CustomPlaceHolder convertToCustom(PlaceHolder placeHolder){
        CustomPlaceHolder customPlaceHolder = new CustomPlaceHolder();
        customPlaceHolder.setPostId(placeHolder.getPostId());
        customPlaceHolder.setId(placeHolder.getId());
        customPlaceHolder.setEmail(placeHolder.getEmail());
        return customPlaceHolder;
    }

    public List<CustomPlaceHolder> convertToCustomList(List<PlaceHolder> placeHolderList){
        List<CustomPlaceHolder> customPlaceHolderList = new ArrayList<CustomPlaceHolder>();
        CustomPlaceHolder customPlaceHolder = null;
        for(PlaceHolder ph: placeHolderList){
            customPlaceHolder = new CustomPlaceHolder();
            customPlaceHolder.setPostId(ph.getPostId());
            customPlaceHolder.setId(ph.getId());
            customPlaceHolder.setEmail(ph.getEmail());
            customPlaceHolderList.add(customPlaceHolder);
        }
        return customPlaceHolderList;
    }

}
