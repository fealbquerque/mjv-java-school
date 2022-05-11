package br.com.mjv.app;

import java.time.LocalDateTime;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.Endereco;
import br.com.mjv.model.TipoServico;
import br.com.mjv.service.Mensagem;

public class SistemaAguaLuz {
	public static void main(String[] args) {
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022,2,21,16,0));
		contrato.setProtocolo(2022025687);
		contrato.setValor(127.33);
		contrato.setTipoServico(TipoServico.AGUA);
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("Gleyson Sampaio");
		cadastro.setCpf("234.765.987-27");
		Endereco endereco = new Endereco();
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27.310-657");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		cadastro.setEndereco(endereco);
		
		
		
	    contrato.setCliente(cadastro); 
	    
	    
		
		
		Mensagem mensagem = new Mensagem();
		mensagem.gerarMensagem(contrato);
		
		
	}

}
