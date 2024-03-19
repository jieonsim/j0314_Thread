package t5_synchronized;

// 일반 공유 객체
class MyData {
	int data = 10;
	
	public void plusMethod() {
		int myData = data;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		data = myData + 1;
		
	}
}

// 공유 객체를 사용할 스레드 객체 생성
class UseMyData extends Thread {
	MyData myData = new MyData();
	
	@Override
	public void run() {
		myData.plusMethod();
		System.out.println(getName() + " 실행 결과 : " + myData.data);
	}
}


public class Test1_notSync {
	public static void main(String[] args) {
		// 공유 객체를 각각 생성
		// 1. 스레드
		Thread th1 = new UseMyData();
		th1.start();
		
		// 2. 스레드
		Thread th2 = new UseMyData();
		th2.start();

	}
}
