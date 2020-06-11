package br.gov.camara.ditec.adm.sivis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import br.gov.camara.ditec.adm.sivis.repository.model.Visitante;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Integer> 
//    ,RevisionRepository<Visitante, Integer, Integer>
{
}
