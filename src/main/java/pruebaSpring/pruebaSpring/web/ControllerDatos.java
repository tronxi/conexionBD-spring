package pruebaSpring.pruebaSpring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pruebaSpring.pruebaSpring.service.ServiceDatos;
import pruebaSpring.pruebaSpring.modelos.*;

@RestController
public class ControllerDatos {
	
	@Autowired
	private ServiceDatos sampleService;
	
	public ControllerDatos (ServiceDatos sampleService) {
		this.sampleService = sampleService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/dato/{id}", method = RequestMethod.GET)
	public Dato welcome(@PathVariable("id") String id) {
		return sampleService.getDatoById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicio() {
		return "Servidor funcionando";
	}
	
	@RequestMapping(value = "/dato", method = RequestMethod.GET)
	public List<Dato> dato() {
		return sampleService.getDatos();
	}

}
