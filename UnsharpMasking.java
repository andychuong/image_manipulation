
public class UnsharpMasking implements Filter
{
        public void filter(PixelImage pi)
        {Pixel[][]data = pi.getData();
         Pixel[][]second = pi.getData();
            
         for(int row = 1; row < pi.getHeight() -1;row++)
            {for (int col = 1; col < pi.getWidth() -1; col++)
                {Pixel temp = second[row][col];
                 
                 int sred = data[row][col].getRed();
                 int sgreen = data[row][col].getGreen();
                 int sblue = data[row][col].getBlue();
                    
                 int sred2 = ( (data[row][col].getRed() * 28) -
                              (data[row - 1] [col - 1].getRed()) -
                              (data[row - 1] [col].getRed() * 2) -
                              (data[row - 1] [col + 1].getRed()) -
                              (data[row][col - 1].getRed() * 2) - 
                              (data[row][col + 1].getRed() * 2) - 
                              (data[row + 1][col - 1].getRed()) -
                              (data[row + 1][col].getRed() * 2 ) -
                              (data[row + 1][col+ 1].getRed())) / 16;
                 int sgreen2 = ( (data[row][col].getGreen() * 28) -
                              (data[row - 1] [col - 1].getGreen()) -
                              (data[row - 1] [col].getGreen() * 2) -
                              (data[row - 1] [col + 1].getGreen()) -
                              (data[row][col - 1].getGreen() * 2) - 
                              (data[row][col + 1].getGreen() * 2) - 
                              (data[row + 1][col - 1].getGreen()) -
                              (data[row + 1][col].getGreen() * 2 ) -
                              (data[row + 1][col+ 1].getGreen())) / 16;
                 int sblue2 = ( (data[row][col].getBlue() * 28) -
                              (data[row - 1] [col - 1].getBlue()) -
                              (data[row - 1] [col].getBlue() * 2) -
                              (data[row - 1] [col + 1].getBlue()) -
                              (data[row][col - 1].getBlue() * 2) - 
                              (data[row][col + 1].getBlue() * 2) - 
                              (data[row + 1][col - 1].getBlue()) -
                              (data[row + 1][col].getBlue() * 2 ) -
                              (data[row + 1][col+ 1].getBlue())) / 16;
                              
              if ( sred2 > 255 )
              sred = 225;
              else if ( sred2 < 0)
              sred = 0;
              else
              sred = sred2;
              
              if ( sgreen2 > 255 )
              sgreen = 225;
              else if ( sgreen2 < 0)
              sgreen = 0;
              else
              sgreen = sgreen2;              
              
              if ( sblue2 > 255 )
              sblue = 225;
              else if ( sblue2 < 0)
              sblue = 0;
              else
              sblue = sblue2;
              
                 temp.setRed(sred);
                 temp.setGreen(sgreen);
                 temp.setBlue(sblue);
                }
            }
            pi.setData(second);
        }
}
