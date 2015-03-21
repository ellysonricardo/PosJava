package servidor;

import controle.ControleCliente;
import java.net.ServerSocket;

public class ServidorClientes {

    public static void main(String[] args) throws Exception{
        ControleCliente.carregarDados();
        ServerSocket s0 = new ServerSocket(5050);
        while(true)
            new ThCliente(s0.accept()).start();
    }
    
}
