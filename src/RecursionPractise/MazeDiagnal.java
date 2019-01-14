package RecursionPractise;

import java.util.ArrayList;

public class MazeDiagnal {
	public static void main(String[] args) {
		System.out.println(getmazePathDiag(0, 0, 2, 2));
	}

	public static ArrayList<String > getmazePathDiag(int cr,int cc,int er,int ec){
		//base case
		if(cr==er&&cc==ec) {
			ArrayList<String> br= new ArrayList<>();
			br.add("");
			return br;
		}
		if(cr>er||cc>ec) {
			ArrayList<String> br= new ArrayList<>();
			return br;
		}
		//current case sub problem
		
		ArrayList<String> mr= new ArrayList<>();
		ArrayList<String> rrh=getmazePathDiag(cr, cc+1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H"+rrhs);
		}
		
		ArrayList<String> rrv=getmazePathDiag(cr+1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V"+rrvs);
		}
		//to include diagonal case
		ArrayList<String> rrd=getmazePathDiag(cr+1, cc+1, er, ec);
		for (String rrds : rrd) {
			mr.add("D"+rrds);
		}
		return mr;
	}
}
 