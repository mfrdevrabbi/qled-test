package com.bat.ledtest;

import com.bat.ledtest.conmanager.CommunicationManager;

import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

    private static String data;
    public static void main(String[] args) {
        System.out.println("com.bat.ledtest.LED TEST");
        System.out.println("---------------");
        System.out.println();
        CommunicationManager led = new CommunicationManager();
        boolean status = led.connectToSerialPort("COM1");

        if(status){
            System.out.println();
            System.out.println("com.bat.ledtest.LED connected..");

        }

        String token = "00000000099#001 R001 ";
       // 001@@02M202#1 Welcome to Buisness Automation
        String wc = "003@@01M101#1 Welcome  FRa";
        String newT = "00000000099#1 Welcome  QPRO Service Test";
        System.out.println("=============================");
        int flag = scanner.nextInt();

        switch (flag){
            case 1:
                led.writeToPortForReload(newT,true);
                break;
            default: led.displayMessage("Welcome to my desk ", 1,1);
        }















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
}