import java.util.*;

public class beratung{
	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Hast du Abitur?");
		String a1 = eingabe.nextLine();
		
		if((a1.equalsIgnoreCase("ja")))
		{
			System.out.println("Bist du wissbegierig?");
			String a2 = eingabe.nextLine();
			
				if((a2.equalsIgnoreCase("ja")))
				{	
					System.out.println("Auf jeden Fall studieren!");		
				}
				else if((a2.equalsIgnoreCase("nein")))
				{		
					System.out.println("Nicht studieren!");
				}
		}
		
		
		if((a1.equalsIgnoreCase("nein")))
		{
			System.out.println("Hast du Fachabitur?");
			String a3 = eingabe.nextLine();
			
				if((a3.equalsIgnoreCase("nein")))
				{		
					System.out.println("Nicht studieren!");
				}
		
				else if((a3.equalsIgnoreCase("ja")))
				{		
					System.out.println("Hast du eine Berufsausbildung?");
					String a4 = eingabe.nextLine();
					
					if((a4.equalsIgnoreCase("nein")))
						{		
							System.out.println("Besser noch studieren!");
						}
						
					else if((a4.equalsIgnoreCase("ja")))
						{		
							System.out.println("Willst du sofort Geld verdienen?");
							String a5 = eingabe.nextLine();
							
							if((a5.equalsIgnoreCase("ja")))
								{		
									System.out.println("Besser noch studieren!");
									String a6 = eingabe.nextLine();
									
									if((a6.equalsIgnoreCase("ja")))
										{		
											System.out.println("Du kannst ja später noch studieren");
										}
								}
							else
								{
									System.out.println("Dann studier doch!");
								}
						}
						
					
				}
		
		}
	}
}