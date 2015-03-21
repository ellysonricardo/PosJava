package telas;

import comum.controle.ControleComunicacao;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;

public class JFPrincipalRemota extends JFPrincipal {

    ControleComunicacao c2;

    protected void remover(String cpf) {
        try {
            c2.enviarTexto("R");
            c2.enviarTexto(cpf);
        } catch (IOException ex) {
        }
    }

    protected void persistir(Cliente c) {
        JDDados dados = new JDDados(this, true);
        dados.setDados(c);
        dados.setVisible(true);
        // Modal -> Fica parado aqui até a janela "sumir"
        if (dados.sucesso) {
            try {
                c2.enviarTexto("P");
                c2.enviarObjeto(dados.getDados());
            } catch (IOException ex) {
            }
        }
    }

    protected Cliente obter(String cpf) {
        try {
            c2.enviarTexto("O");
            c2.enviarTexto(cpf);
            return (Cliente) c2.receberObjeto();
        } catch (Exception ex) {
            return null;
        }
    }

    protected ArrayList<Cliente> obterTodos() {
        try {
            c2.enviarTexto("T");
            return (ArrayList<Cliente>) c2.receberObjeto();
        } catch (Exception ex) {
            return new ArrayList<Cliente>();
        }
    }

    protected void preActions() {
        try {
            Socket s2 = new Socket("127.0.0.1", 5050);
            c2 = new ControleComunicacao(s2);
        } catch (Exception ex) {
        }
    }

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipalRemota().setVisible(true);
            }
        });
    }

}
