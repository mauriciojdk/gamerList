package com.mauriciojdk.dslist.services;

import com.mauriciojdk.dslist.dto.GameMinDTO;
import com.mauriciojdk.dslist.entities.Game;
import com.mauriciojdk.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
