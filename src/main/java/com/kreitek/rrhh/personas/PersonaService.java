package com.kreitek.rrhh.personas;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> getAllPersons();
    Persona createPersona(Persona persona);
    void deletePersona(Integer id);
    Optional<Persona> getPersona(Integer id);
}
