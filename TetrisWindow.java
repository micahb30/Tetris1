import java.awt.* ;

public class TetrisWindow  extends  Frame
{
	private TetrisPanel panel = new TetrisPanel() ;		// create a panel

	public TetrisWindow( )
  	{
		setTitle ("Tetris Window" ) ;	// set a title
	  	setSize	(400, 600) ;			// set dimensions of the window
		setLocation ( 100, 100) ;		// set the position of the top–left corner
		setResizable( true ) ;			// the user will be able to change the size
		   	add( panel ) ;				// “attach” panel to the frame
		setVisible (true) ;  			// show the window in the display
	}
}