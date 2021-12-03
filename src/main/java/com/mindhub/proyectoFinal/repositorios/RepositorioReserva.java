package com.mindhub.proyectoFinal.repositorios;

import com.mindhub.proyectoFinal.modelos.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositorioReserva extends JpaRepository<Reserva,Long> {
}
