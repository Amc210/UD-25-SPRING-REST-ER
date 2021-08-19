package App.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Articulo")
public class Articulo {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;

	@ManyToOne
	@JoinColumn(name = "CodigoFabricante")
	private Fabricante CodigoFabricante;

	// Constructores
	public Articulo() {

	}

	public Articulo(Long id, String nombre, int precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	// Getters setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	// toString
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
