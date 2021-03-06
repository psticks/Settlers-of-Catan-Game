/*WARNING: Be careful when modifiying this file on Dropbox!! If more than one person is modifiying it at a time and you
 * both save, then there is a chance for data loss and we all lose!*/
import java.awt.*;
import objectdraw.*;

public class DevelopmentCard
{
	private int type;
	public String cardType;
	public int cardValue;
	private DrawingCanvas canvas;
	private FilledRect cardRect;
    private FramedRect frameRect;
	private Text cardText;

	public DevelopmentCard(int type, DrawingCanvas aCanvas)
	{
		cardValue = type;
		if (cardValue == 1)
		{
			cardType = "Knight";
		}
		else if (cardValue == 2)
		{
			cardType = "Bonus Point";
		}
		else if (cardValue == 3)
		{
			cardType = "Monopoly";
		}
		else if (cardValue == 4)
		{
			cardType = "Road Building";
		}
		else if (cardValue == 5)
		{
			cardType = "Year of Plenty";
		}
		canvas = aCanvas;
	}
 
	public void displayCard(Location cardLocation)
	{
		cardRect = new FilledRect(cardLocation, 100, 130, canvas);
        frameRect = new FramedRect(cardLocation.getX() - 1, cardLocation.getY() - 1, 101, 131, canvas);
		Color cardColor;
		if (cardValue == 1)
		{
			cardColor = new Color(210, 105, 30);
		}
		else if (cardValue == 2)
		{
			cardColor = new Color(0, 100, 0);
		}
		else if (cardValue == 3)
		{
			cardColor = new Color(105, 105, 105);
		}
		else if (cardValue == 4)
		{
			cardColor = new Color(220, 220, 220);
		}
		else if (cardValue == 5)
		{
			cardColor = new Color(255, 215, 0);
		}
		else
		{
			cardColor = new Color(0, 0, 0);
		}
		cardRect.setColor(cardColor);
		cardText = new Text(cardType, cardLocation, canvas);
	}
}
