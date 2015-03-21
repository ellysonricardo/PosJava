package telas;

import controle.ControleCliente;
import modelo.Cliente;

public class TesteControle01 {

    public static void main(String[] args) {
        
        Cliente [] dados = {
            new Cliente("11111111","Pedro","Rua A","1111"),
            new Cliente("22222222","Ana","Rua B","1122"),
            new Cliente("33333333","Luiz","Rua C","2211"),    
            new Cliente("44444444","Beatriz","Rua D","2222")
        };
        ControleCliente cCliente = new ControleCliente();
        for(Cliente c: dados)
            cCliente.persistir(c);
        System.out.println("Primeira exibicao");
        for(Cliente c: cCliente.obterTodos())
            System.out.println(c.getNome());
        cCliente.remover("33333333");
        System.out.println("Segunda exibicao");
        for(Cliente c: cCliente.obterTodos())
            System.out.println(c.getNome());
        
        
        
        
        
    }
    
}
