package org.han.stock1.controllers;

import org.han.stock1.entities.Transaksi;
import org.han.stock1.repositories.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TransaksiControllers {

	@Autowired
	private TransaksiRepository transaksiRepository;
	
	@RequestMapping(value="/transaksi", method = RequestMethod.GET)
	public String ambilNamaTransaksi(Model model){
	model.addAttribute("transaksi2", transaksiRepository.findAll());
	return "transaksi/list";
	}
	
	@RequestMapping(value = "/transaksi", params = "tambah", method = RequestMethod.GET)
	public String inputNamaTransaksi(){
		return "transaksi/view";
	}
	
	@RequestMapping(value = "/transaksi", params = "ganti", method = RequestMethod.GET)
	public String gantiNamaTransaksi(@RequestParam long id, Model model){
		
		model.addAttribute("transaksi1", transaksiRepository.findOne(id));
		return "transaksi/edit";
	}
	
	
	@RequestMapping(value = "/transaksi", params = "ganti", method = RequestMethod.POST)
	public String postEditTransaksi(@RequestParam long id, @RequestParam String transaksi) {
		
		Transaksi transaksiganti = transaksiRepository.findOne(id);
		transaksiganti.setJenis(transaksi);
		transaksiRepository.save(transaksiganti);
		
		return "redirect:transaksi";
	}

	@RequestMapping(value = "/transaksi", params = "tambah", method = RequestMethod.POST)
	public String postHapusTransaksi(@RequestParam String transaksi) {
		Transaksi transaksibaru = new Transaksi(transaksi);
		transaksibaru = transaksiRepository.save(transaksibaru);
		
		return "redirect:transaksi";
	}
	
	@RequestMapping(value = "/transaksi", params = "hapus", method = RequestMethod.POST)
	public String postTambahTransaksi(@RequestParam long id) {
		
		Transaksi transaksihapus = transaksiRepository.findOne(id);
		transaksiRepository.delete(transaksihapus);
		
		return "redirect:transaksi";
	}
	
}
