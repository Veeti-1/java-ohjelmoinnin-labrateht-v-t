import java.util.Arrays;

public class App {
  
   
    public static void main(String[] args) throws Exception {
    
    isEven(3); //tehtävä 1
    sign(5);//tehtävä 2
    describe(-5);//tehtävä 3
    order2(5, 2);//tehtävä 4
    order3(1, 3,5 );//tehtävä 5
    line(2, 18);//tehtävä 6
    table10(1);//tehtävä 7
    check("JAVA123");//tehtävä 8
    login(new String[]{"bo","d","java123"});//tehtävä 9
    average(new int[]{5,10,15});//tehtävä 10
    max(new int[]{1,100,3,500,2,120,500});//tehtävä 10
   
    
}
//tehtävä 1
   static boolean isEven(int n)
       {
        if(n%2==0){
            System.out.println("on parillinen");//testi että toimii
            return true;

        }
            System.out.println("ei parillinen");//testi että toimii

            return false;
    }
    //tehtävä 2
    static String sign(int n){
        if(n <0){
            System.out.println("negatiivinen");
            
        }if(n>0){
            System.out.println("positiivinen");
        }
        if(n==0){
            System.out.println("nolla");
        }
        return null;
    }
    //tehtävä 3
    static String describe(int n){
        if(n<0 ){
            if(n%2==0 ){
            System.out.println("negatiivinen parillinen");

            }else{
            System.out.println("positiivinen pariton");
            
            }

            
        }

        if(n>0){
            if(n%2==0){
            System.out.println("positiivinen parillinen");
            }else{
            System.out.println("positiivinen pariton");

            }
        }
        if(n== 0){
            System.out.println("nolla");
        }
        return null;

    }

    //tehtävä 4
    static String order2(int a, int b){

        int [] numbers = new int[] {a,b};
        Arrays.sort(numbers);
        String vastaus =  Arrays.toString(numbers);
         vastaus = vastaus.replaceAll("\\s+", "");
        vastaus = vastaus.replace("[", "").replace("]","");
        System.out.println(vastaus);
        return null;
    }
          //int max = Arrays.stream(a).max().getAsInt();
    //tehtävä 5
    static String order3(int a, int b, int c){
        int[] nums = new int[] {a,b,c};
       int max = Arrays.stream(nums).max().getAsInt();
       int min = Arrays.stream(nums).min().getAsInt();
       int mid = a+b+c-min-max;
       System.out.println(max+ ""+ ", "+mid + ", " +min);
        
        return null;
    }
    //tehtävä 6
    static String line (int n, int i){
       
       String tulos =  n+""+" x "+i+""+" = "+""+(n*i);
       System.out.println(tulos);
       
        return tulos;
    }
    //tehtävä 7
    static String table10(int n){
        StringBuilder s = new StringBuilder("");
        for(int i = 1; i<= 10; i++){
            s.append(line(n, i));
            
        }
        return null;
    } 
    //tehtävä 8
    static boolean check(String s){
        String oikein = "java123";

        if(oikein.equals(s)){
            System.out.println("oikein");//testi jotta toimii
            return true;
        }
            System.out.println("väärin");//testi jotta toimii
        return false;
    }
    //tehtävä 9
    static String login(String[] tries){
        
        for(int i = 0; i < tries.length && i<3; i++){
            if("java123".equals(tries[i])){
                System.out.println("Tervetuloa");
                return null;
            }
           
        }
        System.out.println("Liian monta yritystä");
        return null;
    }
    //tehtävä 10
    static double average(int[] a){
        int maara = a.length;
        double summa = 0.0;
        if(a.length != 0){
        for(int i:a){
            summa+=i;
        }
        double avg = summa/maara;
        System.out.println(avg);//testi että toimii
        return avg;
    }
        return 0.0;
    }
    static int max(int []a){
        if(a.length !=0){
          int max = Arrays.stream(a).max().getAsInt();
          System.out.println(max);//testi että toimii
          
        }else{
        System.out.println("tyhjä");//testi että toimii
        
        }
        return Integer.MIN_VALUE;
    }
}
