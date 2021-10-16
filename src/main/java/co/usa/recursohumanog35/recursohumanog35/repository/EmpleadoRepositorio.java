package co.usa.recursohumanog35.recursohumanog35.repository;
import co.usa.recursohumanog35.recursohumanog35.model.Empleado;
import co.usa.recursohumanog35.recursohumanog35.repository.crud.EmpleadoCrudRepositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpleadoRepositorio {
    
    @Autowired
    private EmpleadoCrudRepositorio empleadoCrudRepositorio;

    public EmpleadoRepositorio(EmpleadoCrudRepositorio empleadoCrudRepositorio) {
        this.empleadoCrudRepositorio = empleadoCrudRepositorio;
    }

    public List<Empleado> getAll(){
        return (List<Empleado>)empleadoCrudRepositorio.findAll();
    }

    public Optional<Empleado>getEmpleado(int id){
        return empleadoCrudRepositorio.findById(id);
    }

    public Empleado save (Empleado empleado) {
        return empleadoCrudRepositorio.save(empleado);
    }
}
