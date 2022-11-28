package com.bat.ledtest;

import com.ba.ledlib.connector.LEDCommunicator;
import com.ba.ledlib.connector.LEDConnector;

public class Main {

    public static void main(String[] args) {
        LEDCommunicator communicator = LEDConnector.builder()
                .portName("COM1")
                .connect();

        communicator.displayMessage(1,"Message  text");
        communicator.displayToken(1,1,"R002");

    }

    private void systemSleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}