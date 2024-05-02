package br.com.kauanysc16.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.kauanysc16.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
