
public class Edgy implements Filter
{
    public void filter(PixelImage pi)
    {Pixel[][]data = pi.getData();
     Pixel[][]second = pi.getData();
     
     for(int row = 1; row < pi.getHeight() -1;row++)
         {for (int col = 1; col < pi.getWidth() -1; col++)
             {Pixel temp = second[row][col];
                 
              int sred = data[row][col].getRed();
              int sred2 = (data[row][col].getRed() * 9 ) -
                          (data[row - 1] [col - 1].getRed()) -
                          (data[row - 1] [col].getRed()) -
                          (data[row - 1] [col + 1].getRed()) -
                          (data[row][col - 1].getRed()) - 
                          (data[row][col + 1].getRed()) - 
                          (data[row + 1][col - 1].getRed()) -
                          (data[row + 1][col].getRed() ) -
                          (data[row + 1][col+ 1].getRed());
              if ( sred2 > 255 )
              sred = 225;
              else if ( sred2 < 0)
              sred = 0;
              else
              sred = sred2;
              
             int sgreen = data[row][col].getGreen();
             int sgreen2 = ( data[row][col].getGreen() * 9 ) -
                          (data[row - 1] [col - 1].getGreen()) -
                          (data[row - 1] [col].getGreen()) -
                          (data[row - 1] [col + 1].getGreen()) -
                          (data[row][col - 1].getGreen()) - 
                          (data[row][col + 1].getGreen()) - 
                          (data[row + 1][col - 1].getGreen()) -
                          (data[row + 1][col].getGreen() ) -
                          (data[row + 1][col+ 1].getGreen());
              if ( sgreen2 > 255 )
              sgreen = 225;
              else if ( sgreen2 < 0)
              sgreen = 0;
              else
              sgreen = sgreen2;

             int sblue = data[row][col].getBlue();
             int sblue2 = ( data[row][col].getBlue() * 9 )-
                          (data[row - 1] [col - 1].getBlue()) -
                          (data[row - 1] [col].getBlue()) -
                          (data[row - 1] [col + 1].getBlue()) -
                          (data[row][col - 1].getBlue()) - 
                          (data[row][col + 1].getBlue()) - 
                          (data[row + 1][col - 1].getBlue()) -
                          (data[row + 1][col].getBlue() ) -
                          (data[row + 1][col+ 1].getBlue());
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
