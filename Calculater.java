package basic;

public class Calculater {
	public static void main(String args[]) {
		int[]nums= {3,5,7,6,8,1,9,2,4};
		//nums=SelectSort(nums);
		nums=InsertSort(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	//选择排序
	public static int[] SelectSort(int[] nums) {
		int min;
		int temp;
		for(int i=0;i<nums.length;i++) {
			min=i;
			for(int j=i+1;j<nums.length;j++) {//找出剩下项中的最小值
				if(nums[j]<nums[min]) {
					temp=nums[j];
					nums[j]=nums[min];
					nums[min]=temp;
				}
			}
		}
		return nums;
	}
	//插入排序
	public static int[] InsertSort(int[] nums) {
		int  temp;
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<=i;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
		
	}

}
