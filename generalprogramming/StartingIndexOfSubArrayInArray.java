package generalprogramming;

public class StartingIndexOfSubArrayInArray {

	public static void main(String[] args) {
		int mainArray[] = {1,2,3,6,5,4,2,3,4,6,5,4,6,5};
		int subArray[] = {6,5,4};
		int index = -1;
		
		if(subArray.length>mainArray.length){
			System.out.println(index);
		}
		mainloop:for(int i = 0; i <mainArray.length; i++){
			if(subArray[0]==mainArray[i]){ //check further
				for(int j=1; j<subArray.length;j++){
					if(i+j<mainArray.length && subArray[j]==mainArray[i+j]){
						if(j==subArray.length-1){
							index=i;
						}
					}
					else{
						continue mainloop;
					}
				}
			}
		}
		System.out.println(index);
	}
}
