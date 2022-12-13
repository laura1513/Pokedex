package com.example.pokemonproject;

import java.util.List;

public class ValidarDatos {
    public static class Validar{
        public String nombre;
        public int hp;
        public int ataque;
        public int defensa;
        public int ataqueEspecial;
        public int defensaEspecial;

        public Validar(String nombre, int hp, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
            this.nombre = nombre;
            this.hp = hp;
            this.ataque = ataque;
            this.defensa = defensa;
            this.ataqueEspecial = ataqueEspecial;
            this.defensaEspecial = defensaEspecial;
        }
    }
    public boolean valido(Validar validar) {
        boolean correcto = true;
        List<Boolean> listaBoolean = null;
        if (validar.hp < 0 && validar.hp > 999) {
            listaBoolean.add(false);
        } else {
            listaBoolean.add(true);
        }
        if (validar.ataque < 0 && validar.ataque > 999) {
            listaBoolean.add(false);
        } else {
            listaBoolean.add(true);
        }
        if (validar.defensa < 0 && validar.defensa > 999) {
            listaBoolean.add(false);
        } else {
            listaBoolean.add(true);
        }
        if (validar.ataqueEspecial < 0 && validar.ataqueEspecial > 999) {
            listaBoolean.add(false);
        } else {
            listaBoolean.add(true);
        }
        if (validar.defensaEspecial < 0 && validar.defensaEspecial > 999) {
            listaBoolean.add(false);
        } else {
            listaBoolean.add(true);
        }
        if (listaBoolean.contains(false)) {
            return false;
        } else {
            return correcto;
        }
    }
}
