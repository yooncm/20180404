
public class Ex02 {
	public static void main(String[] args) {
		int[]data={3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{}));//크기가 0인배열
	}

	public static int max(int[] data) {
		if(data==null||data.length==0)
			return -99999;
		int maxValue=0;
		for(int i=0;i<data.length;i++){
			if(maxValue<data[i])
				maxValue=data[i];
		}
		return maxValue;
	}
	

}
