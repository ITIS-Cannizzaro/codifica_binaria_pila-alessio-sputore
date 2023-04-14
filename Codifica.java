import java.util.*;
public class Codifica{
	public static void main(String [] args) {
		Stack<Integer> pila=new Stack<Integer>();
		int nBin=420;
		
		while (nBin>0) {
			int resto=nBin%2;
			pila.push(resto);
			nBin=nBin/2;
		}
		while (pila.isEmpty()==false) {
			System.out.println(pila.pop());
		}
	}
	
}