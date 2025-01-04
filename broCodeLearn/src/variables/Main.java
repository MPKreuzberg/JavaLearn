package variables;

/* **************************************************************************************************************
 * variable is a placeholder for a value that behaves as the value it contains
 * data type   size    primitive/reference   value
 * 
 * boolean     1bit    primitive             true/false
 * byte        1byte   primitive             -128 to 127
 * short       2bytes  primitive             -32,768 to 32,767
 * int         4bytes  primitive             -2 billion to 2 billion
 * long        8bytes  primitive             -9 quintillion to 9 quintillion
 * 
 * upper data types can store only whole numbers !!!
 * 
 * **************************************************************************************************************
 * 
 * float       4bytes  primitive             fractional number up to 6-7 digits
 *                                           ex. 3.141592f
 * double      8bytes  primitive             fractional number up to 15 digits
 *                                           ex. 3.141592653589793
 *                                           
 * **************************************************************************************************************                                          
 *                                           
 * char        2bytes  primitive             single character/letter/ASCII value
 *                                           ex. 'f' => always put char in single quotes !!! Common convention !
 * string      varies  reference             a sequence of characters
 *                                           ex. "Hello World"                                        
 * 
 * **************************************************************************************************************                                                                                      
 *                                                                                       
 * DIFF BETWEEN     PRIMITIVE					and					REFERENCE                                                                                      
 *                  8types (boolean, byte..)                        unlimited ( user defined )
 *                  stores data                                     stores an address
 *                  can only hold 1 value                           could hold more than 1 value
 *                  uses less memory                                uses more memory
 *                  fast                                            slower
 *                  
 * **************************************************************************************************************
 * 
 *  int x;          variable declaration
 *  x = 123;        variable assignment
 *  
 *  int x = 123;    variable initialization
*/

public class Main {

	public static void main(String[] args) {

		int x = 123;
		// System.out.println(x);
		System.out.println("My number is: " + x);

		// if we want to use big numbers we use long:

		long y = 123456789098765432L;
		System.out.println(y);

		// if we want to use decimal numbers we use float or double:

		float z = 3.14f;
		double d = 3.14;

		System.out.println(z);
		System.out.println(d);

		// booleans declaration

		boolean b = true;
		System.out.println(b);

		// char declaration:

		char symbol = '@'; // best practice is to use descriptive names
		System.out.println(symbol);

		// String declaration, Strings and everything that is reference data
		// type starts
		// with capital letter

		String name = "Igor";
		System.out.println(name);
		System.out.println("My name is: " + name); // we can use concatenation
													// regularly

	}

}
