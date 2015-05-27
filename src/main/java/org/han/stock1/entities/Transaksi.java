package org.han.stock1.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Transaksi {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String jenis;

	@OneToMany(mappedBy="transaksi", cascade = CascadeType.ALL)
    private Set<TransaksiBarang> transaksiBarangs;

	public Transaksi() {

	}

	public Transaksi(String jenis) {

		this.jenis = jenis;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public Set<TransaksiBarang> getTransaksiBarangs() {
		return transaksiBarangs;
	}

	public void setTransaksiBarangs(Set<TransaksiBarang> transaksiBarangs) {
		this.transaksiBarangs = transaksiBarangs;
	}

	@Override
	public String toString() {
		return "Transaksi [id=" + id + ", jenis=" + jenis
				+ ", transaksiBarangs=" + transaksiBarangs + "]";
	}

	
	
}
