import java.util.Scanner;
import java.util.Random;

public class Kyungjin_Jang_Week7Assignment {
	
		
		    public static void main(String[] args){
		        Scanner scan = new Scanner(System.in);
		        System.out.println("\n--------------------------------------------------------");
		        System.out.println("Football Team Randomized Season Scores");
		        System.out.println("--------------------------------------------------------");

		 
		        System.out.print("Enter the number of teams: ");
		        int numberOfTeams = scan.nextInt();
		        System.out.print("Enter the number of games: ");
		        int numberOfGames = scan.nextInt();

		        scan.close();

		        Random random = new Random();
		        int array[][] = new int[numberOfTeams][numberOfGames];
		        
		   
		        for(int i=0;i<numberOfTeams;i++){
		            int total = 0;
		            for(int j=0;j<numberOfGames;j++){
		                array[i][j] = random.nextInt(100); 
		                total = total + array[i][j];
		            }
		        }



		        System.out.println("--------------------------------------------------------");
		        System.out.println("Football Scores Report");
		        System.out.println("Team\tScores                           Tot   Avg");
		        System.out.println("--------------------------------------------------------");

		        int topTeamScore = 0;
		        int topTeam = 0;

		        for(int i=0;i<numberOfTeams;i++){
		            int total = 0;
		            System.out.print((i+1)+":\t");
		            for(int j=0;j<numberOfGames;j++){
		                System.out.print(array[i][j]+" ");
		          
		                total = total + array[i][j];
		            }

		            System.out.print("\t"+total+"   ");
		            System.out.print((total/numberOfGames)+"\n");

		      
		            if(topTeamScore<total){
		                topTeamScore = total;
		                topTeam = i+1;
		            }
		        }

		        System.out.println("--------------------------------------------------------");
		        System.out.println("Top Team: Team "+topTeam);
		        System.out.println("--------------------------------------------------------");
		    }
		
		
		
		
		
	}


