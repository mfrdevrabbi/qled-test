//
//package com.bat.ledtest.conmanager;
//
//import com.bat.ledtest.LED;
//import com.bat.splib.SerialPortConnectorV2;
//import io.reactivex.Single;
//import io.reactivex.disposables.CompositeDisposable;
//import io.reactivex.schedulers.Schedulers;
//import jssc.SerialPortException;
//
//import java.time.LocalDateTime;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// * @author FRabbi
// */
//public class CommunicationManager {
//    private final SerialPortConnectorV2 serialPort;
//    private boolean serialConnectionSuccessful = false;
//    OnSerialConnectListener listener;
//
//    private final CompositeDisposable disposables = new CompositeDisposable();
//
//    public interface OnSerialConnectListener {
//
//        void onAfterSerialConnect(boolean status);
//    }
//
//    public CommunicationManager() {
//        serialPort = SerialPortConnectorV2.getInstance();
//    }
//
//
//    public boolean connectToSerialPort(String portName) {
//        boolean connectStatus = false;
//        try {
//            serialPort.connect(portName);
//            connectStatus = true;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return connectStatus;
//    }
//
//    public void disconnectFromSerialPort() {
//        System.out.println("-------------disconnect-------------");
//        serialPort.disconnect();
//        serialConnectionSuccessful = false;
//    }
//
//
//    public void sendDataToLed(final String data) {
//        disposables.add(Single
//                .fromCallable(() -> {
//                    serialPort.writetoport(data);
//                    System.out.println(LocalDateTime.now() + ": Sending data to com.bat.ledtest.LED -> " + data + "\n");
//                    return "Write to port done";
//                })
//                .subscribeOn(Schedulers.io())
//                .subscribe(result -> System.out.println("" + result), error -> {
//                    error.printStackTrace();
//                }));
//    }
//
//    public void writeToPortForReload(final String data, boolean isReload) {
//        System.out.println("---------------------------------------");
//        int duration = 0;
//        if (isReload) {
//            duration = 2000;
//        } else {
//            duration = 500;
//        }
//
//        sendDataToLed(data);
//
//        try {
////                    Thread.sleep(500);
//            if (isReload) {
//                Thread.sleep(1000);
//            } else {
//                Thread.sleep(500);
//            }
//        } catch (Exception ex) {
//          //  java.util.logging.Logger.getLogger(ShowcaseLedUI.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        System.out.println("---------------------------------------");
//    }
//
//
//
//    public void displayMessage(String message,int oldId, int newId){
//
//        String dataCode;
//        dataCode = "10"+ oldId+"@@0"+newId+"M"+getColor(LED.Color.GREEN)+"02#1 "+message;
//        System.out.printf("AfterDataProcess:: "+dataCode);
//        writeToPortForReload(dataCode,true);
//    }
//
//    private String getColor(LED.Color color){
//        if (color.equals(LED.Color.RED)){
//            return "2";
//        }
//        return "1";
//    }
//
//}
