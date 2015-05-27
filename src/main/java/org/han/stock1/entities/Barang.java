package org.han.stock1.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Barang {
	
	@Id
	@GeneratedValue
	@Column(name="barang_id")
	private Long id;
	
	@Column
	private String partno;
	
	@Column
	private String partname;
	
	@OneToMany(mappedBy="barang", cascade = CascadeType.ALL)
    private Set<TransaksiBarang> transaksiBarangs;

	public Barang() {

	}

	public Barang(String partno, String partname) {
		super();
		this.partno = partno;
		this.partname = partname;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartname() {
		return partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public Set<TransaksiBarang> getTransaksiBarangs() {
		return transaksiBarangs;
	}

	public void setTransaksiBarangs(Set<TransaksiBarang> transaksiBarangs) {
		this.transaksiBarangs = transaksiBarangs;
	}

	@Override
	public String toString() {
		return "Barang [id=" + id + ", partno=" + partno + ", partname="
				+ partname + "]";
	}

}
