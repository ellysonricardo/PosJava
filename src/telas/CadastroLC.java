package telas;

import comum.controle.ControleTeclado;
import controle.ControleCliente;
import modelo.Cliente;

public class CadastroLC {

    public static void main(String[] args) throws Exception{
        ControleCliente cCliente = new ControleCliente();
        int opt = -1;
        while(opt!=0){
            System.out.println(
              "1-Inserir  2-Excluir  3-Alterar  4-Listar  0-Sair");
            opt = ControleTeclado.obterInteiro();
            if(opt==1){
                Cliente c1 = new Cliente();
                System.out.println("CPF:");
                c1.setCpf(ControleTeclado.obterTexto());
                System.out.println("Nome:");
                c1.setNome(ControleTeclado.obterTexto());
                System.out.println("Endereco:");
                c1.setEndereco(ControleTeclado.obterTexto());
                System.out.println("Telefone:");
                c1.setTelefone(ControleTeclado.obterTexto());
                cCliente.persistir(c1);
            }
            if(opt==2){
                System.out.println("CPF:");
                cCliente.remover(ControleTeclado.obterTexto());
            }
            if(opt==3){
                System.out.println("CPF:");
                String cpf = ControleTeclado.obterTexto();
                Cliente c1 = cCliente.obter(cpf);
                if(c1==null)
                    System.out.println("Não encontrado");
                else {
                    System.out.println("Nome("+c1.getNome()+"):");
                    c1.setNome(ControleTeclado.obterTexto());
                    System.out.println("Endereco("+c1.getEndereco()+"):");
                    c1.setEndereco(ControleTeclado.obterTexto());
                    System.out.println("Telefone("+c1.getTelefone()+"):");
                    c1.setTelefone(ControleTeclado.obterTexto());
                    cCliente.persistir(c1);
                }
            }
            if(opt==4){
                for(Cliente c:cCliente.obterTodos())
                    System.out.printf("\n%11s\t%20s\t%20s\t%20s", 
                            c.getCpf(),c.getNome(),c.getEndereco(),
                            c.getTelefone());
                System.out.println();
            }
        }
    }
    
}
