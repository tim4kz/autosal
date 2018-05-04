package kz.kaznitu.autosal.repositories;

import kz.kaznitu.autosal.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Long> {
}
