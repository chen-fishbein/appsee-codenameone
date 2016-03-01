package com.codename1.appsee;

import com.appsee.*;


public class AppseeNativeImpl {
    
    public void start(String apiKey) {
        com.appsee.Appsee.start(apiKey);   
        com.appsee.Appsee.addAppseeListener(new com.appsee.AppseeListener() {
            @Override
            public void onAppseeSessionStarted(AppseeSessionStartInfo appseeSessionStartInfo) {
                Callback.onAppseeSessionStarted(appseeSessionStartInfo.getSessionId(), appseeSessionStartInfo.isVideoRecorded());
            }

            @Override
            public void onAppseeSessionEnded(AppseeSessionEndInfo appseeSessionEndInfo) {
                Callback.onAppseeSessionEnded(appseeSessionEndInfo.getSessionId());
                com.appsee.Appsee.removeAppseeListener(this);
            }

            @Override
            public void onAppseeScreenDetected(AppseeScreenInfo appseeScreenInfo) {

            }
        });        
    }

    public void resume() {
        com.appsee.Appsee.resume();     
    }

    public void stop() {
        com.appsee.Appsee.stop();     
    }

    public void setLocation(double lat, double longitude, float horizontalAccuracy, float verticalAccuracy) {
        com.appsee.Appsee.setLocation(lat, longitude, horizontalAccuracy, verticalAccuracy);
    }

    public void addEvent(String event) {
        com.appsee.Appsee.addEvent(event);
    }

    public void pause() {
        com.appsee.Appsee.pause();
    }

    public void setLocationDescription(String desc) {
        com.appsee.Appsee.setLocationDescription(desc);
    }

    public void setOptOutStatus(boolean status) {
        com.appsee.Appsee.setOptOutStatus(status);
    }

    public void stopAndUpload() {
        com.appsee.Appsee.stopAndUpload();     
    }

    public boolean getOptOutStatus() {
        return com.appsee.Appsee.getOptOutStatus();
    }

    public void startScreen(String screenName) {
        com.appsee.Appsee.startScreen(screenName);
    }

    public void setUserId(String userId) {
        com.appsee.Appsee.setUserId(userId);
    }

    public boolean isSupported() {
        return true;
    }

}
