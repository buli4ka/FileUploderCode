package unbreakable.shop.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unbreakable.shop.auto.model.ImageModel;

public interface ImageRepository  extends JpaRepository<ImageModel,Integer> {
}
