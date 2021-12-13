package com.example.petClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petClinic.model.Owner;
import com.example.petClinic.model.Vet;
import com.example.petClinic.services.OwnerService;
import com.example.petClinic.services.VetService;
import com.example.petClinic.services.map.OwnerServiceMap;
import com.example.petClinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		ownerService.save(owner2);
		
		System.out.println("Loaded owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);
		
		System.out.println("Vets loaded ...");
	}

	
}
