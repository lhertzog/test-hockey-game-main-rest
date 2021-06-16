package com.maplr.testhockeygame.rest.dto.team;

import com.maplr.testhockeygame.rest.dto.player.PlayerDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamDTO {
    private long id;
    private String coach;
    private long year;
    private List<PlayerDTO> players;
}
