package me.bilousov.sfgpetclinic.service;

import me.bilousov.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
