package kodlama.Io.northwind.business.abstracts;

import java.util.List;

import kodlama.Io.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
