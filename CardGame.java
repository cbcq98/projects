
public class CardGame {
public static void main(String[]args){
	
	int faceValue=(int)(13*Math.random())+1;
	
	switch(faceValue)
	{
	case 1:
	{
		
		System.out.println("Your card is a Ace");
		break;
	}
	
	case 2:
	{
		System.out.println("Your card is a "+faceValue);
		break;
	}
	case 3:
	{
		System.out.println("Your card is a "+faceValue);
		break;
	}
	case 4:
	{
		System.out.println("Your card is a "+faceValue);
		break;
	}
	case 5:
	{
		System.out.println("Your card is a "+faceValue);
	break;
	}
	case 6:
	{
		System.out.println("Your card is a "+faceValue);
		break;
	}
		case 7:
		{
			System.out.println("Your card is a "+faceValue);
			break;
		}
		
		case 8:
		{
			System.out.println("Your card is a "+faceValue);
			break;
		}
		case 9:
		{
			System.out.println("Your card is a "+faceValue);
			break;
		}
		case 10:
		{
			System.out.println("Your card is a "+faceValue);
			break;
		}
		case 11:
		{
			
			System.out.println("Your card is a Jack");
		break;
		}
		case 12:
		{
			
			System.out.println("Your card is a Queen");
	break;
	}
		case 13:
		{
			
			System.out.println("Your card is a King");
	break;
	}
		default:
		{
			System.out.println("IMPOSSIBLE!");
		}
	}
		
		
		
	int suitValue=(int)(4*Math.random())+1;
		
		switch(suitValue)
		{
		case 1:
		{
			System.out.println("of Diamonds!");
			break;
		}
		
		case 2:
		{
			
			System.out.println("of Spades!");
			break;
		}
		case 3:
		{
			System.out.println("of Clubs!");
			break;
		}
		case 4:
		{
			System.out.println("of Hearts!");
			break;
		}
		default:
		{
			System.out.println("IMPOSSIBLE!");
		}
}
}
}

/*
 Your card is a Queen
of Spades!
 */



