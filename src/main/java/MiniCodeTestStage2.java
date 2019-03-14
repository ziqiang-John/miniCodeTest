public class MiniCodeTestStage2 {
    public static void main(String[] args){
        for(int i= 1;i <= 100;i++){
            if(i%3 == 0||i/10 == 3||i%10 == 3){
                System.out.print("Fizz");
                if(i%5 == 0||i/10 == 5||i%10 == 5){
                    System.out.print("Buzz");
                }
            }else if(i%5 == 0||i/10 == 5||i%10 == 5){
                System.out.print("Buzz");
            }else{
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
