package Modelo;

import java.text.SimpleDateFormat;

//Genera toda la sintaxis SQL

import BaseDeDatos.BaseDeDatos;


public class DAOContacto {
	private EntityContacto entityContacto;
	private BaseDeDatos basededatos;
	private SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");

	public DAOContacto() {
	}

	public DAOContacto(EntityContacto entityContacto, BaseDeDatos basededatos) {		
		this.entityContacto = entityContacto;
		this.basededatos = basededatos;
	}
	
	public String selectNombre(){
		String sql="select * from contacto where Nombre like '%"+entityContacto.getNombre()+"%'";
		System.out.println(sql);
		return basededatos.getTablaHTML(sql);
	}
	
	public String selectApellido(){
		String sql="select * from contacto where Apellido like '%"+entityContacto.getApellido()+"%'";
		return basededatos.getTablaHTML(sql);
	}
	
	public String selectTelefono(){
		String sql="select * from contacto where Telefono like '%"+entityContacto.getTelefono()+"%'";
		return basededatos.getTablaHTML(sql);
	}
	
	public String selectFecha(){
		String sql="select * from contacto where Fecha_de_nacimient like '%"+entityContacto.getFecha()+"%'";
		return basededatos.getTablaHTML(sql);
	}
	
	public String selectViculo(){
		String sql="select * from contacto where Vinculo like '%"+entityContacto.getVinculo()+"%'";
		return basededatos.getTablaHTML(sql);
	}
	
	public String selectImagen(){
		String sql="select * from contacto where Imagen like '%"+entityContacto.getImagen()+"%'";
		return basededatos.getTablaHTML(sql);
	}
	
	public String selectId(){
		String sql="select * from contacto where Id like '%"+entityContacto.getId()+"%'";
		return basededatos.getTablaHTML(sql);
	}
	
	public String insertarContacto(){
		String sql = "INSERT INTO contacto(Nombre,Apellido,Telefono,Fecha_de_nacimiento,Vinculo,Imagen,Id) " 
				+ "VALUES ('" + entityContacto.getNombre() + "'," + "'" + entityContacto.getApellido() + "'," 
				+ "'" + entityContacto.getTelefono() + "','" + formato.format(entityContacto.getFecha()) + "'," 
				+ "'" + entityContacto.getVinculo() + "'," + "'" + entityContacto.getImagen() + "'," 
				+ entityContacto.getId() + ")";
		
		System.out.println(sql);
		if (basededatos.ejecutarActualizacionSQL(sql))
			return "Si pudo insertar";
		else
			return "No pudo insertar";
	}
	
	public String Actualizacion(){
		String sql = "UPDATE contacto " 
				+ "SET  Nombre='" + entityContacto.getNombre() + "'," + "Apellido='" + entityContacto.getApellido() + "'," 
				+ "Telefono='" + entityContacto.getTelefono() + "'," + "Fecha_de_Nacimiento='" + formato.format(entityContacto.getFecha()) + "'," 
				+ "Vinculo='" + entityContacto.getVinculo() + "'," + "Imagen='" + entityContacto.getImagen() +"' "
				+ " WHERE Id=" + entityContacto.getId();
		System.out.println(sql);
		if (basededatos.ejecutarActualizacionSQL(sql))
			return "Si pudo actualizar";
		else
			return "No pudo actualizar";
		
	}
	
	public String BorrarContacto(){
		String sql = "DELETE FROM contacto WHERE Id=" + entityContacto.getId();

		if (basededatos.ejecutarActualizacionSQL(sql))
			return "Si pudo eliminar";
		else
			return "No pudo eliminar";
	}
}
