package kodlama.Io.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.Io.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
