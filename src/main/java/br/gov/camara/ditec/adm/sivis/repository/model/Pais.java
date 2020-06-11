package br.gov.camara.ditec.adm.sivis.repository.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Tolerate;


@Table(name = "viw_Pais")
@Setter
@Builder
@EqualsAndHashCode(callSuper = false)
public class Pais {
	
	private static final long serialVersionUID = 3266550626196775059L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ide_pais")
	private Integer id;
	
	@Column(name = "nom_pais", length=100)
	private String namePais;
	
	@Column(name = "sig_pais_alfa2", length=2)
	private String siglaPais;
	
	@Column(name = "ind_ativo")
	private Boolean icAtivo;
	
	@Tolerate
	public Pais() {
		
	}

	public String getNamePais() {
		if(namePais.equals("ARGENTINA") || namePais.equals("PARAGUAI") || namePais.equals("URUGUAI") 
				|| namePais.equals("VENEZUELA")) {
			return	namePais.concat("(MERCOSUL)");
		}
		return namePais;
	}

	public Integer getId() {
		return id;
	}

	public String getSiglaPais() {
		return siglaPais;
	}

	public Boolean getIcAtivo() {
		return icAtivo;
	}

}
