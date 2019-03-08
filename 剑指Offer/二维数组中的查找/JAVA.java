class Solution {
    public boolean Find(int target, int [][] array) {
        int x = array.length;
        if(x==0){
            return false;
        }
        int y = array[0].length;
        if(y==0){
            return false;
        }
        int i = x-1;
        int j = 0;
        while(i>=0&&j<y){
            if(array[i][j]==target){
                return true;
            }else if(array[i][j]>target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}