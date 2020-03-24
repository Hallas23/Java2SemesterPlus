package app;

import java.io.IOException;
import java.util.Scanner;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Opgave6 {
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            	String broker = "tcp://192.168.1.1:1883";
            	MemoryPersistence persistence = new MemoryPersistence();
            	Scanner sc = new Scanner(System.in);
            	try {
                        MqttClient sampleClient = new MqttClient(broker,  MqttClient.generateClientId(), persistence);
                        MqttConnectOptions connOpts = new MqttConnectOptions();
                        connOpts.setCleanSession(true);
                        System.out.println("Connecting to broker: " + broker);
                        sampleClient.connect(connOpts);
                        System.out.println("Connected");           
                       	System.out.println("Indtast Content");
                        String content = sc.nextLine();
                        String topic = "cmnd/grp3254/Power1";
                        MqttMessage message = new MqttMessage();
                        message.setPayload(content.getBytes());
                        System.out.println(content.getBytes());
                        sampleClient.publish(topic, message);
                        System.out.println("Message published");
                        
                        sampleClient.disconnect();
                        System.out.println("Disconnected");
                        System.exit(0);
            	} catch (MqttException me) {
                        System.out.println("reason " + me.getReasonCode());
                        System.out.println("msg " + me.getMessage());
                        System.out.println("loc " + me.getLocalizedMessage());
                        System.out.println("cause " + me.getCause());
                        System.out.println("excep " + me);
                        me.printStackTrace();

            }
	}
}