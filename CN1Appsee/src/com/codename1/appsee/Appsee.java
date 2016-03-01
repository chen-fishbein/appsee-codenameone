/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.appsee;

import com.codename1.system.NativeLookup;

/**
 *
 * @author Chen
 */
public class Appsee {

    private AppseeNative appseeNative;
    
    private static Appsee instance;
    
    private Appsee() {
        appseeNative = (AppseeNative) NativeLookup.create(AppseeNative.class);
    }
    
    public static Appsee getInstance(){
        if(instance == null){
            instance = new Appsee();
        }
        return instance;
    }

    /**
     * Starts the Appsee agent for tracking the current session's data.
     */ 
    public void start(String apiKey){
        if(appseeNative != null){
            appseeNative.start(apiKey);
        }
    }
    
    public void stop(){
        if(appseeNative != null){
            appseeNative.stop();
        }    
    }
    
    public void stopAndUpload(){
        if(appseeNative != null){
            appseeNative.stopAndUpload();
        }        
    }
    
    public void pause(){
        if(appseeNative != null){
            appseeNative.pause();
        }            
    }
    
    public void resume(){
        if(appseeNative != null){
            appseeNative.resume();
        }            
    }
    
    public void addEvent(String eventName){
        if(appseeNative != null){
            appseeNative.addEvent(eventName);
        }                
    }
    
    public void startScreen(String screenName){
        if(appseeNative != null){
            appseeNative.startScreen(screenName);
        }                
    }
    
    public void setUserId(String userId){
        if(appseeNative != null){
            appseeNative.setUserId(userId);
        }                
    }
    
    public void setLocation(double latitude, double longitude, float horizontalAccuracy, float verticalAccuracy){
        if(appseeNative != null){
            appseeNative.setLocation(latitude, longitude, horizontalAccuracy, verticalAccuracy);
        }                
    }
    
    public void setLocationDescription(String description){
        if(appseeNative != null){
            appseeNative.setLocationDescription(description);
        }                
    }
    
    public void setOptOutStatus(boolean status){
        if(appseeNative != null){
            appseeNative.setOptOutStatus(status);
        }                
    }
    
    public boolean getOptOutStatus(){
        if(appseeNative != null){
            return appseeNative.getOptOutStatus();
        }          
        return false;
    }
    
    
    public void setAppseeListener(AppseeListener l){
        Callback.setListener(l);
    }

}
