package br.com.mjv.model;

import java.time.LocalDateTime;

public class Contrato {
	@Override
	public String toString() {
		return "Contrato [cliente=" + cliente + ", protocolo=" + protocolo + ", valor=" + valor + ", dataHora="
				+ dataHora + ", tipoServico=" + tipoServico + "]";
	}
	private Cadastro cliente;
	private Integer protocolo;
	private Double valor;
	private LocalDateTime dataHora;
	private TipoServico tipoServico;
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public Integer getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	

}
