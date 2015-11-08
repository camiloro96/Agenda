package Servicio;

import java.util.Date;

import BaseDeDatos.BaseDeDatos;
import Modelo.DAOContacto;
import Modelo.EntityContacto;

public class ServicioContacto {
	private BaseDeDatos BasedeDatosService;
	private DAOContacto DAO;
		
	
	public BaseDeDatos getBasedeDatos() {
		return BasedeDatosService;
	}
	

	public void setBasedeDatos(BaseDeDatos basedeDatos) {
		BasedeDatosService = basedeDatos;
	}

	public ServicioContacto(BaseDeDatos basedeDatos) {
		BasedeDatosService = basedeDatos;
	}

	public ServicioContacto() {
	}
	
	public String Insertar(String nombre, String apellido, String telefono, String fecha, String vinculo, String imagen,
			String id){
		EntityContacto Contacto = new EntityContacto(nombre, apellido, telefono, new Date (fecha), vinculo, imagen, Double.parseDouble(id));
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.insertarContacto();
		
	}
	
	public String Actualizar(String nombre, String apellido, String telefono, String fecha, String vinculo, String imagen, String id){
		EntityContacto Contacto = new EntityContacto(nombre, apellido, telefono, new Date (fecha), vinculo, imagen, Double.parseDouble(id));
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.Actualizacion();
	}
	
	public String Borrar(String nombre, String apellido, String telefono, String fecha, String vinculo, String imagen, String id){
		EntityContacto Contacto = new EntityContacto(nombre, apellido, telefono, new Date (fecha), vinculo, imagen, Double.parseDouble(id));
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.BorrarContacto();
	}
	
	public String selectNombre(String nombre){
		EntityContacto Contacto = new EntityContacto();
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.selectNombre();
	}
	
	public String selectApellido(String apellido){
		EntityContacto Contacto = new EntityContacto();
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.selectApellido();
	}
	
	public String selectTelefono(String telefono){
		EntityContacto Contacto = new EntityContacto();
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.selectTelefono();
	}
	
	public String selectFecha(String fecha){
		EntityContacto Contacto = new EntityContacto();
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.selectFecha();
	}
	
	public String selectVinculo(String vinculo){
		EntityContacto Contacto = new EntityContacto();
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.selectViculo();
	}
	
	public String selectId(String id){
		EntityContacto Contacto = new EntityContacto();
		DAO = new DAOContacto(Contacto, BasedeDatosService);
		return DAO.selectId();
	}
}
