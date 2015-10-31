package Test;

import Modelo.*;

import java.util.Date;

import BaseDeDatos.BaseDeDatos;

public class TestDAO {
	public static void main(String [] args) {

		
		BaseDeDatos BD = new BaseDeDatos();
		EntityContacto contacto=new EntityContacto("Bri", "i", "12345", new Date(), "amigos", "c://124", 4);
		DAOContacto Dao = new DAOContacto(contacto, BD);
		
		//System.out.println(Dao.insertarContacto());
		//System.out.println(Dao.Actualizacion());
		//System.out.println(Dao.BorrarContacto());
		//System.out.println(Dao.selectApellido());
		System.out.println(Dao.selectNombre());
		
		System.out.println("");
	}

}
