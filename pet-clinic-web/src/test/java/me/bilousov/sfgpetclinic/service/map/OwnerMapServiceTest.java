package me.bilousov.sfgpetclinic.service.map;

import me.bilousov.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    private OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        final Owner owner = new Owner();
        owner.setId(1L);
        owner.setLastName("Smith");

        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(1L);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(1L));

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void save() {
        final Owner owner = new Owner();
        owner.setId(2L);

        Owner savedOwner = ownerMapService.save(owner);

        assertEquals(2L, savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(1L);

        assertEquals(1L, owner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerMapService.findByLastName("Smith");

        assertNotNull(owner);
        assertEquals(1L, owner.getId());
    }
}