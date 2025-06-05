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
@Table(name = "tbl_dentista")
@DynamicInsert

public class DentistaGabrielSG {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dentista")
	private int idDentista;
	
	@Column(name = "cop", nullable = false)
	private String cop;
	
	@Column(name = "nombre_completo", nullable = false)
	private String nombreCompleto;
	
	@Column(name = "fecha_inicio_contrato", nullable = false)
	private LocalDate fechaInicioContrato;
	
	@Column(name = "turno", nullable = false)
	private String turno;
	
	@Column(name = "correo", nullable = false)
	private String correo;
	
	@Column(name = "id_especialidad", nullable = false)
	private int idEspecialidad;

	public int getIdDentista() {
		return idDentista;
	}

	public void setIdDentista(int idDentista) {
		this.idDentista = idDentista;
	}

	public String getCop() {
		return cop;
	}

	public void setCop(String cop) {
		this.cop = cop;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public LocalDate getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(LocalDate fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
}
