package pruebaSpring.pruebaSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebaSpring.pruebaSpring.repository.RepositoryDatos;
import pruebaSpring.pruebaSpring.modelos.*;

@Service
public class ServiceDatos {
	@Autowired
	private RepositoryDatos sampleRepository;
	
	public ServiceDatos(RepositoryDatos sampleRepository) {
		this.sampleRepository = sampleRepository;
	}
	
	public List<Dato> getDatos() {
		return sampleRepository.getDatos();
	}
	
	public Dato getDatoById(String id) {
		return sampleRepository.getDatoById(id);
	}
	
	public Dato postUser(String nombre){
		return sampleRepository.postUser(nombre);
	}
	
	public Dato deleteUser(String id) {
		return sampleRepository.deleteUser(id);
	}
}
