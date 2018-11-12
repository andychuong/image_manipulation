
/**
 * Write a description of class Gaussian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuassianBlurFilter implements Filter
{
        public void filter(PixelImage pi)
        {Pixel[][]data = pi.getData();
         Pixel[][]second = pi.getData();
            
         for(int row = 1; row < pi.getHeight() -1;row++)
            {for (int col = 1; col < pi.getWidth() -1; col++)
                {Pixel temp = second[row][col];
                 int sred = ( (data[row][col].getRed() * 4) +
                              (data[row - 1] [col - 1].getRed()) +
                              (data[row - 1] [col].getRed() * 2) +
                              (data[row - 1] [col + 1].getRed()) +
                              (data[row][col - 1].getRed() * 2) + 
                              (data[row][col + 1].getRed() * 2) + 
                              (data[row + 1][col - 1].getRed()) +
                              (data[row + 1][col].getRed() * 2 ) +
                              (data[row + 1][col+ 1].getRed())) / 16;
                 int sgreen = ( (data[row][col].getGreen() * 4) +
                              (data[row - 1] [col - 1].getGreen()) +
                              (data[row - 1] [col].getGreen() * 2) +
                              (data[row - 1] [col + 1].getGreen()) +
                              (data[row][col - 1].getGreen() * 2) + 
                              (data[row][col + 1].getGreen() * 2) + 
                              (data[row + 1][col - 1].getGreen()) +
                              (data[row + 1][col].getGreen() * 2 ) +
                              (data[row + 1][col+ 1].getGreen())) / 16;
                 int sblue = ( (data[row][col].getBlue() * 4) +
                              (data[row - 1] [col - 1].getBlue()) +
                              (data[row - 1] [col].getBlue() * 2) +
                              (data[row - 1] [col + 1].getBlue()) +
                              (data[row][col - 1].getBlue() * 2) + 
                              (data[row][col + 1].getBlue() * 2) + 
                              (data[row + 1][col - 1].getBlue()) +
                              (data[row + 1][col].getBlue() * 2 ) +
                              (data[row + 1][col+ 1].getBlue())) / 16;
                 temp.setRed(sred);
                 temp.setGreen(sgreen);
                 temp.setBlue(sblue);
                }
            }
            pi.setData(second);
        }
}
