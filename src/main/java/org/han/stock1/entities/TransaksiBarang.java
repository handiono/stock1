package org.han.stock1.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TransaksiBarang {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "barang_id")
	private Barang barang;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="transaksi_id")
	private Transaksi transaksi;
	
	@Column
	private Long quantity;
	
	@Column
	//@Temporal(TemporalType.DATE)
	private Date tanggal;
	
	 @PrePersist
	  protected void onCreate() {
	    tanggal = new Date();
	  }

	public TransaksiBarang() {

	}

	public TransaksiBarang(Barang barang, Transaksi transaksi, Long quantity) {
		super();
		this.barang = barang;
		this.transaksi = transaksi;
		this.quantity = quantity;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
	}

	public Transaksi getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(Transaksi transaksi) {
		this.transaksi = transaksi;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}

	@Override
	public String toString() {
		return "TransaksiBarang [id=" + id + ", barang=" + barang
				+ ", transaksi=" + transaksi + ", quantity=" + quantity
				+ ", tanggal=" + tanggal + "]";
	}
	
	
}
