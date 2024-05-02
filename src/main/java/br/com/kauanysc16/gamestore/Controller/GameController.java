package br.com.kauanysc16.gamestore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.com.kauanysc16.gamestore.Model.Game;
import br.com.kauanysc16.gamestore.Repository.GameRepository;

@Controller
public class GameController {

    @Autowired
    GameRepository gameRepository;
    
    @GetMapping("/list")
    public String getListGame() {
        gameRepository.findAll();
        return "game-list";
    }
    
    @GetMapping("/addgame")
    public String getAddGame() {
        return "game-add";
    }
    @PostMapping("/addgame")
    public String postAddGame(Game game) {
        gameRepository.save(game);
        return "game-list";
    }
    
}
