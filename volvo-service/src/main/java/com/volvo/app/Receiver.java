package com.volvo.app;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(String  email) throws JAXBException {
    	final JAXBContext jaxbContext=JAXBContext.newInstance(User.class);
    	Unmarshaller  jaxbUnmarshaller=jaxbContext.createUnmarshaller();
		User user=(User) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(email.getBytes()));
    	
    }

}