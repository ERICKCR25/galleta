package com.practican3.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practican3.entidad.Galleta;
import com.practican3.repositorio.GalletaRepositorio;

@Service
public class GalletaServicioImpl implements GalletaServicio{

	@Autowired
	private GalletaRepositorio repo;
	
	@Override
	public Galleta insertaGalleta(Galleta obj) {
		return repo.save(obj);
	}

}
