package com.example;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.example.rmi.Adder;

public class Client {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		
		Registry registry = LocateRegistry.getRegistry();
		Adder adder = (Adder)registry.lookup("Adder");
		System.out.println(adder.add(5, 8));	

	}

}
