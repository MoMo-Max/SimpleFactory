package oo.com;

import java.util.Scanner;

public class Client {

	
	/**
	 * @auther max
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Api api = Factory.createApi(sc.next());
		//Api api = Factory.createApi(sc.next());
		api.operation("   的燈泡");

	}

}
