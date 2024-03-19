package t2_multiExam1;

public class T1_Mutlti extends Thread {
	int count = 0;
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (Thread.currentThread().getName().equals("mbc")) {
				System.out.println("count : " + count);
				count++;
			}
			System.out.println(i + ". 스레드명 : " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
