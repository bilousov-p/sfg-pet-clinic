package me.bilousov.sfgpetclinic.service;

import me.bilousov.sfgpetclinic.model.Owner;
import me.bilousov.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Owner owner);
    Set<Vet> findAll();
}
