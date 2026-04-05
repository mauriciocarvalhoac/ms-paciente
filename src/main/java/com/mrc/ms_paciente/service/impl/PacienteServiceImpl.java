package com.mrc.ms_paciente.service.impl;

import com.mrc.ms_paciente.entity.Paciente;
import com.mrc.ms_paciente.service.PacienteService;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Service
public class PacienteServiceImpl implements PacienteService {
    private final Faker faker = new Faker(Locale.of("Pt-BR"));

    @Override
    public List<Paciente> getAll() {
        return gerarPacientes(10);
    }

    private List<Paciente> gerarPacientes(int qtd) {
        List<Paciente> lista = new ArrayList<>();
        for (int j = 0; j < qtd; j++) {
            lista.add(new Paciente(UUID.randomUUID(), faker.name().femaleFirstName()));
        }

        return lista;
    }

}
