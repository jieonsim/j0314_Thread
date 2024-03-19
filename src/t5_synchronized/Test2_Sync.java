package t5_synchronized;
// 멀티스레드는 거의 동기화를 사용하지는 않는다

// 일반 공유 객체
class MyData2 {
	int data2 = 10;
	
	// 메소드 사용을 동기화 처리 : synchronized, 동기화 시키면 해당 메소드가 끝나기 전에는 다른 스레드가 들어올 수 없음
	public synchronized void plusMethod() {
		int myData2 = data2;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		data2 = myData2 + 1;
	}
}

// 공유 객체를 사용할 스레드 객체 생성
class UseMyData2 extends Thread {
	MyData2 myData2;
	
	public UseMyData2(MyData2 myData2) {
		this.myData2 = myData2;
	}
	
	@Override
	public void run() {
		myData2.plusMethod();
		System.out.println(getName() + " 실행 결과 : " + myData2.data2);
	}
}


public class Test2_Sync {
	public static void main(String[] args) {
		// 공유 객체 생성
		MyData2 myData2 = new MyData2();
		
		// 1. 스레드
		Thread th1 = new UseMyData2(myData2);
		th1.setName("th1");
		th1.start();
	
		
		// 2. 스레드
		Thread th2 = new UseMyData2(myData2);
		th2.setName("th2");
		th2.start();
	}
}
