package unbreakable.shop.auto.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import unbreakable.shop.auto.model.ImageModel;
import unbreakable.shop.auto.repository.ImageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public ImageModel saveImage(MultipartFile file){
        String imageName = file.getOriginalFilename();
        try {
            ImageModel imageModel = new ImageModel(imageName
                    , file.getContentType()
                    , file.getBytes());
            return imageRepository.save(imageModel);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Optional<ImageModel> getImage(Integer imageId){
        return imageRepository.findById(imageId);
    }

    public List<ImageModel> getImages(){return imageRepository.findAll();}
}
