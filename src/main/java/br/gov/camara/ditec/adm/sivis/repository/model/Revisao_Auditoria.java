package br.gov.camara.ditec.adm.sivis.repository.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RevisionEntity
@NoArgsConstructor
public class Revisao_Auditoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ide_revisao_autitoria")
	@RevisionNumber
	private Integer id;
	
	@RevisionTimestamp
	@Column(name = "data_revisao")
	private Date dataRevisao;
	
	@Column(name = "ip_maquina_usuario")
	private String ipMaquinaUsuario;
	
	@Column(name = "cod_ponto_usuario")
	private String pontoUsuario;

}
