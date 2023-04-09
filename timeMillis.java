public class timeMillis {
    public static void main(String[] args) {
        int x= 2099999990;
        long start = System.currentTimeMillis();
        while(x<2100000000){
            if(asalSayiMi(x)){
                System.out.printf("%d  sayisi asaldir\n",x);
            }
            x++;
        }
        long end=System.currentTimeMillis();
        System.out.printf("gecen sure %.2f saniye",(double)(end-start)/1000);
    }

    public static boolean asalSayiMi(int x){
            boolean asal = true;
            for(int i=2;i<(x-1)/2;i++){
                if(x%i==0){
                    asal=false;
                    break;
                }
            }
            return asal;
    }
}
