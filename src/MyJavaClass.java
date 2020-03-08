public class MyJavaClass {

    public static int min(int a,int b) {
        if (a<b) return a;
        else return b;
    }

    public static void main(String[] args) {
        MyJavaClass javaClass = new MyJavaClass();
        javaClass.getKtdata();
    }

    public void getKtdata() {
        System.out.println(MySecondFileKt.max(6,10));
        //System.out.println(MySecondFileKt.volume(4,9));
        System.out.println(MySecondFileKt.volume(4,8));
    }

}
