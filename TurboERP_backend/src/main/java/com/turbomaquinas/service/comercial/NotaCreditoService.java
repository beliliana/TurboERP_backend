package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DocumentoAplicarNotasCredito;
import com.turbomaquinas.POJO.comercial.NotaCredito;
import com.turbomaquinas.POJO.comercial.NotaCreditoVista;

public interface NotaCreditoService {

	public NotaCreditoVista crearNotasCredito(DocumentoAplicarNotasCredito doc);
	public void actualizar(NotaCredito nc);
	public NotaCreditoVista buscar(int id);
	public List<NotaCreditoVista> consultar();
	
	

}
