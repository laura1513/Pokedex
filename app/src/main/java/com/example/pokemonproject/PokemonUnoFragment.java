package com.example.pokemonproject;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pokemonproject.databinding.FragmentPokemonUnoBinding;

public class PokemonUnoFragment extends Fragment {
    private FragmentPokemonUnoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentPokemonUnoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ValidarDatos validar = new ValidarDatos();
                String nombre = String.valueOf(binding.nombre.getText());
                int hp = Integer.parseInt(binding.hp.getText().toString());
                int ataque = Integer.parseInt(binding.ataque.getText().toString());
                int defensa = Integer.parseInt(binding.defensa.getText().toString());
                int ataqueEspecial = Integer.parseInt(binding.ataqueEspecial.getText().toString());
                int defensaEspecial = Integer.parseInt(binding.defensaEspecial.getText().toString());

                ValidarDatos.Validar datos = new ValidarDatos.Validar(nombre, hp, ataque, defensa, ataqueEspecial, defensaEspecial);

                boolean valido = validar.valido(datos);

                if (valido == true) {

                } else {
                    binding.valido.setText("Datos no válidos");
                }
            }
        });
    }
}