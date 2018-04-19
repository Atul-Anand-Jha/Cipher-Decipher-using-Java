package com.pbl.cipher;
import java.util.Scanner;

public class CipherImplement {
	String ins;
	char[] outs;
	char get, put, at, on;

	Scanner KB=new Scanner(System.in);
	public void match(char at){
		this.at=at;
		if(get=='A'){
			get='B';
		}
		else if(get=='B'){
			get='N';
		}
		else if(get=='C'){
			get='Z';
		}
		else if(get=='D'){
			get='2';
		}
		else if(get=='E'){
			get='K';
		}
		else if(get=='F'){
			get='A';
		}
		else if(get=='G'){
			get='9';
		}
		else if(get=='H'){
			get='Q';
		}
		else if(get=='I'){
			get='J';
		}
		else if(get=='J'){
			get='I';
		}
		else if(get=='K'){
			get='D';
		}
		else if(get=='L'){
			get='O';
		}
		else if(get=='M'){
			get='U';
		}
		else if(get=='N'){
			get='1';
		}
		else if(get=='O'){
			get='8';
		}
		else if(get=='P'){
			get='C';
		}
		else if(get=='Q'){
			get='H';
		}
		else if(get=='R'){
			get='5';
		}
		else if(get=='S'){
			get='7';
		}
		else if(get=='T'){
			get='F';
		}
		else if(get=='U'){
			get='M';
		}
		else if(get=='V'){
			get='0';
		}
		else if(get=='W'){
			get='6';
		}
		else if(get=='X'){
			get='E';
		}
		else if(get=='Y'){
			get='P';
		}
		else if(get=='Z'){
			get='T';
		}
		else if(get=='0'){
			get='V';
		}
		else if(get=='1'){
			get='G';
		}
		else if(get=='2'){
			get='4';
		}
		else if(get=='3'){
			get='L';
		}
		else if(get=='4'){
			get='S';
		}

		else if(get=='5'){
			get='W';
		}
		else if(get=='6'){
			get='3';
		}
		else if(get=='7'){
			get='Y';
		}
		else if(get=='8'){
			get='R';
		}
		else if(get=='9'){
			get='X';
		}
	}
	public void scratch(char on){
		this.on=on;
		if(put=='A'){
			put='F';
		}
		else if(put=='B'){
			put='A';
		}
		else if(put=='C'){
			put='P';
		}
		else if(put=='D'){
			put='K';
		}
		else if(put=='E'){
			put='X';
		}
		else if(put=='F'){
			put='T';
		}
		else if(put=='G'){
			put='1';
		}
		else if(put=='H'){
			put='Q';
		}
		else if(put=='I'){
			put='J';
		}
		else if(put=='J'){
			put='I';
		}
		else if(put=='K'){
			put='E';
		}
		else if(put=='L'){
			put='3';
		}
		else if(put=='M'){
			put='U';
		}
		else if(put=='N'){
			put='B';
		}
		else if(put=='O'){
			put='L';
		}
		else if(put=='P'){
			put='Y';
		}
		else if(put=='Q'){
			put='H';
		}
		else if(put=='R'){
			put='8';
		}
		else if(put=='S'){
			put='4';
		}
		else if(put=='T'){
			put='Z';
		}
		else if(put=='U'){
			put='M';
		}
		else if(put=='V'){
			put='0';
		}
		else if(put=='W'){
			put='5';
		}
		else if(put=='X'){
			put='9';
		}
		else if(put=='Y'){
			put='7';
		}
		else if(put=='Z'){
			put='C';
		}
		else if(put=='0'){
			put='V';
		}
		else if(put=='1'){
			put='N';
		}
		else if(put=='2'){
			put='D';
		}
		else if(put=='3'){
			put='6';
		}
		else if(put=='4'){
			put='2';
		}
		else if(put=='5'){
			put='R';
		}
		else if(put=='6'){
			put='W';
		}
		else if(put=='7'){
			put='S';
		}
		else if(put=='8'){
			put='O';
		}
		else if(put=='9'){
			put='G';
		}

	}


	public void encrypt(){
		System.out.println("\n\t\t\t enter ur input:");
		ins= KB.next();
		ins=ins.toUpperCase();
		outs=new char[ins.length()];
		for(int i=0; i<ins.length();i++){
			get=ins.charAt(i);
		 match(get);
		 outs[i]=get;
		}
		System.out.print("***************!!!    ");
		System.out.print(outs);
		System.out.println("    !!!***************");
		//String str=String.valueOf(outs);
        	//return str;
	}

	public void decrypt(){
		System.out.println("\n\n\n\t\t\t enter ur input:\t\t\t");
		ins= KB.next();
		ins=ins.toUpperCase();
		outs=new char[ins.length()];
		for(int i=0; i<ins.length();i++){
			put=ins.charAt(i);
		 scratch(put);
		 outs[i]=put;
		}
		System.out.print("***************!!!    ");
		System.out.print(outs);
		System.out.println("    !!!***************");
		//String str=new String(outs);
		//return str;
	}


}
