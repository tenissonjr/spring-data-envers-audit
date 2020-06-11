package br.gov.camara.ditec.adm.sivis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.camara.ditec.adm.sivis.repository.model.Visitante;
import br.gov.camara.ditec.adm.sivis.service.VisitanteService;


@RestController
@RequestMapping(value = "/visitante")
public class VisitanteController {
	
    @Autowired
    private VisitanteService visitanteService;
    
    @GetMapping
    public List<Visitante> listVisitantes(){
        return visitanteService.listVisitantes() ;
    }
 
    @GetMapping("{id}")
    public ResponseEntity<Visitante> obterVisitantes(@PathVariable int id){
        Optional<Visitante> retorno = visitanteService.obterVisitante(id) ;
		
		return retorno.isPresent() ? 
					new ResponseEntity<Visitante>(retorno.get(), HttpStatus.OK)
				: 	new ResponseEntity<Visitante>( HttpStatus.NO_CONTENT);	
		
    }
   
    
    @PostMapping
    public ResponseEntity<Visitante> saveVisitante(@RequestBody Visitante visitante) {
    	
    	Visitante retorno = visitanteService.saveVisitante(visitante);
        
        return new ResponseEntity<Visitante>(retorno, HttpStatus.OK);
    }

    @PutMapping("{id}/{nomeVisitante}")
    public ResponseEntity<Visitante> updateVisitante(@PathVariable int id, @PathVariable String nomeVisitante) {
      
        
        Visitante retorno = visitanteService.updateVisitante(id,nomeVisitante);
      
        return new ResponseEntity<Visitante>(retorno, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Visitante> deleteVisitante(@PathVariable int id) {
        
    	visitanteService.deleteVisitante(id);
        
        return new ResponseEntity<>(HttpStatus.OK);
       
    }
    @GetMapping("/{id}/info")
    public void getInfo(@PathVariable  int id){
    	visitanteService.getInfo(id);
    }




}
