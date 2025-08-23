package com.mauriciojdk.dslist.services;

import com.mauriciojdk.dslist.dto.GameDTO;
import com.mauriciojdk.dslist.dto.GameListDTO;
import com.mauriciojdk.dslist.dto.GameMinDTO;
import com.mauriciojdk.dslist.entities.Game;
import com.mauriciojdk.dslist.entities.GameList;
import com.mauriciojdk.dslist.repositories.GameListRepository;
import com.mauriciojdk.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }



}
