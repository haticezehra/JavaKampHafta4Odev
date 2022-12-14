package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController // Sen kontrollersin diyoruz.
@RequestMapping("/api/languages") // Adresleme //buraya böyle erişilsin.
public class LanguagesController {

	private LanguageService languageService;

	@Autowired // Parametresine bak
	public LanguagesController(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}

	@PutMapping("/update")
	public void update(int id, String name) throws Exception {
		languageService.update(id, name);
	}

	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		languageService.delete(id);
	}

	public Language getById(int id) throws Exception {
		return languageService.getById(id);
	}

}
