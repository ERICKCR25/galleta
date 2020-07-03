package com.practican3.controlador;


import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practican3.entidad.*;
import com.practican3.servicio.*;

@Controller
public class GalletaController {
	
	private GalletaServicio galletaservicio;
	private CategoriaServicio categoriaservicio;
	
	
	@RequestMapping("/verRegistroGalleta")
	public String verRegGalleta() {		
		return "registraGalleta";
	}
	
	@RequestMapping("/registraGalleta")
	public String registrarGalleta(Galleta obj,HttpSession session) {		
		Galleta objRep=galletaservicio.insertaGalleta(obj);
		if(objRep==null) {
			session.setAttribute("MENSAJE", "Registro Erróneo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitoso");
		}
		return "registraGalleta";
	}
	
	
	@ResponseBody
	@RequestMapping("/cargaCategoria")
	public List<Categoria> cargaComboCategoria() {
		return categoriaservicio.listarTodos();
	}
	
	
	
}
