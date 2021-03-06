package com.daniel.os.dataprovaider.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_tecnico")
public class TecnicoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nm_nome")
	private String nome;
	@Column(name = "nr_telefone")
	private String telefone;
	@Column(name = "nm_cargo")
	private String cargo;
	@Column(name = "nr_cpf")
	private String cpf;
	@Transient
	private List<DadosDeLoginEntity> dadosDeLogins;
	@Transient
	private List<OrdemServicoEntity> ordemServicos;

}
