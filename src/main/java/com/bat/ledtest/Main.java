package com.bat.ledtest;
import com.ba.ledlib.connector.LEDCommunicator;
import com.ba.ledlib.connector.LEDConnector;
import io.reactivex.disposables.CompositeDisposable;

import java.util.Scanner;

public class Main {
   private static final Scanner scanner = new Scanner(System.in);

    private static String data;
    public static void main(String[] args) {

        LEDCommunicator communicator = LEDConnector.builder()
                .portName("COM1")
                .build();


        communicator.displayMessage(1,"FRabbi");

        CompositeDisposable disposable = new CompositeDisposable();







//        led.writeToPortForReload("00000000001#001 R002 ",true);
//
//
//        try {
//            Thread.sleep(5_000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
       //led.writeToPortForReload("00000000001# 01 Aditto ",true);
//
//        led.disconnectFromSerialPort();



    }

    private void systemSleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


//    private void old(){
//        System.out.println("com.bat.ledtest.LED TEST");
//        System.out.println("---------------");
//        System.out.println();
//        CommunicationManager led = new CommunicationManager();
//        boolean status = led.connectToSerialPort("COM1");
//
//        if(status){
//            System.out.println();
//            System.out.println("com.bat.ledtest.LED connected..");
//
//        }
//
//        if(false)  {
//            String oldDeviceId = "2";
//            String configDeviceId = "15";
//            String counterNo = "1";
//            if(configDeviceId.length()<2){
//                configDeviceId = "0"+configDeviceId;
//            }
//
//            if(counterNo.length()<2){
//                counterNo = "0"+counterNo;
//            }
//
//            if(oldDeviceId.length()<2){
//                oldDeviceId = "0"+oldDeviceId;
//            }
//
//            String processSetting = "1"+oldDeviceId+"@@"+configDeviceId+"CC"+configDeviceId+"#0"+counterNo;
//            System.out.println(processSetting);
//            led.writeToPortForReload(processSetting,true);
//        }
//
//
//        if(true){
//
//            String processColor = "100@@00T102#0      ";
//            System.out.println("Process Color:: "+processColor);
//            //  led.writeToPortForReload(processColor,true);
//        }
//
//
//        new Main().systemSleep();
//
//        // 099@@99CC99#099
//        String token = "00000000002#001 1301";
//        // 001@@02M202#1 Welcome to Buisness Automation
//        String wc = "003@@01M101#1 Welcome  FRa";
//        String newT = "0000000001#1 Welcome  QPRO Service Test";
//        System.out.println("=============================");
//        int flag = scanner.nextInt();
//
//        switch (flag){
//            case 1:
//                led.writeToPortForReload(token,true);
//                break;
//            default: led.displayMessage("Welcome to my desk ", 1,1);
//        }
//
//    }
}