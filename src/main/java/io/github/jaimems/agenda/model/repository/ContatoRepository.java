package io.github.jaimems.agenda.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jaimems.agenda.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
