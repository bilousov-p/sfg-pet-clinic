package me.bilousov.sfgpetclinic.service;

import me.bilousov.sfgpetclinic.model.Owner;
import me.bilousov.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
