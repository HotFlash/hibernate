package hib.example;
import java.util.List;

public interface ProductDao {
    Product findById(Long id);
    Product findByTitle(String title);
    List<Product> findAll();
    void save(Product product);
    void updateTitleById(Long id, String newTitle);
    void updatePriceById(Long id, Integer newPrice);
    void deleteById(Long id);
}
