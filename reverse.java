class Solution {
    public int reverse(int x) {
        int z =0;
        int y;
        while(x!=0){
        y = x%10;
        x = (x-y)/10;
        
        if(z> Integer.MAX_VALUE/10 || z== Integer.MAX_VALUE/10 && y>7){
            return 0;
        }
        if(z<Integer.MIN_VALUE/10 || z== Integer.MIN_VALUE/10 && y<-8){
            return 0;
        }
        z = z*10 + y;
        }

        
        return z;
        
    }
}
