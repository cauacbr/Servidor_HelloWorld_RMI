/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author a1276310
 */
public class ServImpl extends UnicastRemoteObject implements InterfaceServ {
    
    ServImpl() throws RemoteException {
    }

    @Override
    public void chamar(String nomeCliente, InterfaceCli refCliente) throws RemoteException {
        refCliente.echo(nomeCliente);
    }
    
}
