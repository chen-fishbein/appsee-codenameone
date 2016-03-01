/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.appsee;

import com.codename1.system.NativeInterface;

/**
 *
 * @author Chen
 */
public interface AppseeNative extends NativeInterface{
    
    /**
     * Starts the Appsee agent for tracking the current session's data.
     */ 
    public void start(String apiKey);
    
    public void stop();
    
    public void stopAndUpload();
    
    public void pause();
    
    public void resume();
    
    public void addEvent(String eventName);
    
    public void startScreen(String screenName);
    
    public void setUserId(String userId);
    
    public void setLocation(double latitude, double longitude, float horizontalAccuracy, float verticalAccuracy);
    
    public void setLocationDescription(String description);
    
    public void setOptOutStatus(boolean status);
    
    public boolean getOptOutStatus();
}
