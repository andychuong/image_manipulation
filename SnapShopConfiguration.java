/**
 * A class to configure the SnapShop application
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnapShopConfiguration
{
    /**
     * Method to configure the SnapShop.  Call methods like addFilter
     * and setDefaultFilename here.
     * @param theShop A pointer to the application
     */
    public static void configure(SnapShop theShop)
    {   theShop.setDefaultFilename("r34.jpg");
        theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
        theShop.addFilter(new FlipVerticle(), "Flip Verticle");
        theShop.addFilter(new negativeImageFilter(), "Negative");
        theShop.addFilter(new GrayScaleFilter(), "Gray Scale Image" );
        theShop.addFilter(new GuassianBlurFilter(), "Gaussian Blur Image");
        theShop.addFilter(new LaplacianFilter(), "Laplacian Image");
        theShop.addFilter(new UnsharpMasking(), " Unsharp Masking");
        theShop.addFilter(new Edgy(), "Edgy" );
        /*
        theShop.addFilter(new ReverseImageFilter(), "Reverse Image");  
        theShop.addFilter(new LightenBy10Filter(), "Lighten by 10 Image" );
        theShop.addFilter(new IntensifyFilter(), "Intensify Image" );
        theShop.addFilter(new EmbossFilter(), "Emboss Filter" );
        */
    }
}
