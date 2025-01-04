package variables;

//Variables are locations in memory that have a name (called an identifier) and a type. They resemble 
//named pigeonholes or post office boxes.
// A variable’s type specifies the sort of values it can store/hold

//• byte, short, char, int, and long are known as integral types as they have integer values 
//(whole numbers, positive or negative). For example, -8, 17, and 625 are all integer numbers.

//• char is used for characters – for example ‘a’, ‘b’, ‘?’ and ‘+’. Note that single quotes surround 
//the character. In code, char c = 'a'; means that the variable c represents the letter a. 

//As computers ultimately store all characters (on the keyboard) as numbers internally (binary), 
//we need an encoding system to map the characters to numbers and vice versa. Java uses the 
//Unicode encoding standard, which ensures a unique number for every character, regardless of 
//platform, language, script, and so on. This is why char uses 2 bytes as opposed to 1. In fact, 
//from the computer’s perspective, char c = 'a'; is the same as char c = 97; where 97 
//is the decimal value for ‘a’ in Unicode. Obviously, we as humans prefer the letter representation.
//• short and char both require 2 bytes but have different ranges. Note that short can represent 
//negative numbers, whereas char cannot. In contrast, char can store numbers such as 65,000, 
//whereas short cannot.
//• float and double are for floating-point numbers – in other words, numbers that have 
//decimal places, such as 23.78 and -98.453. These floating-point numbers can use scientific 
//notation – for example, 130000.0 can be expressed as double d1=1.3e+5;, and 0.13 can 
//be expressed as double d2=1.3e-1;.

public class Main {

	public static void main(String[] args) {

//      declaring a variable
//		int age;
//		age = 25;
		
//		shorter way
		int age = 25;
		
				   System.out.println(age);

	}

}
