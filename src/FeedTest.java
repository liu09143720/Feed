
public class FeedTest {
	public static void main(String[] args){  
	      
	    Feeder feeder1=new Feeder(new Rabbit());  
	    //喂养兔子  
	    System.out.print("饲养员feeder1:");
	    feeder1.feed();  
	  
	    //喂养猪  
	    Feeder feeder2=new Feeder(new Pig());  
	    System.out.print("饲养员feeder2:");
	    feeder2.feed();  
	  
	    //喂养母鸡  
	    Feeder feeder3=new Feeder(new Hen());  
	    System.out.print("饲养员feeder3:");
	    feeder3.feed();  
	    } 
}
