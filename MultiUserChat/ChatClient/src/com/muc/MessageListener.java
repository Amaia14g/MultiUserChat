package com.muc;

/**
 * Opens the message interface
 */
public interface MessageListener {
    public void onMessage(String fromLogin, String msgBody);
}
