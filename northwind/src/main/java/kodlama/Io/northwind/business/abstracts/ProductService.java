package kodlama.Io.northwind.business.abstracts;

import java.util.List;

import kodlama.Io.northwind.core.utilities.results.DataResult;
import kodlama.Io.northwind.core.utilities.results.Result;
import kodlama.Io.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
