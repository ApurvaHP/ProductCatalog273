package com.eshop.pkg;

import java.io.ByteArrayInputStream;
import java.security.MessageDigest;

public class GetSHA1hashed {
	 
public GetSHA1hashed(){
}
 
public String makeSHA1Hash(String input){
 String encrypted ="";
	try{
		MessageDigest md = MessageDigest.getInstance("SHA1");
		md.reset();
		byte[] buffer = input.getBytes();
		md.update(buffer);
		byte[] digest = md.digest();
 
		String hexStr = "";
		for (int i = 0; i < digest.length; i++) {
			hexStr +=  Integer.toString( ( digest[i] & 0xff ) + 0x100, 16).substring( 1 );
		}
		encrypted = hexStr;
	}
	catch(Exception e){}
	return encrypted;
	}
}