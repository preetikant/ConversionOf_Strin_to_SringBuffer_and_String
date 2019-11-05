class ConversionOf_Strin_to_SringBuffer_and_StringBuilder{
	public static void main(String[] args){
		String str = "Preeti";
		//conversion String to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
				sbr.reverse();
				System.out.println(sbr);
		StringBuilder sbl = new StringBuilder(str);
				sbl.append("Kant");
				System.out.println(sbl);
	}
}