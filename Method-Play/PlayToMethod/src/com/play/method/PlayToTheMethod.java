package com.play.methid;

public class PlayToTheMethod {
	public static void main(String[] args)throws Exception {
		System.out.println("Hi This is you Meeting Link..JoinHere!!");
		Thread.sleep(2000);
		Mohamed();
		Thread.sleep(2000);
		System.out.println("End The Meeting...!!");
	}

	public static void Mohamed()throws Exception {
		System.out.println("Mohamed : Hi Abhi and Sai Bro I'm In");
		Thread.sleep(2000);
		Mayavan();
		//Abhi();
		Thread.sleep(2000);
		System.out.println("Mohamed : Deffenetly Bro..we learn well and quick");
		Thread.sleep(2000);
		System.out.println("Mohamed : Bye Guys...!");
		
	}

	private static void Mayavan()throws Exception {
		Thread.sleep(2000);
		System.out.println("Mayavan : Hi Abhi Bro  and Sai Bro i'm Also In!!");
		Abhi();
		Thread.sleep(2000);
		System.out.println("Mayavan : Yes I do My Hard Work To learn Well! Bye Bro..");
	}

	public static void Abhi()throws Exception {
		Thread.sleep(2000);
		System.out.println("Abhi : Hi Mohamed and Mayavan!");
		Thread.sleep(2000);
		System.out.println("Abhi : Hi Sai... What is the Status Of Them?");
		Thread.sleep(2000);
		Sai();
		Thread.sleep(2000);
		System.out.println("Abhi : Okay Sai..and guys keep learning well and utilise this opportunity!!");
		Thread.sleep(2000);
		System.out.println("Abhi : Can i Leave Now..Bye Sai and Bye Bye Guys!!!");
	}

	public static void Sai()throws Exception {
		System.out.println("Sai : Hi Abhi...Awesomely Going On the training Of Them");
		Thread.sleep(2000);
	}
}
