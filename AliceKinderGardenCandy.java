
import java.util.Arrays;

public class AliceKinderCandy {

	public static void main(String[] args) {

		int rating[] = {7,1,2,1,2,1,2,1};
		int candies = 0;
		int canArray[] = new int[rating.length-1];
		int stu = rating[0];

		Arrays.fill(canArray, 1);
		
		for(int i=0;i<stu;i++){
			if((i+1)<stu){
			if(rating[i+1] > rating[i+2])
				if(canArray[i]<=canArray[i+1])
				canArray[i]++;
			else{
				if(canArray[i+1]==canArray[i])
				canArray[i+1]++;
			}
			}else if(i==stu-1){
				if(rating[stu] > rating[stu-1])
					if(canArray[canArray.length-1]<=canArray[canArray.length-2])
						canArray[canArray.length-1]++;
			}
		}

		System.out.println("Candies for each student in line");
	    for (int i = 0; i < canArray.length; i++) {
            candies += canArray[i];
            System.out.println(canArray[i]);
       }
	   
	   System.out.print("Total Candies: "+candies);    

	}

}
