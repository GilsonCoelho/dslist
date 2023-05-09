package br.com.gsc.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gsc.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
