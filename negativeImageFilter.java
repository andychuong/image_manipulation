
/**
 * Write a description of class negativeImageFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class negativeImageFilter implements Filter
{
    public void filter(PixelImage pi)
        {Pixel[][]data = pi.getData();
            
         for(int row = 0; row < pi.getHeight();row++)
            {for (int col = 0; col < pi.getWidth(); col++)
                {Pixel temp = data[row][col];
                 temp.setRed(255 - data[row][col].getRed());
                 temp.setGreen(255 - data[row][col].getGreen());
                 temp.setBlue(255 - data[row][col].getBlue());
                }
            }
            pi.setData(data);
        }
}

