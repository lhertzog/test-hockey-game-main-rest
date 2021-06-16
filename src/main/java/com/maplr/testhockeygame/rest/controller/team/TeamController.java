package com.maplr.testhockeygame.rest.controller.team;

import com.maplr.testhockeygame.rest.dto.player.PlayerDTO;
import com.maplr.testhockeygame.rest.dto.team.TeamDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public interface TeamController {

    @GetMapping("/api/team/{year}")
    TeamDTO getPlayerByYear(@PathVariable long year);

    @PostMapping("/api/team/{year}")
    @ResponseStatus(HttpStatus.CREATED)
    PlayerDTO insertPlayerInTeam(@PathVariable long year, @RequestBody PlayerDTO playerDTO);

}
