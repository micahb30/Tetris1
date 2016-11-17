import java.awt.* ;

public class TetrisFinal
{
	//instance fields
	//grid
	private int [][] grid =
	{
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
   };

   //level
   private int linesCleared = 0 ;
   private int [] levelUp = {2, 5, 10, 15, 20};
   private int score = 0;
   private int round = levelUp[0];

	//pieces
	private int pieceNum = (int) (Math.random() * (7));
	private int row = 7;
	private int column = 0;
	private Color [] colors = {Color.WHITE, Color.CYAN, Color.YELLOW, Color.GREEN, Color.RED, Color.ORANGE, Color.BLUE, Color.MAGENTA};
	private int [][][] pieces = {
	 					{					//0
							{0, 1, 0, 0},
							{0, 1, 0, 0},
							{0, 1, 0, 0},
							{0, 1, 0, 0}
						},

						{					//1
							{2, 2},
							{2, 2}
						},

						{					//2
							{0, 3, 3},
							{3, 3, 0},
							{0, 0, 0}
						},

						{					//3
							{4, 4, 0},
							{0, 4, 4},
							{0, 0, 0}
						},

						{					//4
							{0, 5, 0},
							{0, 5, 0},
							{0, 5, 5}
						},

						{					//5
							{0, 6, 0},
							{0, 6, 0},
							{6, 6, 0}
						},

						{					//6
							{7, 7, 7},
							{0, 7, 0},
							{0, 0, 0}
						},
				};


	public TetrisFinal ()
	{

	}

