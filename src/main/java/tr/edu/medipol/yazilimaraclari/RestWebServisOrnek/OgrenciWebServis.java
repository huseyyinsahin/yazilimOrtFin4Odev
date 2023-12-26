package tr.edu.medipol.yazilimaraclari.RestWebServisOrnek;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServis {
	
	public record Ogrenci(String adSoyad, String numara) {};

	private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();

	static {
		OGRENCI_LISTESI.add(new Ogrenci("Ali Veli","1"));
		OGRENCI_LISTESI.add(new Ogrenci("Ayşe Fatma","2"));
		OGRENCI_LISTESI.add(new Ogrenci("Ayşe Fatma","3"));
	}

	@GetMapping("/")
	public List<Ogrenci> listele() {
		return OGRENCI_LISTESI;
	}
}
