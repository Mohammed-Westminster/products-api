package uk.ac.westminster.repository;

import org.springframework.stereotype.Repository;
import uk.ac.westminster.products_api.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
    private final Map<Long, Product> store = new
            HashMap<>();
    private Long nextId = 1L;
}
