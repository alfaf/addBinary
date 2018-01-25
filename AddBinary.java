class BinarySoup{
	int getDecimal(String s){
		int i, length,pos=0, decimal=0;
		length= s.length();
		for(i=length-1;i>=0;i--){
			if(s.charAt(i)=='1'){
				decimal=decimal+(int)Math.pow(2,pos);
			}
			pos++;
		}

	return decimal;
	}
	
	String getBinary(int bin){
		String binary="";
		int a;

       		while(bin > 0){
            		a = bin % 2;
            		binary = a + "" + binary;
            		bin = bin / 2;
        	}

		return binary;
	}
} 

class AddBinary extends BinarySoup{
	public static void main(String args[]){
		String s1 = "11";
		String s2 = "1";
		String sum = "";
		int a, b, total;

		BinarySoup refVar = new BinarySoup();
		a=refVar.getDecimal(s1);
		b=refVar.getDecimal(s2);

		total=a+b;
		
		sum=refVar.getBinary(total);
			
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Sum in Decimal : "+total);
		System.out.println("Sum in Binary String : "+sum);

	}
}