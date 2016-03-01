/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.appsee;

/**
 *
 * @author Chen
 */
public interface AppseeListener {

    public void onAppseeSessionStarted(String sessionId, boolean videoRecorded);

    public void onAppseeSessionEnded(String sessionId);

}
