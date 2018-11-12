
/**
 * Write a description of class GreyScale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrayScaleFilter implements Filter
{
        public void filter(PixelImage pi)
        {Pixel[][]data = pi.getData();
            
         for(int row = 0; row < pi.getHeight();row++)
            {for (int col = 0; col < pi.getWidth(); col++)
                {Pixel temp = data[row][col];
                int tempc = ( data[row][col].getRed() + data[row][col].getGreen() + data[row][col].getBlue() ) / 3;
                 temp.setRed(tempc);
                 temp.setGreen(tempc);
                 temp.setBlue(tempc);
                }
            }
            pi.setData(data);
        }
}
