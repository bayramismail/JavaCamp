package kodlama.Io.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public DataResult<List<Product>> getAll(){
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll());
	}

	@Override
	public Result add(Product product) {
	this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

}
