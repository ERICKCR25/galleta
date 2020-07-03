package com.practican3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practican3.entidad.Categoria;
import com.practican3.repositorio.CategoriaRepositorio;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {

	@Autowired
	private CategoriaRepositorio repo;
	
	@Override
	public List<Categoria> listarTodos() {
		
		return repo.findAll();
	}

}
