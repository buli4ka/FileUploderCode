package unbreakable.shop.auto.model;


import javax.persistence.*;

@Entity
@Table(name="Images")
public class ImageModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] data;

    public ImageModel() {}

    public ImageModel(String imageName, String imageType, byte[] data) {
        this.imageName = imageName;
        this.imageType = imageType;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
