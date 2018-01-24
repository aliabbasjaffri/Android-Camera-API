package androidhive.androidcameraapi;

/**
 * Created by aliabbasjaffri on 21/01/2018.
 */

public class ImageUploadInfo
{
    public String imageName;

    public String imageURL;

    public ImageUploadInfo() {}

    public ImageUploadInfo(String name, String url) {
        this.imageName = name;
        this.imageURL= url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }
}
