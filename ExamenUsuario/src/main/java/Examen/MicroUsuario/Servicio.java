package Examen.MicroUsuario;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private Data dataRepository;

    // Constructor vacío (o sin lógica)
    public Servicio() {
        // No hagas nada aquí que dependa de dataRepository
    }

    @PostConstruct
    public void init() {
        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 2");
        Usuario u3 = new Usuario("Usuario 3");
        dataRepository.save(u1);
        dataRepository.save(u2);
        dataRepository.save(u3);
        // Nota: u3 no lo guardabas, pero puedes guardarlo también
    }

    public Usuario buscar(Long idUsu) {
        return dataRepository.findById(idUsu).orElse(null);
    }
}