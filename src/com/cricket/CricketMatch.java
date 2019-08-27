package com.cricket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.cricket.model.Batsmen;
import com.cricket.model.Bowller;
import com.cricket.model.Teams;

public class CricketMatch {
	
	//Logger logger = Logger.getLogger(CricketMatch.class.getName());

	public static void main(String[] args) {
		
		int firstInningScore = getFirstInningScore();
		System.out.println("Fist Team Score : \t" +firstInningScore);
		Teams teams = getTeamDetails();
		
		System.out.println(teams.getBatsmans() +"\n"+ teams.getBollers());
	}

	private static int getFirstInningScore() {
		// TODO Auto-generated method stub
		int randomInt = ThreadLocalRandom.current().nextInt(30, 90);
		System.out.println("Random number generated is : " + randomInt);
		return randomInt;
	}
	
	private static Teams getTeamDetails() {
		Scanner sc  = new Scanner(System.in);
		List<Batsmen> batsmens = new ArrayList<Batsmen>();
		ArrayList<Bowller> bowllers = new ArrayList<Bowller>();
		Teams team = new Teams();
		System.out.println("Please Enter your batsmen list : ");
		for(int i = 0; i < 5; i++) {
			Batsmen batsmen = new Batsmen();
			batsmen.setBatsman(sc.next());			
			batsmens.add(batsmen);
		}
		
		System.out.println("Please Enter your batsmen list : ");
		for (int i = 0; i < 5; i++) {
			Bowller bowller = new Bowller();
			bowller.setBowllerName(sc.next());
			bowller.setBowllerDLevel(sc.next());
			bowllers.add(bowller);
		}
		team.setBatsmans(batsmens);
		team.setBollers(bowllers);
		return team;
	}
	
	

}
