class DisplayDiag {
  public static void main(String[] args) {

int a[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12}};
int i=0,j=0;
while(i<a[0].length){
    printDiagonal(0,i++,a,a[0].length,a.length);
  if(i!=a[0].length-1)
    System.out.println();
}

i = 0;
int len = a[0].length-1;
while(i<a.length){
    printDiagonal(i++,len,a,a.length,a[0].length);
    System.out.println();
}
}

public static void printDiagonal(int x, int y, int[][] A, int l1, int l2) {
while(x >= 0 && y >= 0 && x < l1 && y < l2)
  System.out.print(A[x++][y--] + " ");
}
}