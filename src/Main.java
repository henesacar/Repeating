public class Main {
    public static void main(String[] args) {
        int[] dizi = {3, 6, 48, 25, 68, 22, 18, 16, 14,6,68,48,22};
        int[] copy = new int[dizi.length];
        int index=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j]) && (dizi[i] % 2 == 0)){
                if(!check(copy,dizi[i])){
                    copy[index++] = dizi[i];}
                break;
                }
            }
        }
        for(int a : copy){
            if(a != 0){
                System.out.println(a);
            }
        }
    }
    static boolean check(int[] arr,int value){
        for (int i : arr){
            if(i == value){
                return true;
            }
        }return false;
    }
}
