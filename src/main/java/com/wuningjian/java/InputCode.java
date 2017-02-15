package com.wuningjian.java;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 分别输出日志和错误到日志文件上
 * */
public class InputCode{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的身份证号码");
		try{
			PrintStream out = System.out;
			PrintStream out_redirect = new PrintStream("./InputCodeLog.txt");
			System.setOut(out_redirect);
			PrintStream err = System.err;
			PrintStream err_redirect = new PrintStream("./InputCodeErr.txt");
			System.setErr(err_redirect);
			String line = scanner.nextLine();
			if(line.length() != 18) {
				System.err.println("身份证号码应为18位");
			}else{
				System.out.println("您输入的身份证号码为" + line);
			}
			System.setOut(out);
			System.setErr(err);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}