package org.han.stock1.repositories;

import org.han.stock1.entities.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository<Transaksi, Long> {
	
}
