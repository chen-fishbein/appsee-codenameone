/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.appsee;

import com.codename1.ui.Display;

/**
 *
 * @author Chen
 */
public class Callback {
    
    private static AppseeListener l;

    public static void onAppseeSessionStarted(final String sessionId, final boolean videoRecorded){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onAppseeSessionStarted(sessionId, videoRecorded);
                }
            });
        }
    
    }

    public static void onAppseeSessionEnded(final String sessionId){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onAppseeSessionEnded(sessionId);
                }
            });
        }
    
    }
    
    static void setListener(AppseeListener listener){
        l = listener;
    }
    
}
