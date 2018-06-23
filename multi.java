package javaapplication4;

public  class multi extends Thread{
  int i=1;
	public synchronized void run() {
	  while(i<=500) {
		 System.out.println(i);
		 i++;
	  }
	  try {
		Thread.sleep(5000);
	  }catch(Exception e) {
		System.out.println(e);
	  }
	}
public static void main(String[] args) throws Exception {
        multi a=new multi();
        Thread p=new Thread(a);
             p.start();
         Task2 b=new Task2();
             Thread q=new Thread(b);
         p.join();
         q.start();
         q.join();
	}
}
class Task2 extends Thread{
	int i=501;
	public synchronized void run() {
	while(i<=1000) {
			System.out.println(i);
			i++;
		}
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
                    System.out.println(e);
		}
	}
}