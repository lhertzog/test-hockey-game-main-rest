package com.maplr.testhockeygame.rest.controller.player;

import com.maplr.testhockeygame.rest.dto.player.PlayerDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PlayerController {

    @PutMapping("/api/player/captain/{id}")
    PlayerDTO makePlayerCaptain(@PathVariable long id);

}
