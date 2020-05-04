package datos;

import java.time.LocalDate;
import java.util.*;

public class Venta {
	private long idVenta;
	private Cliente cliente;
	private LocalDate fechaActual;
	private Empleado empleado;
	private Set<DetalleVenta> DetallesVenta;
	

	public Venta() {

	}

	public Venta(Cliente cliente, LocalDate fechaActual, Empleado empleado,
			Set<DetalleVenta> detallesVenta) {
		super();
		this.cliente = cliente;
		this.fechaActual = fechaActual;
		this.empleado = empleado;
		DetallesVenta = detallesVenta;
	}

	
	public long getIdVenta() {
		return idVenta;
	}

	protected void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", cliente=" + cliente + ", fechaActual="
				+ fechaActual + ", empleado=" + empleado + "]";
	}

	public Set<DetalleVenta> getDetallesVenta() {
		return DetallesVenta;
	}

	public void setDetallesVenta(Set<DetalleVenta> detallesVenta) {
		DetallesVenta = detallesVenta;
	}


}