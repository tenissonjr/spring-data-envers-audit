package br.gov.camara.ditec.adm.sivis.repository.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Table(name = "Foto_Visitante")
@Builder
@Getter
@Setter
@EqualsAndHashCode(callSuper=false)

public class FotoVisitante {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ide_foto_visitante")
    private Integer id;

    @Column(name = "dat_foto")
    private LocalDate dataFoto;

    @Column(name = "img_foto", unique = true, nullable = true)
    private String imagemFoto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ide_visitante")
    private Visitante visitante;
	
	
}
