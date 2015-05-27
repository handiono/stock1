package org.han.stock1.controllers;

import org.han.stock1.entities.Barang;
import org.han.stock1.repositories.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class BarangControllers {

	@Autowired
	private BarangRepository barangRepository;
	
	@RequestMapping(value="/barang", method = RequestMethod.GET)
	public String ambilNamaBarang(Model model){
	model.addAttribute("barang2", barangRepository.findAll());
	return "barang/list";
	}
	
	@RequestMapping(value = "/barang", params = "tambah", method = RequestMethod.GET)
	public String inputNamaBarang(){
		return "barang/view";
	}
	
	@RequestMapping(value = "/barang", params = "ganti", method = RequestMethod.GET)
	public String gantiNamaBarang(@RequestParam long id, Model model){
		
		model.addAttribute("barang1", barangRepository.findOne(id));
		return "barang/edit";
	}
	
	
	@RequestMapping(value = "/barang", params = "ganti", method = RequestMethod.POST)
	public String postEditBarang(@RequestParam long id, @RequestParam String partno, 
			@RequestParam String partname) {
		
		Barang barangganti = barangRepository.findOne(id);
		barangganti.setPartname(partname);
		barangganti.setPartno(partno);
		barangRepository.save(barangganti);
		
		return "redirect:barang";
	}

	@RequestMapping(value = "/barang", params = "tambah", method = RequestMethod.POST)
	public String postHapusBarang(@RequestParam String partno, 
			@RequestParam String partname) {
		Barang barangbaru = new Barang(partno, partname);
		barangbaru = barangRepository.save(barangbaru);
		
		return "redirect:barang";
	}
	
	@RequestMapping(value = "/barang", params = "hapus", method = RequestMethod.POST)
	public String postTambahBarang(@RequestParam long id) {
		
		Barang baranghapus = barangRepository.findOne(id);
		barangRepository.delete(baranghapus);
		
		return "redirect:barang";
	}
	
}
