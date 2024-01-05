package com.LucasCagnini13.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.LucasCagnini13.dslist.Entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
