package org.han.stock1.controllers;


import java.util.Date;

import org.han.stock1.entities.Barang;
import org.han.stock1.entities.Transaksi;
import org.han.stock1.entities.TransaksiBarang;
import org.han.stock1.repositories.BarangRepository;
import org.han.stock1.repositories.TransaksiBarangRepository;
import org.han.stock1.repositories.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class TransaksiBarangControllers {

	@Autowired
	private TransaksiBarangRepository transaksiBarangRepository;
	
	@Autowired
	private BarangRepository barangRepository;
	
	@Autowired
	private TransaksiRepository transaksiRepository;
	
	@RequestMapping(value="/stock", method = RequestMethod.GET)
	public String ambilNamaStock(Model model){
	model.addAttribute("transaksi2", transaksiBarangRepository.findAll());
	return "stock/list";
	}
	
	@RequestMapping(value = "/stock", params = "tambah", method = RequestMethod.GET)
	public String inputNamaStock(Model model){
		model.addAttribute("barang2", barangRepository.findAll());
		model.addAttribute("transaksi2", transaksiRepository.findAll());
		return "stock/view";
	}
	
	@RequestMapping (value = "/stock", params = "tambah", method = RequestMethod.POST)
	public String tambahtransaksi(@RequestParam long b_id, @RequestParam long t_id, @RequestParam long quantity) {
		
		Barang barang = barangRepository.findOne(b_id);
		Transaksi transaksi = transaksiRepository.findOne(t_id);
		
		
		TransaksiBarang t = new TransaksiBarang(barang, transaksi, quantity);
		t = transaksiBarangRepository.save(t);
		
		return "redirect:stock";
	}
	
}
