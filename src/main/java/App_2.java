public class App_2
{
    public static void main(String[] args)
    {
      //  System.out.println(fact(6));
        int twoDim[][] = new int[2][3];
        twoDim[0][0] = 1;
        twoDim[0][1] = 2;
        twoDim[0][2] = 3;
        twoDim[1][0] = 4;
        twoDim[1][1] = 5;
        twoDim[1][2] = 6;

        System.out.println(twoDim[0][0] + " "  + twoDim[0][1] + twoDim[0][2]);
        System.out.println(twoDim[1][0] + " "  + twoDim[1][1] + twoDim[1][2]);
    }



//    public static int fact(int num) {
//        int tmp = 1;   for (int i = 1; i <= num; i++)
//        {      tmp *= i;
//
//        }   return tmp;     }
//
//        public static int findCount(int[] a, int k){
//            int count = 0;
//            for(int e : a){
//                if(e == k){
//                    count++;
//                }
//            }
//            return count;
        }
//}

