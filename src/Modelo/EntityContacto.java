package Modelo;

import java.util.*;

// Mapea los Atributos de la tabla
//- Atributos
//- Get, set
//- Constructor vacio
//- toString
//- Constructor all

public class EntityContacto {
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private Date Fecha;
	private String Vinculo;
	private String Imagen;
	private double Id;

	@Override
	public String toString() {
		return "EntityContacto [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Telefono=" + Telefono + ", Fecha="
				+ Fecha + ", Vinculo=" + Vinculo + ", Imagen=" + Imagen + ", Id=" + Id + "]";
	}

	public EntityContacto(String nombre, String apellido, String telefono, Date fecha, String vinculo, String imagen,
			double id) {
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		Fecha = fecha;
		Vinculo = vinculo;
		Imagen = imagen;
		Id = id;
	}

	public EntityContacto() {
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getVinculo() {
		return Vinculo;
	}

	public void setVinculo(String vinculo) {
		Vinculo = vinculo;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public double getId() {
		return Id;
	}

	public void setId(double id) {
		Id = id;
	}
}
