package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		//creo l'array contenente la lista degli invitati

		String[] invitati= {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};

		//chiedo all'utente il suo nome per verificare se si trova all'interno della lista

		System.out.println("Nome Invitato:");
		Scanner scan= new Scanner(System.in);
		String nomepersona = scan.nextLine();

		for(int i=0; i<invitati.length;i++) {
			if(nomepersona.equals(invitati[i]))
			{ System.out.println("Welcome to the party"); break;}
		 else if(i == invitati.length-1){System.out.println("You aren't invited.I'm sorry but you need to leave.");}}
		
 scan.close();
  }
 }
