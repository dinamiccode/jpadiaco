package oc.model.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="codigo_departamento")
	private int codigo_departamento;
	@Column(name="nombre_departamento")
	private String nombre_departamento;
	@Column(name="habilitado")
	private String habilitado;
	
	public departamento() {

	}
	public int getCodigo_departamento() {
		return codigo_departamento;
	}
	public void setCodigo_departamento(int codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}
	public String getNombre_departamento() {
		return nombre_departamento;
	}
	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	@Override
	public String toString() {
		return this.nombre_departamento;
	}
	
	
	
	
}
