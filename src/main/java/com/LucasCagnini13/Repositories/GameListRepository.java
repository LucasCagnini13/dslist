package com.LucasCagnini13.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.LucasCagnini13.Entities.Game;
import com.LucasCagnini13.Entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
