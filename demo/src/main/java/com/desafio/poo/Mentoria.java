package com.desafio.poo;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }

}
