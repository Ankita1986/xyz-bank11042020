public class myMorningChallange {
    //intance variables
    int age = 25;
    //static variables
    static String myName = "Ankita";


    // main method
    public static void main(String[] args) {
        myMorningChallange myMorningChallange = new myMorningChallange();
        getMyage();
        myMorningChallange.getMyName();


    }

    //instance method
    public void getMyName() {
        System.out.println(age);
        System.out.println(myMorningChallange.myName);
    }

    //static method
    public static void getMyage() {
        System.out.println(myName);
        myMorningChallange obj = new myMorningChallange();
        System.out.println(obj.age);

    }

}

