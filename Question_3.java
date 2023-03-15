package codeit_question;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,5,3,8,9,5,1};
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
	}

}
