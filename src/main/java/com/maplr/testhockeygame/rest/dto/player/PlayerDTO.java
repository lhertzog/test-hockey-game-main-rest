package com.maplr.testhockeygame.rest.dto.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDTO {

    private long number;
    private String name;
    private String lastname;
    private boolean isCaptain;
}
