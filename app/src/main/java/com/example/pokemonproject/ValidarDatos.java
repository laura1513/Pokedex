package com.example.pokemonproject;

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

        return correcto;
    }
}
