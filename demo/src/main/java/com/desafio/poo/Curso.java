package com.desafio.poo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {

        return XP_PADRAO * cargaHoraria;
    }

}
