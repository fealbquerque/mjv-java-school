package br.com.mjv.service;

import java.time.format.DateTimeFormatter;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;

public class Mensagem {
public void gerarMensagem(Contrato contrato) {
	StringBuilder m = new StringBuilder();
	Cadastro cliente = contrato.getCliente();
	m.append("Senhor(a) "+cliente.getNome()+" cpf de número "+cliente.getCpf());
	m.append(String.format(", Informamos que estamos de acordo com o protocolo de número %d ", contrato.getProtocolo()));
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm");
	String data = contrato.getDataHora().format(formatoData);
	
	m.append(String.format(" está agendado para a data\\hora %sh a do serviço ", data));
	m.append(String.format("de %s com taxa de valor R R$ %f em sua residência"
			+ " localizada no endereço abaixo: ",contrato.getTipoServico().getDescricao() ,contrato.getValor()));
	m.append(String.format("\nLogradouro: %s, %s", cliente.getEndereco().getLogradouro(), cliente.getEndereco().getNumero()));
	m.append(String.format("\nComplemento: %s "
			+ "", cliente.getEndereco().getComplemento()));
	m.append(String.format("\nBairro: %s"
			+ "", cliente.getEndereco().getBairro()));
	m.append(String.format("\nCidade: %s/%s"
			+ "", cliente.getEndereco().getCidade(),cliente.getEndereco().getEstado()));
	m.append(String.format("\nCEP: %s", cliente.getEndereco().getCep()));
	
	
	
	
	
	
	
	
	System.out.println(m.toString());
	
	
}
}
