package pruebaSpring.pruebaSpring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pruebaSpring.pruebaSpring.mapper.MapperDatos;
import pruebaSpring.pruebaSpring.modelos.*;

@Repository
public class RepositoryDatos {
	
	@Autowired
	private MapperDatos sampleMapper;
	public RepositoryDatos(MapperDatos sampleMapper) {
		this.sampleMapper = sampleMapper;
	}
	
	public List<Dato> getDatos() {
		return sampleMapper.getDatos();
	}
	
	public Dato getDatoById(String id) {
		Dato d = sampleMapper.getDatoById(id);
		if(d == null)
		{
			return new Dato(-1, "no existe");
		}
		return d;
	}
	
	public Dato postUser(String nombre) {
		System.out.println("RESULATDO ");
		sampleMapper.postUser(nombre);
		
		return new Dato(-2, nombre);
	}
	
	public Dato deleteUser(String id) {
		sampleMapper.deleteUser(id);
		
		return new Dato(-2, id);
	}

}
