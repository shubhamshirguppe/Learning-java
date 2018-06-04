package arrayexample;

public class avvalue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_1 = {3,4,2,7};
		int add=0;
		//int length=array_1.length;
//		for (int i=0;i<array_1.length;i++)
//			add+=array_1[i];
//	double avg=add/array_1.length;
//		System.out.println("addition is:"+avg);
		for (int j: array_1)
		add+=j;
		double avg=add/array_1.length;
		System.out.println("addition is:"+avg);
	}

}
