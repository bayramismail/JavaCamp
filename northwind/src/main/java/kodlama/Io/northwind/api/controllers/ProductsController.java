package kodlama.Io.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.Io.northwind.business.abstracts.ProductService;
import kodlama.Io.northwind.core.utilities.results.DataResult;
import kodlama.Io.northwind.core.utilities.results.Result;
import kodlama.Io.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}
	
	@GetMapping("/getallDesc")
	public DataResult<List<Product>> getAllDesc() {
		return this.productService.getAllSorted();
	}
	
	@GetMapping("/getallByPageNoAndPageSize")
	public DataResult<List<Product>> getAll(int pageNo,int pageSize) {
		return this.productService.getAll(pageNo, pageSize);
	}

	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(String productName) {
		return this.productService.getByProductName(productName);
	}

	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}

	@GetMapping("/getByCategoryIn")
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return this.productService.getByCategoryIn(categories);
	}

	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return this.productService.getByProductNameContains(productName);
	}

	@GetMapping("/getByProductNameStartsWith")
	public DataResult<List<Product>> getByProductNameStartsWith(String productName){
		return this.productService.getByProductNameStartsWith(productName);
	}

	@GetMapping("/GetByNameAndCategory")
	public DataResult<List<Product>> GetByNameAndCategory(String productName,int categoryId){
		return this.productService.GetByNameAndCategory(productName, categoryId);
	}
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
}
