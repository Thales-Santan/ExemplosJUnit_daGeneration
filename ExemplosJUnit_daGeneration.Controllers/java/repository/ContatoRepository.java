package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}
