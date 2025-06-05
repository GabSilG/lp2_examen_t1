package model;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "tbl_equipo_dental")
@DynamicInsert

public class EquipoDentalGabrielSG {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo")
	private int nroEquipo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "costo", nullable = false)
	private Double costo;
	
	@Column(name = "fecha_adquisicion", nullable = false)
	private LocalDate fechaAdquisicion;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "id_dentista", nullable = false)
	private String idDentista;

	public int getNroEquipo() {
		return nroEquipo;
	}

	public void setNroEquipo(int nroEquipo) {
		this.nroEquipo = nroEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdDentista() {
		return idDentista;
	}

	public void setIdDentista(String idDentista) {
		this.idDentista = idDentista;
	}
	
}