	public void display ( Graphics g, Dimension dim )
	{
		int min = Math.min(dim.width, dim.height) ;
		int size = min/18 ;
      int border = 4 ;
		int gridWidth = size * (grid[0].length) ;
		int gridHeight = size * (grid.length) ;
		Point start = new Point(0,0) ;
      Point newStart = new Point (0,0) ;
      int newGridWidth = gridWidth - (8*size) ;
      int newGridHeight = gridHeight - (8*size) ;
      newStart.x = (dim.width - newGridWidth) / 2 ;
      newStart.y = (dim.height - newGridHeight) / 2 ;
		start.x = (dim.width - gridWidth) / 2 ;
		start.y = (dim.height - gridHeight) / 2 ;
		int columns = gridWidth/(grid[0].length) ;
		int rows = gridHeight/(grid.length) ;

		//grid background
		g.setColor(Color.LIGHT_GRAY);

      g.fillRect(newStart.x, newStart.y, newGridWidth, newGridHeight);

		//print grid
      for (int i = 4; i < grid.length - border; i++)
		{
			for (int j = 4; j < grid[i].length - border; j++)
			{
				if (grid[i][j] != 0)
				{
					int color = grid[i][j];
					g.setColor (colors[color]);
					g.fillRect(start.x + (size*j), start.y + (size*i), size, size);
				}
			}
		}

      //draw shape
		for (int i = 0; i < pieces[pieceNum].length; i++)
		{
			for (int j = 0; j < pieces[pieceNum][i].length; j++)
			{
         	if (pieces[pieceNum][i][j] != 0 && (column + i) >= 4)
				{
					int color = pieces[pieceNum][i][j];
					g.setColor (colors[color]);
					g.fillRect(row*size + start.x + (size*j), column*size + start.y + (size*i), size, size);
				}
         }
		}

		//Grid lines
		g.setColor(Color.BLACK);

		for (int i = newStart.x; i <= ((newGridWidth) + newStart.x); i += columns)
		{
			g.drawLine(i, newStart.y, i, (newGridHeight + newStart.y));
		}

		for (int i = newStart.y; i <= ((newGridHeight) + newStart.y); i += rows)
		{
			g.drawLine(newStart.x, i, (newGridWidth + newStart.x), i);
		}

      //print score
      //score = linesCleared * round;
      System.out.println(score);
      String scre = String.valueOf(score);
      g.drawString(scre, start.x, start.y);

	}
	public void shiftRight()
	{
		row++;
      if (free() == false)
         row--;
	}
	public void shiftLeft()
	{
		row--;
      if (free() == false)
         row++;
	}
	public void rotateCW()
	{
		flipHorizontal();
      flipDiagonal();
      if(free() == false)
      {
         flipVertical();
			flipDiagonal();
      }
	}
	public void rotateCCW()
	{
		flipVertical();
		flipDiagonal();
      if(free() == false)
      {
         flipHorizontal();
			flipDiagonal();
      }
	}
	public void userDrop()
	{
		drop();

	}
	public void programDrop()	//timed soft drop
	{
		drop();
	}
	public void hardDrop() //user integrated drop
	{
      column += rowsLeft() ;
      for (int i = 0; i < pieces[pieceNum].length; i++)
		{
   	   for (int j = 0; j < pieces[pieceNum][i].length; j++)
         {
             if (pieces[pieceNum][i][j] != 0)
             grid[column + i][row + j] = pieces[pieceNum][i][j];
			}
		}
      clearLines();
      endGame();
      column = 0;
      row = 7;
      pieceNum = (int) (Math.random() * (7));
      		System.out.print ("Drop");
 	}
	public int increaseLevel(int level) //speeds up the program drop when a level is cleared
	{
		round = level;
      if (linesCleared == levelUp[level] && level < 5)
		{
      	level++;
         round = levelUp[level];
      }

		return level;
	}
  	public void drop () //program integrated drop
	{
      column++;

      if (free() == false)
      {
         column--;
         for (int i = 0; i < pieces[pieceNum].length; i++)
		   {
			   for (int j = 0; j < pieces[pieceNum][i].length; j++)
			   {
               if (pieces[pieceNum][i][j] != 0)
                  grid[column + i][row + j] = pieces[pieceNum][i][j];
			   }
		   }
         clearLines();
         endGame();
         column = 0;
         row = 7;
         pieceNum = (int) (Math.random() * (7));
      }
    }
    public boolean free	() //determine whether a piece a drop further
    {
      boolean flag = true;
      for (int i = 0; i < pieces[pieceNum].length; i++)
      {
         for (int j = 0; j < (pieces[pieceNum][i].length); j++)
			{
            if (pieces[pieceNum][i][j] != 0 && grid[column + i][row + j] !=0)
            {
               flag = false;
               break;
            }
         }
      }
      return flag;
    }
    public int rowsLeft() //determine the number of rows left to allow for the hard drop
    {
      int tempCol;
      outerloop:
      for (tempCol = column; tempCol < grid.length; tempCol++)
      {
         for(int i = 0; i < pieces[pieceNum].length; i++)
         {
            for(int j = 0; j < (pieces[pieceNum][i].length); j++)
            {
               if (pieces[pieceNum][i][j] != 0 && grid[tempCol + i][row + j] !=0)
               {
                  break outerloop;
               }
            }
         }
      }
      tempCol -= (column + 1);
      return tempCol;
    }
    public void clearLines() //clear a line ones a row is filled
    {
      int counter = 0;
      for (int i = 0; i < grid.length-4; i ++)
      {
         for(int j = 0; j < grid[i].length; j++)
         {
            if (grid[i][j] != 0)
            {
               counter++;
            }
            if (counter == grid[i].length)
            {
               for(int m = i; m > 0; m--)
               {
                 for (int k = 0; k < grid[i].length; k++)
                 {
                    grid[m][k] = grid[m-1][k];
                 }
               }
               linesCleared++;
               score = linesCleared * round;
               //System.out.println(linesCleared);
            }
         }
         counter = 0;
      }
    }
    public void flipHorizontal () //flipping of array used to integrate into the rotation
	 {
		for (int i = 0; i < pieces[pieceNum].length / 2; i ++)
		{
			for (int j = 0; j < pieces[pieceNum][i].length; j ++)
			{
				int tmp = pieces[pieceNum] [i][j];
				pieces[pieceNum] [i][j] = pieces[pieceNum] [pieces[pieceNum].length - i - 1][j];
				pieces[pieceNum] [pieces[pieceNum].length - i - 1][j] = tmp;
			}
		}
	 }
   public void flipVertical ()
	{
		for (int i = 0; i < pieces[pieceNum].length; i ++)
		{
			for (int j = 0; j < pieces[pieceNum][i].length / 2; j ++)
			{
				int tmp = pieces[pieceNum] [i][j];
				pieces[pieceNum] [i][j] = pieces[pieceNum] [i][pieces[pieceNum] [i].length - j - 1];
				pieces[pieceNum] [i][pieces[pieceNum] [i].length - j - 1] = tmp;
			}
		}
	}
   public void flipDiagonal ()
	{
		for (int i = 0; i < pieces[pieceNum].length; i ++)
		{
			for (int j = 0; j < pieces[pieceNum][i].length; j ++)
			{
				if (j < i)
				{
					int tmp = pieces[pieceNum] [i][j];
					pieces[pieceNum] [i][j] = pieces[pieceNum] [j][i];
					pieces[pieceNum] [j][i] = tmp;
				}
			}
		}
	}
   public void endGame()
   {
      if (column <= 0)
      {
         System.out.println("Game Over! Press R to reset");
      }
   }
}