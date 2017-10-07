package com.udea.registro_actividades.dao;



import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import com.udea.registro_actividades.modelo.Cursos;

//con Spring Data JPA una entidad DAO que extienda de CrudRepository 
// obtiene por defecto los siguientes metodos save, delete, deleteAll, findOne y findAll.
@Transactional
public interface CursoDAO extends CrudRepository<Cursos, Integer> {
	
	// No es necesario implementar el metodo, spring jpa lo hace  siempre y cuando
	// el nombre del parametro coincida con un atributo de curso
	// para mas detalles ver:
	// http://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	public Cursos findById(Integer id);
	

}

