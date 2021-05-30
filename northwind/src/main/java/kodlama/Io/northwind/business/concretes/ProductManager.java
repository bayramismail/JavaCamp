package kodlama.Io.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.Io.northwind.business.abstracts.ProductService;
import kodlama.Io.northwind.core.utilities.results.DataResult;
import kodlama.Io.northwind.core.utilities.results.Result;
import kodlama.Io.northwind.core.utilities.results.SuccessDataResult;
import kodlama.Io.northwind.core.utilities.results.SuccessResult;
import kodlama.Io.northwind.dataAccess.abstracts.ProductDao;
import kodlama.Io.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll());
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(productDao.getByProductName(productName));
	}

	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Product>(productDao.getByProductNameAndCategory_CategoryId(productName, categoryId));
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameOrCategory_CategoryId(productName, categoryId));
	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(productDao.getByCategoryIn(categories));
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameContains(productName));
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameStartsWith(productName));
	}

	@Override
	public DataResult<List<Product>> GetByNameAndCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(productDao.GetByNameAndCategory(productName, categoryId));
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNo,pageSize);
	return new SuccessDataResult<List<Product>>(productDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
	Sort sort=Sort.by(Sort.Direction.DESC,"productName");
	
		return new SuccessDataResult<List<Product>>(productDao.findAll(sort));
	}

}
