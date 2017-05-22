public class Rabbit implements Animals   
{   
    //构造方法   
    public Rabbit(){   
            
    }   
  
    //喂养兔子的策略方法,实现抽象策略中的方法   
    public void feed(){   
        System.out.println("喂兔子吃青菜和萝卜");   
    }   
} 