package com.test.Choosesort.Sort;
 
  
public class SortTest {  
    public static void main(String[] args) {  
        int[] num = {23, 64, 15, 3, 93, 30, 51, 28, 49, 66};  
 
        System.out.println("Before sorting： ");  
        showArray(num);
        System.out.println();  //换行，控制格式

        num = BubbleSort(num);  
        // num = ChoiceSort(num);  
        // num = InsertSort(num);
        // num = QuickSort(num, 0, num.length - 1);
      
        System.out.println("After sorting：");  
        showArray(num);
        System.out.println();  //换行，控制格式
    }  
      
      
    private static void showArray(int[] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
 
 
    private static int[] BubbleSort(int[] num) {
        for(int i = 0; i < num.length; i++) {    
            for(int j = 0; j < num.length - 1; j++) {    
                if(num[j] > num[j + 1]) {    
                       int temp = num[j];    
                       num[j] = num[j + 1];    
                       num[j +1] = temp;        
                }    
            }
        }
            return num;
	}
 
 
	 
    private static int[] InsertSort(int[] num) { 
        for(int i = 1; i < num.length; i++) {  
            int temp = num[i];  
            for(int j = i; j > 0; j--) {  
                if(num[j - 1] > temp) {  
                    num[j] = num[j - 1];  
                    num[j - 1] = temp;  
                }  
            }  
        }  
        return num;  
    }  
  

    private static int[] ChoiceSort(int[] num) {  
        for (int i = 0; i < 9; i++) {  
            int min = i;  
            int j;  
            for (j = i + 1; j < num.length; j++) {  
                if (num[min] > num[j]) {  
                    min = j;  
                }  
            }  
            if (min != i) {  
                int temp = num[i];  
                num[i] = num[min];  
                num[min] = temp;  
            }  
        }  
        return num;  
    }
  


    private static int[] QuickSort(int[] num, int i, int j) {  
        // TODO Auto-generated method stub  
        if(i < j) {  
            int middle = portition(num, i, j);  
            QuickSort(num, i, middle - 1);  
            QuickSort(num, middle + 1, j);  
        }  
        return num;  
    }  
  
    private static int portition(int[] num, int low, int high) {  
        int i = low, j = high;  
        int temp = num[i];  
        if (low < high) {  
            while (i < j) {  
                while ((num[j] >= temp) && (i < j)) {  
                    j--;  
                }  
                num[i] = num[j];  
                while ((num[i] <= temp) && (i < j)) {  
                    i++;  
                }  
                num[j] = num[i];  
            }  
            num[i] = temp;  
        }  
        return i;  
    }
}

