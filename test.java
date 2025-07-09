public class test {
    public void main(String[] args) {
        int num1=4;
        int num2=6;
        int ans=0;

        ans=calculation(num1, num2);
        //System.out.println("Hello, World!");
        for(int i=0;i<3;i++){
            System.out.println("いらっしゃいませ、こんにちは");
        }
        System.out.printf("\n%d+%dの答えは%dです\n\n",num1,num2,ans);
    }

    private int calculation(int num1, int num2) {

        int ans=0;
        ans=num1+num2;
        return ans;
    }
}
