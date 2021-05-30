package kodlama.Io.northwind.business.abstracts;

import java.util.List;

import kodlama.Io.northwind.core.utilities.results.DataResult;
import kodlama.Io.northwind.core.utilities.results.Result;
import kodlama.Io.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);

	DataResult<List<Product>> GetByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	DataResult<List<Product>> getAllSorted();
}
