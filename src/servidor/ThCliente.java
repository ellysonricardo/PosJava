package servidor;

import comum.controle.ControleComunicacao;
import controle.ControleCliente;
import java.io.IOException;
import java.net.Socket;
import modelo.Cliente;

public class ThCliente extends Thread {
    
    private Socket s;

    public ThCliente(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            ControleComunicacao c1 = new ControleComunicacao(s);
            ControleCliente cCliente = new ControleCliente();
            while(true){
                String comando = c1.receberTexto();
                if("P".equals(comando)){
                    cCliente.persistir((Cliente)c1.receberObjeto());
                    ControleCliente.armazenarDados();
                }
                if("R".equals(comando)){
                    cCliente.remover(c1.receberTexto());
                    ControleCliente.armazenarDados();
                }
                if("O".equals(comando)){
                    String cpf = c1.receberTexto();
                    c1.enviarObjeto(cCliente.obter(cpf));
                }
                if("T".equals(comando))
                    c1.enviarObjeto(cCliente.obterTodos());
            }
        } catch (Exception ex) {
        }
    }
    
}
