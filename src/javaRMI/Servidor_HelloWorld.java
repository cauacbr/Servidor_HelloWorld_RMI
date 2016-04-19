/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaRMI;

import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author a1276310
 */
public class Servidor_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, UnknownHostException, AlreadyBoundException {
        int port = 55555;
        
        Registry referenciaServicoNomes = LocateRegistry.createRegistry(port);
        ServImpl serv = new ServImpl();        
        referenciaServicoNomes.bind("serv", serv);
    }

}
