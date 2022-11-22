package com.bat.ledtest;

import com.bat.splib.SerialPortConnectorV2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SerialPortConnectorV2 in = SerialPortConnectorV2.getInstance();
        System.out.println(in);

    }
}