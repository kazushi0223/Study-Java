package bunki;

//public class FizzBuzz {
//    public static void main(String[] args) {
//        for (Integer i = 1; i < 101; i++) {
//            String str = "";
//            if (i % 3 == 0) {
//                str = str + "fizz";
//            }
//            if (i % 5 == 0) {
//                str = str + "buzz";
//            }
//            if (str.equals("")) {
//                str = i.toString();
//            }
//            System.out.println(str);
//        }
//    }
//}

public class FizzBuzz{
    public static void  execute(){
        String ret = "";
        for(Integer i = 1; i <= 100; i ++){
            ret = "";
            if(i % 3 == 0){
              ret = "Fizz";
            }else if(i % 5 == 0){
              ret = "Buzz";
            }else if(i % 3 == 0 && i % 5 == 0){
              ret = "Fizz Buzz";
            }
            else{
              ret = i.toString();
            }
        }
        System.out.println(ret);
    }
    
    public static void main(String[] args){
      FizzBuzz.execute();
    }
  }
