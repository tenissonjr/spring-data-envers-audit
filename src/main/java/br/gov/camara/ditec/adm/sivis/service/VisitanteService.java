package br.gov.camara.ditec.adm.sivis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.ditec.adm.sivis.repository.VisitanteRepository;
import br.gov.camara.ditec.adm.sivis.repository.model.Visitante;

@Service
public class VisitanteService {
	
	@Autowired
    private VisitanteRepository repository;
    

    public Visitante saveVisitante(Visitante Visitante) {
        return repository.save(Visitante);
    }


    public Visitante updateVisitante( int id, String  nomeVisitante) {
        Visitante Visitante = repository.findById(id).get();
        Visitante.setNomeVisitante(nomeVisitante);
        
        return repository.save(Visitante);
    }


    public String deleteVisitante(int id) {
        repository.deleteById(id);
        return "Visitante deleted";
    }

    public void getInfo (int id){
        //System.out.println(repository.findLastChangeRevision(id));
    }

    public List<Visitante> listVisitantes(){
        return repository.findAll();
    }


	public Optional<Visitante> obterVisitante(int id) {
		return repository.findById(id);
	}
  
  

}
