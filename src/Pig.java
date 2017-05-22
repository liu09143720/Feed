public class Pig implements Animals   
{   
    public Pig(){}   
  
    //喂养猪的策略方法,实现抽象策略中的方法   
    public void feed(){   
        System.out.println("喂猪吃糠和泔水");   
    }   
} 