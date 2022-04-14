package br.com.quintinodigital.sisgefinapi.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONTA_BANCARIA")
public class ContaBancariaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA_INSTITUICAO_FINANCEIRA")
	private PessoaEntity pessoaInstituicaoFinanceira;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA_RESPONSAVEL_CONTA_BANCARIA")
	private PessoaEntity pessoaResponsavelContaBancaria;
	
	@Column(name = "NUMERO_AGENCIA", nullable = false)
	private String numeroAgencia;
	
	@Column(name = "NUMERO_CONTA", nullable = false)
	private String numeroConta;
	
	@Column(name = "SALDO_INICIAL", nullable = false)
	private Double saldoInicial;
	
	@OneToOne
	@JoinColumn(name = "ID_TIPO_CONTA_BANCARIA")
	private TipoContaBancariaEntity tipoContaBancariaEntity;
	
	@Column(name = "IS_ATIVO", nullable = false)
	private Boolean isAtivo;
	
	public ContaBancariaEntity() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public PessoaEntity getPessoaInstituicaoFinanceira() {
		return pessoaInstituicaoFinanceira;
	}

	public void setPessoaInstituicaoFinanceira(PessoaEntity pessoaInstituicaoFinanceira) {
		this.pessoaInstituicaoFinanceira = pessoaInstituicaoFinanceira;
	}

	public PessoaEntity getPessoaResponsavelContaBancaria() {
		return pessoaResponsavelContaBancaria;
	}

	public void setPessoaResponsavelContaBancaria(PessoaEntity pessoaResponsavelContaBancaria) {
		this.pessoaResponsavelContaBancaria = pessoaResponsavelContaBancaria;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public TipoContaBancariaEntity getTipoContaBancariaEntity() {
		return tipoContaBancariaEntity;
	}

	public void setTipoContaBancariaEntity(TipoContaBancariaEntity tipoContaBancariaEntity) {
		this.tipoContaBancariaEntity = tipoContaBancariaEntity;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancariaEntity other = (ContaBancariaEntity) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
