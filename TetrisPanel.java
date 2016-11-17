import java.awt.* ;
import java.awt.event.* ;
import java.util.*;
import java.awt.image.*;

public class TetrisPanel extends Panel implements KeyListener, MouseListener
{
	//instance fields

	//constants
	private final int SHIFT_R = KeyEvent.VK_RIGHT;
	private final int SHIFT_L = KeyEvent.VK_LEFT;
	private final int ROTATE_CW = KeyEvent.VK_UP;
	private final int ROTATE_CCW = KeyEvent.VK_DOWN;
	private final int DROP = KeyEvent.VK_SPACE;
	private final int RESET = MouseEvent.BUTTON1;
	private Dimension dim = getSize();
	private BufferedImage osi  = null ;
	private Graphics osg = null ;

	//objects
	TetrisFinal tetris = new TetrisFinal();

	//timers
	Timer timer = new Timer();
	private long delay = 0;
	private long interval = 10;

	//levels
	private int count = 0;
	private int [] counts = new int [] {150, 100, 80, 40, 20, 10};
	private int level = 0;


	//constructor
	public TetrisPanel()
	{
		addMouseListener (this) ;
		addKeyListener( this ) ;
		setBackground( Color.WHITE ) ;

		TimerTask task = new TimerTask()
		{
			public void run()
			{
				if(count < counts[level])
					count++;

				else
				{
					tetris.programDrop();
					count = 0 ;
					repaint ();
				}
			}
		};
		timer.scheduleAtFixedRate(task, delay, interval);
	}
	public void paint ( Graphics g )
	{

		dim = getSize () ;


		osi = new BufferedImage( dim.width, dim.height, BufferedImage.TYPE_INT_RGB ) ;


		osg = osi.getGraphics() ;

		update( g ) ;
	}

	public void update( Graphics g )
	{
		osg.setColor( Color.WHITE ) ;
		osg.fillRect(	0, 0, dim.width, dim.height ) ;
		tetris.display (osg, dim) ;
		g.drawImage( osi, 0, 0, this ) ;
	}


	public   void   keyPressed( KeyEvent ke)
	{
		int keyCode = ke.getKeyCode();
		boolean paintFlag = true ; 			// repaint if paintFlag is true after switch

			switch ( keyCode )
			{
				case SHIFT_R :				tetris.shiftRight( ) ;
											break ;
				case SHIFT_L :				tetris.shiftLeft( ) ;
											break ;
				case ROTATE_CW :			tetris.rotateCW( ) ;
											break ;
				case ROTATE_CCW :			tetris.rotateCCW( ) ;
											break ;
				case DROP:					tetris.hardDrop () ;
											level = tetris.increaseLevel(level);
											break ;
				default 	:				paintFlag = false ;	// do not repaint
											break ;


			}

		if ( paintFlag )
		{
			repaint() ;
		}
	}

	public 	void	mouseClicked( MouseEvent me )
	{
			boolean paintFlag = true ;
				int getButton = me.getButton() ;
				switch ( getButton ){
	   case RESET:
	   timer = new Timer();
   	 tetris = new TetrisFinal();
					                                    //timer.scheduleAtFixedRate(task, delay, interval);
       break;
   }
	}
	public 	void	mouseEntered( MouseEvent me ) {}
	public 	void	mouseExited ( MouseEvent me ) {}
	public 	void	mousePressed ( MouseEvent me ) {}
	public 	void	mouseReleased ( MouseEvent me ) {}

	public   void    keyReleased( KeyEvent ke) {}

	public   void    keyTyped( KeyEvent ke) {}
}