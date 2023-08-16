package kr.co.kalpa.dmas.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DmasUser {
    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    transient private String password;
}
